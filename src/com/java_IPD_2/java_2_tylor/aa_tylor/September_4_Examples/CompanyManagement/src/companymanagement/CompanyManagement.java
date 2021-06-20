/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.September_4_Examples.CompanyManagement.src.companymanagement;

import java.util.Scanner;

/**
 *
 * @author 1896217
 */
public class CompanyManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Product p1 = new Product();
        p1.setName("Yeast");
        p1.setDescription("Good for baking and brewing.");
        p1.setPrice(5.50);
        
        Product p2 = new Product();
        p2.setName("Bacteria");
        p2.setDescription("Good for yogurt.");
        p2.setPrice(19.99);

        Customer cust;        
        System.out.println("Is this a business? Y/N");
        if (s.nextLine().equals("Y")) {
            cust = new Business();
            System.out.println("Please enter contact name:");
        }
        else
            cust = new Individual();

        System.out.println("Please enter customer name: ");
        cust.setName(s.nextLine());
        System.out.println("Please enter customer phone: ");
        cust.setPhone(s.nextLine());       
        
        Order ord = new Order();
        System.out.println("Please enter an order number: ");
        ord.setOrderId(s.nextInt());
        s.nextLine();
        ord.setCust(cust);
        
        System.out.println("Do you want yeast? Y/N");
        if (s.nextLine().equals("Y"))
            ord.addProduct(p1);
        
        System.out.println("Do you want bacteria? Y/N");
        if (s.nextLine().equals("Y"))
            ord.addProduct(p2);
        
        cust.addOrder(ord);
        
        System.out.printf(
            "Order number %d\nPlaced by %s - %s\n",
            ord.getOrderId(),
            ord.getCust().getName(),
            ord.getCust().getPhone()
        );
        
        double total = 0.0;        
        
        for (Product prod : ord.getProducts()) {
            total += prod.getPrice();
            
            System.out.printf("%s - (%s) - %.2f\n", 
                prod.getName(),
                prod.getDescription(),
                prod.getPrice()
            );
        }
        
        System.out.println("The total is: $" + total);
    }
    
}
