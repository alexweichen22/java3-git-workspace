package com.java_IPD_1;

import java.util.Scanner;

public class WeiChen_Q1 {
    public static void main(String[] args) {
        // From main method, call each task separately.
        userInput();
    }

    public static void userInput() {
        // task01 - Implement userInput method to receive different type of inputs from user

        // Create a string container for input number (no matter it is integer, double or String)
        Scanner input = new Scanner(System.in);
        String inputString;
        final String EXIT = "exit";
        int continueYorN = 'Y';
        int type;
        int lengthOfInput;

        while (continueYorN == 'Y' || continueYorN == 'y') {
            // Enter input type and number of inputs (exit to end execution)
            System.out.println("Please select your input type");
            System.out.println("1- for int   2- for double   3- for String");
            type = input.nextInt();
            System.out.println("Please define the number of inputs");
            lengthOfInput = input.nextInt();

            // receive the input  -- Type 1 (Integer)
            if (type == 1) {
                int[] intArray = new int[lengthOfInput];
                for (int i = 0; i < lengthOfInput; i++) {
                    System.out.print("Please enter an int: ");
                    inputString = input.next();
                    switch (inputString) {
                        case EXIT:
                            System.out.println("Thank you");
                            i = lengthOfInput - 1;                      // Anytime, enter "exit", set the iterator to end of string index
                            break;
                        default:
                            intArray[i] = Integer.parseInt(inputString);
                            break;
                    }
                }

                // Display the whole array
                for (int i = 0; i < intArray.length; i++) {
                    if (i == 0) System.out.print("[" + intArray[i]);
                    else if (i == intArray.length - 1) System.out.print(", " + intArray[i] + "]\n");
                    else System.out.print(", " + intArray[i]);
                }
            }

            // receive the input  -- Type 1 (Double)
            else if (type == 2) {
                double[] doubleArray = new double[lengthOfInput];
                for (int i = 0; i < lengthOfInput; i++) {
                    System.out.print("Please enter a double: ");
                    inputString = input.next();
                    switch (inputString) {
                        case EXIT:
                            System.out.println("Thank you");
                            i = lengthOfInput - 1;                      // Anytime, enter "exit", set the iterator to end of string index
                            break;
                        default:
                            doubleArray[i] = Double.parseDouble(inputString);
                            break;
                    }
                }

                // Display the whole array
                for (int i = 0; i < doubleArray.length; i++) {
                    if (i == 0) System.out.print("[" + doubleArray[i]);
                    else if (i == doubleArray.length - 1) System.out.print(", " + doubleArray[i] + "]\n");
                    else System.out.print(", " + doubleArray[i]);
                }
            }

            // receive the input  -- Type 3 (String)
            else if (type == 3) {
                String[] stringArray = new String[lengthOfInput];
                for (int i = 0; i < lengthOfInput; i++) {
                    System.out.print("Please enter a string: ");
                    inputString = input.next();
                    switch (inputString) {
                        case EXIT:
                            System.out.println("Thank you");
                            i = lengthOfInput - 1;                      // Anytime, enter "exit", set the iterator to end of string index
                            break;
                        default:
                            stringArray[i] = inputString;
                            break;
                    }
                }

                // Display the whole array
                for (int i = 0; i < stringArray.length; i++) {
                    if (i == 0) System.out.print("[" + stringArray[i]);
                    else if (i == stringArray.length - 1) System.out.print(", " + stringArray[i] + "]\n");
                    else System.out.print(", " + stringArray[i]);
                }
            }

            // Continue or not, Enter Your answer
            System.out.println("Do you Want to continue:  Y  N  ");
            continueYorN = input.next().charAt(0);
            continue;

        }
    }
}
