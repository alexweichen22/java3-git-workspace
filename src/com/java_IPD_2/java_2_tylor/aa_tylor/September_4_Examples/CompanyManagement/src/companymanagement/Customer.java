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
public class Customer {
    private String name;
    private String phone;
    private final ArrayList<Order> orders;

    public Customer() {
        this.orders = new ArrayList<>();
    }
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }  

    public ArrayList<Order> getOrders() {
        return orders;
    }
    
    public void addOrder(Order or) {
        this.orders.add(or);
    }
    
    
}
