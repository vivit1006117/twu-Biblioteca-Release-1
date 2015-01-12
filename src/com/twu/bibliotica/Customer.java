package com.twu.bibliotica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kvivek on 11/01/15.
 */
public class Customer {

    public String checkOutBook(String bookName, Library library) {
        if (new Librarian().isAvailable(bookName, library).equals("available")) {
            if (new Librarian().wantToCheckOut(bookName, library) == "unavailable") {
                return "Thank you! Enjoy the book";
            }
        }
            return "That book is not available.";
    }

    public String returnBook(String bookName, Library library) {
        if (new Librarian().returnedBook(bookName, library).equals("unavailable")) {
            if (new Librarian().submittedSuccessfully(bookName, library) == "available") {
                return "Thank you for returning the book.";
            }
        }
            return "That is not a valid book to return.";
    }
}
