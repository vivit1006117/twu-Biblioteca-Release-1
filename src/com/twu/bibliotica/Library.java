package com.twu.bibliotica;

import java.util.Arrays;
import java.util.List;

public class Library {

   List<Book> books;

    Library(Book... books)
       {
        this.books = Arrays.asList(books);
    }


   // Book books[] = new Book[]{new Book("Head first java", "O'Reilly", "2010", "unavailable"), new Book("Let us C", "Yaswant Kanetker", "2007", "available"), new Book("Complete reference to C++", "Herb Schildt", "2006", "available"), new Book("Ruby on Rails", "David Heinemeier Hansson", "2004", "available"), new Book("Agile development", "Ken Schwaber", "2009", "available")};
    private String value;

    public String getValue() {
        value = null;
        for (int i = 0; i < 5; i++) {
            if (value == null) {
                value = books.get(i).bookName + " " + books.get(i).authorName + " " + books.get(i).publication + " \n ";
            } else {
                value += books.get(i).bookName + " " + books.get(i).authorName + " " + books.get(i).publication + " \n ";
            }
        }
        return value;
    }

    public String isAvailable() {
        String book = "";
        for (int count = 0; count < 5; count++) {
            if (books.get(count).available == "available") {
                book += books.get(count).bookName + " " + books.get(count).authorName + " " + books.get(count).publication + " \n ";
            }
        }
        return book;
    }

    public String availability(String bookName) {
        for (int count = 0; count < 5; count++) {
            if (books.get(count).bookName.equals(bookName)) {
                return books.get(count).available;
            }
        }
        return "That book is not available.";
    }

    public String giveBook(String bookName) {
        for (int count = 0; count < 5; count++) {
            if (books.get(count).bookName.equals(bookName)) {
                books.get(count).issue();
                return books.get(count).available;
            }
        }
        return null;
    }

    public String getBookFromCostumer(String bookToBeReturned) {
        for (int count = 0; count < 5; count++) {
            if (books.get(count).bookName.equals(bookToBeReturned)) {
                return books.get(count).available;
            }
        }
        return "That is not a valid book to return";
    }

    public String takeBook(String bookName) {
        for (int count = 0; count < 5; count++) {
            if (books.get(count).bookName.equals(bookName)) {
                books.get(count).submit();
                return books.get(count).available;
            }
        }
        return null;
    }
}
