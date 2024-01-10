package com.parsing;

public class Post {
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public java.lang.String getDetailsLink() {
        return detailsLink;
    }

    public void setDetailsLink(java.lang.String detailsLink) {
        this.detailsLink = detailsLink;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public java.lang.String getAuthorDetailsLink() {
        return authorDetailsLink;
    }

    public void setAuthorDetailsLink(java.lang.String authorDetailsLink) {
        this.authorDetailsLink = authorDetailsLink;
    }

    public java.lang.String getDateOfCreated() {
        return dateOfCreated;
    }

    public void setDateOfCreated(java.lang.String dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }



    public java.lang.String getArticleFullText() {
        return articleFullText;
    }

    public void setArticleFullText(java.lang.String articleFullText) {
        this.articleFullText = articleFullText;
    }


    private String title;
    private String detailsLink;
    private String author;
    private String authorDetailsLink;
    private String dateOfCreated;
    private String articleFullText;

    @Override
    public String toString() {
//        return "Post{"+
//                "title='" + title + '/'' +
        return "Post{" +
                "title='" + title + '\'' +
                ", detailsLink='" + detailsLink + '\'' +
                ", author='" + author + '\'' +
                ", authorDetailsLink='" + authorDetailsLink + '\'' +
                ", dateOfCreated='" + dateOfCreated + '\'' +
                ", articleFullText='" + articleFullText + '\'' +
                '}';
    }
}



