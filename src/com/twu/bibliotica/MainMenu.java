package com.twu.bibliotica;

/**
 * Created by kvivek on 10/01/15.
 */
public class MainMenu {

    public MainMenu get(int option) {
        if (option==1){
            return new BookList();
        }
        else if(option==2){
            return new Checkout();
        }
        else if(option==3){
            return new SubmitBook();
        }
        else if(option==4){
            return new Quit();
        }
        else{
            return new InvalidOption();
        }

    }
    public void execute(Library library){}
}
