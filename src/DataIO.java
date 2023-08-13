/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.sql.*;

/**
 *
 * @author Isiah Stevens
 */
public class DataIO {

    //constants
    private final String DATABASE_NAME = "cis355a";
    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    private final String USER_NAME = "root";
    private final String PASSWORD = "admin";

    //add employee
    public void add(Employee emp) throws ClassNotFoundException, SQLException {
        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connect to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        //add record 
        String strSQL = "INSERT INTO landscape (CustomerName, CustomerAddress, "
                + "LandscapeType, YardLength, YardWidth, LandscapeCost) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        pstmt.setString(1, emp.getFirstname());
        pstmt.setString(2, emp.getLastname());
        pstmt.setString(3, emp.getEmpID());
        pstmt.setString(4, emp.getPassword());
        pstmt.setInt(5, emp.getCredentials());

        // execute the prepared statement
        pstmt.execute();

        //close connection 
        conn.close();
    }

    //get Employee list
    public ArrayList<Employee> getEmployeeList() throws SQLException {
        // create the ArrayList so we have something to return
        ArrayList<Employee> list = new ArrayList<Employee>();

        //connect to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        Statement statement = conn.createStatement();
        String SQL = "Select * FROM landscape";
        ResultSet rs = statement.executeQuery(SQL);

        while (rs.next()) {
            // create Customer object and load the attributes
            Employee emp = new Employee();
            emp.setFirstname(rs.getString(1));
            emp.setLastname(rs.getString(2));
            emp.setEmpID(rs.getString(3));
            emp.setPassword(rs.getString(4));
            emp.setCredentials(rs.getInt(5));

            // add the Customer object to our list
            list.add(emp);
        }

        // close the database connection
        conn.close();

        // return the ArrayList
        return list;
    }

    //delete employee
    public void deleteEmployee(String empID) throws SQLException {
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        // delete the record
        String SQL = "DELETE FROM landScape WHERE EmpID = ?";
        PreparedStatement pstmt = conn.prepareStatement(SQL);
        pstmt.setString(1, empID);
        pstmt.execute();

        // close the database connection
        conn.close();
    }
    
    //add item
    public void addItem(Item itm) throws ClassNotFoundException, SQLException {
        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connect to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        //add record 
        String strSQL = "INSERT INTO landscape (CustomerName, CustomerAddress, "
                + "LandscapeType, YardLength, YardWidth, LandscapeCost) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        pstmt.setString(1, itm.getName());
        pstmt.setString(2, itm.getDescription());
        pstmt.setInt(3, itm.getUpc());
        pstmt.setInt(4, itm.getSerialNumber());
        pstmt.setInt(5, itm.getReqCred());

        // execute the prepared statement
        pstmt.execute();

        //close connection 
        conn.close();
    }

    //get Item list
    public ArrayList<Item> getItemList() throws SQLException {
        // create the ArrayList so we have something to return
        ArrayList<Item> list = new ArrayList<Item>();

        //connect to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        Statement statement = conn.createStatement();
        String SQL = "Select * FROM landscape";
        ResultSet rs = statement.executeQuery(SQL);

        while (rs.next()) {
            // create Customer object and load the attributes
            Item itm = new Item();
            itm.setName(rs.getString(1));
            itm.setDescription(rs.getString(2));
            itm.setUpc(rs.getInt(3));
            itm.setSerialNumber(rs.getInt(4));
            itm.setReqCred(rs.getInt(5));

            // add the Customer object to our list
            list.add(itm);
        }

        // close the database connection
        conn.close();

        // return the ArrayList
        return list;
    }

    //delete Item from list
    public void deleteItem(int serialNumber) throws SQLException {
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        // delete the record
        String SQL = "DELETE FROM inventory WHERE serialNumber = ?";
        PreparedStatement pstmt = conn.prepareStatement(SQL);
        pstmt.setInt(1, serialNumber);
        pstmt.execute();

        // close the database connection
        conn.close();
    }
    
    //add order
    public void addOrder(Order ord) throws ClassNotFoundException, SQLException {
        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connect to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        //add record 
        String strSQL = "INSERT INTO landscape (CustomerName, CustomerAddress, "
                + "LandscapeType, YardLength, YardWidth, LandscapeCost) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        pstmt.setInt(1, ord.getOrderNumber());
        pstmt.setObject(2, ord.getOrderOwner());
        pstmt.setObject(3, ord.getOrderItems());
        pstmt.setString(4, ord.getStatus());

        // execute the prepared statement
        pstmt.execute();

        //close connection 
        conn.close();
    }

    //get Order list
    public ArrayList<Order> getOrderList() throws SQLException {
        // create the ArrayList so we have something to return
        ArrayList<Order> list = new ArrayList<Order>();

        //connect to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        Statement statement = conn.createStatement();
        String SQL = "Select * FROM landscape";
        ResultSet rs = statement.executeQuery(SQL);

        while (rs.next()) {
            // create Customer object and load the attributes
            Order ord = new Order();
            ord.setOrderNumber(rs.getInt(1));
            ord.setOrderOwner(rs.getObject(2));
            ord.setOrderItems(rs.getObject(3));
            ord.setStatus(rs.getString(4));

            // add the Customer object to our list
            list.add(ord);
        }

        // close the database connection
        conn.close();

        // return the ArrayList
        return list;
    }

    //delete Item from list
    public void deleteOrder(int orderNumber) throws SQLException {
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);

        // delete the record
        String SQL = "DELETE FROM logs WHERE orderNumber = ?";
        PreparedStatement pstmt = conn.prepareStatement(SQL);
        pstmt.setInt(1, orderNumber);
        pstmt.execute();

        // close the database connection
        conn.close();
    }
}

