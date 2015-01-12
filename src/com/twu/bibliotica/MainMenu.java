package com.twu.bibliotica;

/**
 * Created by kvivek on 10/01/15.
 */
public class MainMenu {

    public MainMenu get(String option) {
        if (option.equals("BookList")){
            return new BookList();
        }
        else if(option.equals("Checkout")){
            return new Checkout();
        }
        else if(option.equals("SubmitBook")){
            return new SubmitBook();
        }
        else if(option.equals("Quit")){
            return new Quit();
        }
        else{
            return new InvalidOption();
        }

    }
    public void execute(Library library){}
}
