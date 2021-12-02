package com.Emmy;

public class Main {

    public static void main(String[] args) {

        UserInput.takeInput();
        DataInsert.insertUserData();
        System.out.println();
        System.out.println("LIST OF APP USERS");
        System.out.println("=================");
        System.out.println();
        DataRetrieve.retrieveNamesOfUsers();
    }
}
