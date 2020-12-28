package com.java_IPD_1;

public class WeiChen_Q2 {
    public static void main(String[] args) {
        perfectNumber();
    }

    public static void perfectNumber() {
        // Find the Perfect Numbers under 10000
        // Notes: A perfect number is a positive integer that is the sum of all its divisors (not including itself)
        int sum;
        for (int i = 2; i < 10000; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum = sum + j;
            }
            if (sum == i) System.out.println(i);
        }
    }
}
