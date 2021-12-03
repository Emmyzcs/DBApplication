package com.Emmy;

import java.util.Objects;
import java.util.Scanner;

public class WelcomeScreen {

    public static String insertData = "insert";
    public static String query = "query";
    public static String command = "";

    public static void takeUserCommand() {
        System.out.println("Welcome to this Database Application");
        System.out.println();
        System.out.println("To Insert your bio_data as a user simply enter the command:");
        System.out.println("'Insert'");
        System.out.println("To see the list of all the names of the users of " +
                "this application, simply enter the command: ");
        System.out.println("'Query'");
        System.out.println();
        command = InputPrompt.requestInput("Enter Command! (Insert/Query): ", new Scanner(System.in));

    }


}
