/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.September_4_Examples.CompanyManagement.src.companymanagement;

import java.util.ArrayList;

/**
 *
 * @author 1896217
 */
public class Order {
    private int orderId;
    private Customer cust;
    private final ArrayList<Product> products;
    
    public Order() {
        products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCust() {
        return cust;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public void addProduct(Product prod) {
        this.products.add(prod);
    }
    
    
}
