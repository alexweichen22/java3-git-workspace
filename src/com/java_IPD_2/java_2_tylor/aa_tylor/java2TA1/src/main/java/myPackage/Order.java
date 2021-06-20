package _java_exe.java2TA1.src.main.java.myPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6151742
 */
import java.util.Date;
public class Order {
    private int orderId;
    //private Date orderDate;
    private Customer cust;   // composition!
    private Product[] products;

    public int getOrderId() {
        return orderId;
    }

    public Customer getCust() {
        return cust;
    }

    public Product[] getProducts() {
        return products;
    }
    
    
    
    
}
