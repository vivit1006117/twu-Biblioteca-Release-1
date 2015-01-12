package com.twu.bibliotica;

/**
 * Created by kvivek on 10/01/15.
 */
public class BookList extends MainMenu {

    public BookList(){
        super();
    }

    @Override
    public void execute(Library library){
        System.out.println(library.isAvailable());
    }
}
