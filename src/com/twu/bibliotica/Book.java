
package com.twu.bibliotica;

public class Book {
    String bookName;
    String authorName;
    String publication;
    String available;

    public Book(String bookName, String authorName, String publication, String available) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publication = publication;
        this.available = available;
    }


    public String getDetails() {
        return (bookName + " " + authorName + " " + publication);
    }

    public void issue() {
        this.available = "unavailable";
    }

    public void submit() {
        this.available = "available";
    }
}

