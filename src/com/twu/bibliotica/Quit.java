package com.twu.bibliotica;

/**
 * Created by kvivek on 12/01/15.
 */
public class Quit extends MainMenu {

    public Quit(){
        super();
    }

    @Override
    public void execute(Library library){
        System.out.println("Quit");
        System.exit(0);
    }

}
