package com.twu.bibliotica;

import java.util.List;

/**
 * Created by kvivek on 10/01/15.
 */
public class BibliotecaApp {

    public String welcomeMessage() {
        return "Welcome to library";
    }

    public String listOfBooks(Library book) {
        if (book.getValue() != null) {
            return welcomeMessage();
        } else {
            return emptyList();
        }
    }

    public void options() {
        System.out.println("1. BookList");
        System.out.println("2. Checkout");
        System.out.println("3. SubmitBook");
        System.out.println("4. Quit");
    }

    public String emptyList() {
        return "Empty";
    }

}
