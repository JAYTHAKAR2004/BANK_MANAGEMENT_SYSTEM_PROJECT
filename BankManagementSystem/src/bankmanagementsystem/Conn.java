/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
  public  Statement s;

    public Conn() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystems", "root", "India@143");
            // Create a Statement object for executing queries
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
