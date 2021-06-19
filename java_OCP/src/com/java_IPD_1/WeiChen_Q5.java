package com.java_IPD_1;

import java.util.Scanner;

public class WeiChen_Q5 {
    public static void main(String[] args) {
        // Receive the input string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Password Please");
        String strInput = input.nextLine();

        // Setup Variables
        boolean pswIsValid = true;

        // Check Rule 1 - At least 8 characters
        if (strInput.length() < 8) pswIsValid = false;

        // Check Rule 2 - Password Contains only letters and digits

        int digitCounts = 0;
        for (int i = 0; i < strInput.length(); i++) {
            if (Character.isDigit(strInput.charAt(i))) digitCounts++;          // Calculate how many digits for Rule 3
            if (!Character.isLetterOrDigit(strInput.charAt(i))) pswIsValid = false;
        }

        // Check Rule 3 - Password Contains at least 2 digits
        if (digitCounts < 2) pswIsValid = false;

        // Display the result
        if (pswIsValid) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }

}
