package _java_exe.datesConvert.src.datesconvert;
/*
2. Dates are printed in several common formats. Two of the more common 
formats are 04/25/1955 and April 25, 1955. Write an application that 
reads a date in the first format and prints it in the second format.
 */
import java.util.Scanner;

public class DatesConvert {

    public static int monthNum;
    public static int dayNum;
    public static int yearNum;
    public static String stringInput;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Date with format MM/DD/YYYY");
        stringInput = input.nextLine();
        monthNum = Integer.parseInt(stringInput.substring(0, 1));
        dayNum = Integer.parseInt(stringInput.substring(3, 4));
        yearNum = Integer.parseInt(stringInput.substring(6, 9));   

        switch (monthNum) {
            case 1:{
                System.out.println("January " + dayNum + ", " + yearNum);
                break;}
            case 2:{
                System.out.println("Feburary " + dayNum + ", " + yearNum);
                break;}                
            case 3:{
                System.out.println("March " + dayNum + ", " + yearNum);
                break;}                
            case 4:{
                System.out.println("April " + dayNum + ", " + yearNum);
                break;}                
            case 5:{
                System.out.println("May " + dayNum + ", " + yearNum);
                break;}                
            case 6:{
                System.out.println("June " + dayNum + ", " + yearNum);
                break;}                
            case 7:{
                System.out.println("July " + dayNum + ", " + yearNum);
                break;}                
            case 8:{
                System.out.println("August " + dayNum + ", " + yearNum);
                break;}                
            case 9:{
                System.out.println("September " + dayNum + ", " + yearNum);
                break;}                
            case 10:{
                System.out.println("October " + dayNum + ", " + yearNum);
                break;}                
            case 11:{
                System.out.println("November " + dayNum + ", " + yearNum);
                break;}                
            case 12:{
                System.out.println("December " + dayNum + ", " + yearNum); 
                break;}                
        }

    }

}
