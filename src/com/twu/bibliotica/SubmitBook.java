package com.twu.bibliotica;

import java.util.Scanner;

/**
 * Created by kvivek on 12/01/15.
 */
public class SubmitBook extends MainMenu {

    public SubmitBook(){
        super();
    }

    @Override
    public void execute(Library library){
        System.out.println("Enter book name to be checked out");
        Scanner in = new Scanner(System.in);
        String enteredBookName = in.nextLine();
        System.out.println(new Customer().returnBook(enteredBookName, library));
    }


}
