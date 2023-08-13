/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rysk
 */
public class Item {
    
    //attributes
    private String name;
    private String description;
    private int upc;
    private int serialNumber;
    private int reqCred;
    
    //constructors

    public Item() {
        name = "Null";
        description = "Null Item";
        upc = 0;
        serialNumber = 0;
        reqCred = 0;
    }

    public Item(String name, String description, int upc, int serialNumber, int reqCred) {
        this.name = name;
        this.description = description;
        this.upc = upc;
        this.serialNumber = serialNumber;
        this.reqCred = reqCred;
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getReqCred() {
        return reqCred;
    }

    public void setReqCred(int reqCred) {
        this.reqCred = reqCred;
    }
    
}
