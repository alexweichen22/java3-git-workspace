package _java_exe.stringReverse.src.stringreverse;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        //stringReverse();
        validateEmail();
    }

    public static void stringReverse() {
        System.out.println("Enter your string");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = "";
        String[] strArray = str1.split(" ");
        int strArrLen = strArray.length;
        for (int i = strArrLen - 1; i >= 0; i--) {
            str2 = str2 + strArray[i] + " ";
        }
        str2 = str2.trim();
        System.out.println(str2);
    }

    public static void validateEmail() {
        System.out.println("Enter your email");
        Scanner input = new Scanner(System.in);
        String emailAdd = input.nextLine();
        if (!ValidateInput.validateEmail(emailAdd)) {
            System.out.println("Invalid, Enter your email");
            emailAdd = input.nextLine();
        } else {
            System.out.println("Your email is valid, which is: " + emailAdd);
        }
    }

}

