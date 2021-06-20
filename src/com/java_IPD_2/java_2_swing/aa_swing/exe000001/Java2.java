package _java_exe.java2.src;

import javax.swing.*;
import java.io.IOException;
import java.lang.Exception;
// import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;
//import java.lang.NullPointerException;
//import java.io.IOException;

public class Java2 {
    public static void main(String[] args) {

        // test001ClassExceptionA();
        // test002NestedException();
        // test003Exception();
        // test004ExceptionMidterm();
        test005JFrame();

    }

    // Test JFrame
    public void test004JFrame(){
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(600,400);

        first

        JButton myFirstButton = new JButton();
    }

    // Test Exception java2 midterm
    public static void test004ExceptionMidterm(){
        try {
            //throw new ExceptionB("Type ExceptionB");
            //throw new ExceptionA("Type ExceptionA");
            //throw new Exception("Type Exception");
            //throw new NullPointerException("Type NullPointer");
            throw new IOException("Type IOException");

        }
        catch(NullPointerException nullPE){
            System.out.println(nullPE.getMessage());
        }
        catch(IOException ioExcep){
            System.out.println("Type IOException");
        }
//        catch (ExceptionB exB){
//            System.out.println(exB.getMessage());
//        }catch(ExceptionA exA){
//            System.out.println(exA.getMessage());
//        }


        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    // Test ArithmeticException & MismatchInputException
    public static void test003Exception(){
        int numerator, denominator;
        float quotient;
        boolean isException = true;
        Scanner s = new Scanner(System.in);

        do {
            try {
                System.out.println("Enter the Numerator (integer)");
                numerator = Integer.parseInt(s.next());

                System.out.println("Enter the Denominator (integer)");
                denominator = Integer.parseInt(s.next());

                quotient = numerator / denominator;
                System.out.println("The quotient is:   " + quotient);
                isException = false;
            } catch (ArithmeticException arithExcep) {
                System.err.println("Denominator CAN NOT be 0: ");
                System.out.println("Re-input the numbers: \n");
                continue;

            } catch (NumberFormatException numFormatExcep) {
                System.err.println("Please enter only integer please!! ");
                System.out.println("Re-input the numbers: \n");
                continue;
            } catch (Exception except) {
                System.out.println("Exception mistake unknow");
                System.out.println("Re-input the numbers: \n");
                continue;
            }
        }while (isException);

    }

    // Test Nested Exception.  Exception >>> ExceptionA >>> ExceptionB
    public static void test002NestedException(){
        ExceptionA excepA = new ExceptionA("from Main A console");
        ExceptionB excepB = new ExceptionB();
        excepB.printStackTrace();

        try {
            throw new ExceptionB("throw from main test ExcepB");
            //throw new ExceptionA("throw from main test ExcepA");
            //throw new Exception("throw from main test Excep");
        }
        catch (ExceptionB eB){
            eB.printStackTrace();
            System.out.println("Type ExceptionB: " + eB.getMessage());
        }
        catch (ExceptionA eA){
            eA.printStackTrace();
            System.out.println("Type ExceptionA: " + eA.getMessage());
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Type Exception: " + e.getMessage());
        }


    }

    // Test ExceptionA (Exception + Derived class from Exception)
    public static void test001ClassExceptionA() {
        try {
            // Test Exception class
            System.out.println("####Test 1 Message (Exception) ####");
            Exception exception = new Exception("message_Exception_1");
            System.err.printf("%n%s%n%n", exception.getMessage());
            exception.printStackTrace();

            throw new Exception("message_Exception_2_thrown_from_try");
        }
        catch(Exception ex)
        {
            //System.out.println("What I catch is Test 1 Message");
            System.out.println("####Test 2 Message (Exception) ####");
            System.out.println("\nThis is what I get: " + ex.getMessage());

        }

    }



}
