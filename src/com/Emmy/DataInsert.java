package com.Emmy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataInsert extends DatabaseAccess {

//    This class handles the insertion of the temporarily stored data in the fields of the UserInput
//    class into their respective columns, in the created database. It does this through the class
//    method called insertUserData().
//
//    Firstly, connection is created to the mysql database, accessing it via the access fields of the
//    DataAccess class which the class extends.
//
//    Then, the remaining code sends a query for insertion of the bio_data fields values of the UserInput
//    class inside a row in the bio_data table.

    public static void insertUserData() {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String sql = "INSERT INTO bio_data (first_name, " +
                    "last_name, age, email, " +
                    "mobile_number, gender, address) " +
                    "VALUE (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, UserInput.firstName);
            statement.setString(2, UserInput.lastName);
            statement.setString(3, UserInput.age);
            statement.setString(4, UserInput.email);
            statement.setString(5, UserInput.mobileNumber);
            statement.setString(6, UserInput.gender);
            statement.setString(7, UserInput.address);



            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("A row has been inserted!");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Oops, error");
            e.printStackTrace();
        }

    }

}
