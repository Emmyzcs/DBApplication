package com.Emmy;

import java.util.Scanner;

public class InputPrompt {

//    The class has a method that basically prompt the user for a string value and then it
//    returns the value.

    public static String requestInput(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
