package com.Emmy;

import java.sql.*;

public class DataRetrieve extends DatabaseAccess {

//    This class handles the Retrieval of data (Specifically the first and last names of all the users)
//    contained in the created database.
//
//    Firstly, connection is created to the mysql database, accessing it via the access fields of the
//    DataAccess class which the class extends.
//
//    Then, the remaining code send a query for selection of the first and last name of all the
//    users inside the bio_data table. Then it prints out these name to the screen

    public static void retrieveNamesOfUsers() {

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String sql = "SELECT * FROM bio_data";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            while (result.next()){
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                count++;
                System.out.println("User " + count + ": " + firstName + " " + lastName);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Oops, error");
            e.printStackTrace();
        }



    }

}
