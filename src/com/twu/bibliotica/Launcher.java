package com.twu.bibliotica;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kvivek on 10/01/15.
 */
public class Launcher {

    public static void main(String arg[]) throws IOException {
        Book books[] = new Book[]{new Book("Head first java", "O'Reilly", "2010", "unavailable"), new Book("Let us C", "Yaswant Kanetker", "2007", "available"), new Book("Complete reference to C++", "Herb Schildt", "2006", "available"), new Book("Ruby on Rails", "David Heinemeier Hansson", "2004", "available"), new Book("Agile development", "Ken Schwaber", "2009", "available")};
        Library library = new Library(books);
        MainMenu menuItem = new MainMenu();
        MainMenu menu = new MainMenu();
        BibliotecaApp showOption=new BibliotecaApp();

        System.out.println(showOption.listOfBooks(library));
        int option=0;
        while (option!=4) {
            showOption.options();
            System.out.println("Enter option to be selected");
            Scanner in = new Scanner(System.in);
            String options=in.nextLine();
            option= Integer.parseInt(options);
            menuItem = menu.get(option);
            menuItem.execute(library);
        }
    }
}
