package com.java_IPD_1;

import java.util.Scanner;
import java.lang.Math;

public class WeiChen_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int intInput = input.nextInt();
        if (isPalindrome(intInput)) System.out.println("YES, it is Palindrome");
        else System.out.println("NO, it is NOT Palindrome");
    }

    public static boolean isPalindrome(int number) {
        // Return true if number is a palindrome

        // Call reverse method to calculate the reverse integer
        if (number==reverse(number)) return true;
        else return false;
    }

    public static int reverse(int number) {
        // Return the reversal of an integer, i.e., reverse (456) returns 654

        // Calculate how many digits
        int numberTemp1 = number;
        int digitCounts=0;
        for(int i=0;i<10;i++){
            if(numberTemp1!=0) digitCounts++;
            numberTemp1 /= 10;
        }

        // Calculate the reverse number
        int numberTemp2 = number;
        int numberTemp3 = number;
        int numReverse = 0;
        for(int i=0;i<digitCounts;i++){
            numberTemp2 = numberTemp3%10;
            numberTemp3 = numberTemp3/10;
            numReverse = numReverse + (numberTemp2)*(int)Math.pow(10,(digitCounts-1-i));
        }

        // Display the original & reverse number
        System.out.println("\n" + number + " --- is the original number");
        System.out.println(numReverse + " --- is its reverse number \n");
        return numReverse;
    }
}
