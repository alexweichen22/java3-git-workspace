package _java_exe.java2Exe91ExceptionHandling.src.java2exe91exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed

        do {
            try // read two numbers and calculate quotient
            {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false; // input successful; end looping
            } 
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n",inputMismatchException);
                scanner.nextLine(); // discard input so user can try again
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            } 
            finally{             // FINALLY: --(Terminate resources) (Call objectX.close & IClosable & File.close)--- Good place to kill the files (gabage collector like)--- for memory clerance purpose
                System.out.println("Thank you, that is all!");}   
//            catch(Exception exceptionOfAll){
//                System.out.println("Exception!!!!!!!!");
//                continue;
//            }
//            
        } while (continueLoop);
    }
}
