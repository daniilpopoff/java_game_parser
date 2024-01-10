package com.parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */

//i need to follow by link of article collect in this html full text author title ect
public class App 
{
    public static void main(String[] args) throws IOException {
        List<Post> posts = new ArrayList<>();
        System.out.println("Подключение к главной странице...");
        String mainLink = "https://stopgame.ru";
        String manyArticlesLink = "https://stopgame.ru/review";
        Document doc = Jsoup.connect(manyArticlesLink).get();
        Elements articles = doc.select("div[data-key] > article._card_6bcao_1" );

        for (Element article : articles) {
            Post post = new Post();
            String articleLink = article.select("a").attr("href");
            post.setDetailsLink(mainLink + articleLink);
            Document articleDetail = Jsoup.connect(post.getDetailsLink()).get();
            String title = articleDetail.selectFirst("h1").text();
            post.setTitle(title);
            String articleText = articleDetail.select("[class*=_text-width_1jfi9_108]").text();
            post.setArticleFullText(articleText);
            String authorLink = articleDetail.selectFirst("a._user-info_pxqm4_1116").attr("href");
            post.setAuthorDetailsLink(authorLink);
            String authorName = articleDetail.selectFirst("span._user-info__name_pxqm4_1137").text();
            post.setAuthor(authorName);
            String dateOfCreated = articleDetail.getElementsByClass("_date_1jfi9_587 _date--full_1jfi9_1").text();
            post.setDateOfCreated(dateOfCreated);
//            System.out.println(dateOfCreated);
            posts.add(post);
            posts.forEach(System.out::println);


        }


//        for (Element postTitleElement : postTitleElements) {
//            String detailsLink = postTitleElement.attr("href");
//            Post post = new Post();
//            post.setDetailsLink(detailsLink);
//            post.setTitle(postTitleElement.attr("title"));
//            System.out.println("Подключение к деталям о посте: " + detailsLink);
//            Document postDetailsDoc = Jsoup.connect(detailsLink).get();
//            try {
//                Element authorElement = postDetailsDoc.getElementsByClass("name").first().child(0);
//                post.setAuthor(authorElement.text());
//                post.setAuthorDetailsLink(authorElement.attr("href"));
        //
//                post.setDateOfCreated(postDetailsDoc.getElementsByClass("date").first().text());
//            } catch (NullPointerException e) {
//                post.setAuthor("Автора нет");
//                post.setAuthorDetailsLink("Ссылки нет");
//                post.setDateOfCreated("Даты создания нет");
//            }
//            posts.add(post);
//        }
//        posts.forEach(System.out::println);
    }
}

