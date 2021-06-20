package _java_exe.JavaExamPrepare2.src.javaexamprepare2;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.lang.Exception;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class JavaExamPrepare2 {
    private static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try{
        output = new Formatter("clients.txt"); //open the file
        }
        catch(SecurityException securityExcep){
            System.err.println("Write permission denied. Terminating...");
        }
        catch (FileNotFoundException fileNotFoundExcep) {
           System.out.println("the file is not existing");
           System.exit(1);
        }
        catch(Exception excep){
            System.out.println("Error");
        }
        
    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n", "Enter Account Number, First Name, Last Name, and Balance.",
                "Enter end-of-file indicator to end input.");
        
        while(input.hasNextInt())   // loop until end-of-file indicator 
        {
            try{
                // output new record to file, assume valid input
                output.format("%d %s %s %.2f%n", input.nextInt(),input.next(),input.next(),input.nextDouble());
                
           }catch(FormatterClosedException formatClsedExcep){
                System.err.println("Error Writing ....");
                break;
            }catch(NoSuchElementException elementExcep){
                System.err.println("Invalid input, try again");
                input.nextLine();
            }
            
//            catch(Exception excep)
//                    {
//                System.err.println("Error, try again");
//                //excep.printStackTrace();
//                input.nextLine();
//                //break;
//            }
        }
        

    }

    public static void closeFile() {
        if(output!=null)output.close();

    }

}
