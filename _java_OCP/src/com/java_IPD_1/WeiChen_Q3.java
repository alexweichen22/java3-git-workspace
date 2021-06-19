package com.java_IPD_1;

import java.util.Scanner;

public class WeiChen_Q3 {
    public static void main(String[] args) {
        // Receive input of two strings
        Scanner read = new Scanner(System.in);
        String stringInput1, stringInput2;
        System.out.println("Enter string1");
        stringInput1 = read.nextLine();
        System.out.println("Enter string2");
        stringInput2 = read.nextLine();

        // Call Method to print longest common prefix
        longestCommonPrefix(stringInput1, stringInput2);
    }

    public static void longestCommonPrefix(String str1, String str2) {

        // Calculate the length of shorter string
        int lengthOfShortString;
        if (str1.length() <= str2.length()) lengthOfShortString = str1.length();
        else lengthOfShortString = str2.length();

        // Compare the 2 strings
        int i = 0;
        while (str1.charAt(i) == str2.charAt(i)) {
            i++;
        }

        // Display the common prefix
        if (i == 0) System.out.println("There is no common prefix");
        else {
            System.out.println("The Common Prefix of Two strings is: ");
            for (int j = 0; j < i; j++) System.out.print(str1.charAt(j));
        }
    }
}

