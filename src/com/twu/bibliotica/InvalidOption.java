package com.twu.bibliotica;

/**
 * Created by kvivek on 12/01/15.
 */
public class InvalidOption extends MainMenu {
    @Override
    public void execute(Library library){
        System.out.println("Select a valid option!");
    }

}
