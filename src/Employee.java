/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rysk
 */
public class Employee {
    
    //attributes
    private String firstname;
    private String lastname;
    private String empID;
    private String password;
    private int credentials;
    
    //constructors

    public Employee() {
        firstname = "Null_First";
        lastname = "Null_Last";
        empID = "Null";
        password = "Null";
        credentials = -1;
    }

    public Employee(String firstname, String lastname, String empID, String password, int credentials) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.empID = empID;
        this.password = password;
        this.credentials = credentials;
    }
    
    //getters and setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredentials() {
        return credentials;
    }

    public void setCredentials(int credentials) {
        this.credentials = credentials;
    }
    
}
