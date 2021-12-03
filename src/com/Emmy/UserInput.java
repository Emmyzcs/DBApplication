package com.Emmy;

import java.util.Scanner;

public class UserInput {

//    This class handles the reading of a user input (bio_data), and it stores the values received
//    temporarily in the assigned variable. These values will be eventually transferred to the
//    created database The class is dependent on the requestInput() method of the InputPrompt
//    class created in this package (com.emmy package).


    public static String firstName, lastName, age, email, mobileNumber, address, gender;

    public static void takeInput() {

        System.out.println();
        firstName = InputPrompt.requestInput("Enter your first name: ", new Scanner(System.in));
        lastName = InputPrompt.requestInput("Enter your last name: ", new Scanner(System.in));
        age = InputPrompt.requestInput("Enter Your age: ", new Scanner(System.in));
        email = InputPrompt.requestInput("Enter your email address: ", new Scanner(System.in));
        mobileNumber = InputPrompt.requestInput("Enter your mobile number: ",new Scanner(System.in));
        gender = InputPrompt.requestInput("Gender, male/female: ", new Scanner(System.in));
        address = InputPrompt.requestInput("Enter your address: ", new Scanner(System.in));
    }
}
