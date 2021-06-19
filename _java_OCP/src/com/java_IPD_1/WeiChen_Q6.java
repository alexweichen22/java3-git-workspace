package com.java_IPD_1;

import java.util.Scanner;
import java.lang.Math;

public class WeiChen_Q6 {
    public static void main(String[] args) {
        // Hangman Game - Randomly Generate a Word and Ask to Guess the word

        // Generate a random length of letters (4-10)
        int lenOfWord = (int) (4 + Math.random() * 7);

        // Generate a random string array with length of "lenOfWord"
        int[] wordRandom = new int[lenOfWord];
        int[] wordDisplay = new int[lenOfWord];
        for (int i = 0; i < lenOfWord; i++) {
            wordRandom[i] = (int) ('a' + (Math.random() * ('z' - 'a' + 1)));
            wordDisplay[i] = (int) '*';
        }

        // Declare variables for the Random Word
        int[] letterCount = new int['z' - 'a' + 1];    // How many times a letter appear in the wordRandom
        int nonRepeatLetterCounts = 0;

        // Declare variables for the guess
        int[] letterCorrectRepeat = new int['z' - 'a' + 1]; // If the letter has already been guessed
        int totalCorrectNoRepeatCounts = 0;
        int guess;

        // Check the wordRandom - count the occurrence of each letter
        System.out.println("\n----------------------------------------------");
        for (int i = 0; i < lenOfWord; i++) {
            letterCount[wordRandom[i] - 'a']++;
        }

        // Calculate how many non-repeat letters appear in the right word
        for (int i : letterCount) {
            if (i != 0) nonRepeatLetterCounts++;
        }

        // Display the info about the Random word - Supposed to be hidden!
        System.out.println("This Section is to display the info of the correct word in testing mode, which is supposed to be hidden to user");
        System.out.print("The length is ............  " + lenOfWord + "\nThis word is .............  ");
        for (int i : wordRandom) {
            System.out.print((char) i);
        }
        System.out.println("\nNon-repeat Letters .......  " + nonRepeatLetterCounts);
        System.out.println("----------------------------------------------");

        //
        Scanner input = new Scanner(System.in);
        while (totalCorrectNoRepeatCounts < nonRepeatLetterCounts) {
            System.out.print("(Guess) Enter a letter in word ");
            for (int i : wordDisplay) {
                System.out.print((char) i);
            }
            System.out.println(" > ");
            guess = (int) (input.nextLine().charAt(0));
            if (letterCount[guess - 'a'] == 0) {
                System.out.print("\n" + (char) guess + " is not in the word \n");
                continue;
            } else {
                letterCorrectRepeat[guess - 'a']++;
                if (letterCorrectRepeat[guess - 'a'] > 1) {
                    System.out.println((char) guess + " is already in the word");
                    continue;
                } else if (letterCorrectRepeat[guess - 'a'] == 1) {
                    totalCorrectNoRepeatCounts++;
                    for (int i = 0; i < lenOfWord; i++) {
                        if (wordRandom[i] == guess) wordDisplay[i] = guess;
                    }
                }
            }
        }

        // Congratulation greetings for completion and right answer
        System.out.println("Congratulations, you are right, the answer is:  ");
        for (int i : wordDisplay) {
            System.out.print((char) i);
        }
    }
}
