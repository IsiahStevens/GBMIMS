/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rysk
 */
public class Order {
    
    //attributes
    private int orderNumber;
    private Employee orderOwner;
    private Item[] orderItems;
    private String status;
    
    //constructors

    public Order(){
        orderNumber = 0;
        orderOwner = null;
        orderItems = null;
        status = "Null";
    }

    public Order(int orderNumber, Employee orderOwner, Item[] orderItems, String status) {
        this.orderNumber = orderNumber;
        this.orderOwner = orderOwner;
        this.orderItems = orderItems;
        this.status = status;
    }
    
    //getters and setters

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Employee getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(Employee orderOwner) {
        this.orderOwner = orderOwner;
    }

    public Item[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Item[] orderItems) {
        this.orderItems = orderItems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
