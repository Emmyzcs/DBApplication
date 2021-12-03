package com.Emmy;

public class Main {

    public static void main(String[] args) {

        WelcomeScreen.takeUserCommand();
        while (true) {
            if (WelcomeScreen.command.toLowerCase().equals(WelcomeScreen.insertData)) {
                UserInput.takeInput();
                DataInsert.insertUserData();
                break;
            } else if (WelcomeScreen.command.toLowerCase().equals(WelcomeScreen.query)) {
                System.out.println();
                System.out.println("LIST OF APP USERS");
                System.out.println("=================");
                System.out.println();
                DataRetrieve.retrieveNamesOfUsers();
                break;
            } else WelcomeScreen.takeUserCommand();
        }
    }
}
