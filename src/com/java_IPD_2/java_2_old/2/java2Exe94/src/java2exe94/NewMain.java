package _java_exe.java2Exe94.src.java2exe94;
import java.io.IOException;
public class NewMain {

    public static void main(String[] args) {
//        try {
//            throw new ExceptionC("\nExceptionC message");
//        } catch (ExceptionC ex) {
//            System.err.printf("%s%n", ex.getMessage());
//            ex.printStackTrace();
//        } 
        
        Exception excep1 = new Exception();
        System.err.printf("%s%n", excep1.getMessage());
    }
}
