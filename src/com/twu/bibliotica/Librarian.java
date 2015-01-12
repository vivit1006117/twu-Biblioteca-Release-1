package com.twu.bibliotica;

import java.io.IOException;

/**
 * Created by kvivek on 11/01/15.
 */
public class Librarian {

 /*   private MainMenu[] menu;


    public Librarian(MainMenu[] menu) {
        this.menu = menu;
    }

    public Librarian() {

    }

    public String optionSelected(int option) throws IOException {
        menu[option].optionSelected(option);
        return null;
    }*/


   /* public void options() {
        System.out.println("1. BOOK LIST");
        System.out.println("2. Checkout book");
        System.out.println("3. Submit book");
        System.out.println("4. QUIT");
    }*/

    public String isAvailable(String bookName,Library library) {
        return library.availability(bookName);
    }

    public String wantToCheckOut(String bookName,Library library) {
        return library.giveBook(bookName);
    }

    public String returnedBook(String bookToBeReturned,Library library) {
        return library.getBookFromCostumer(bookToBeReturned);
    }

    public String submittedSuccessfully(String bookName,Library library) {
        return library.takeBook(bookName);
    }

}
