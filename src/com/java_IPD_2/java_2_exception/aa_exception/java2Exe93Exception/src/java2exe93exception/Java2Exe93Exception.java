package _java_exe.java2Exe93Exception.src.java2exe93exception;

// Practice Closable -------------------------------------------
import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Java2Exe93Exception {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            s.hasNext();
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        } finally {                                                       // 2 ways to handle resources not controlled by java
            // No.1 -- Close the resource @ finally
            s.close();
        }

        try (Scanner s1 = new Scanner(System.in)) {                      // No.2 -- use "Try-with-resource" to automatially close it
            s1.hasNextLine();
            throw new Exception("Ex from try-with");
        } catch (Exception ex) {
            System.err.printf("%s", ex.getMessage());
        }
    }

//        MyCloseableClass myClass = new MyCloseableClass();
//        try 
//        {              
//            myClass.printMessage("Hello from main");
//
//        } catch (Exception e) {
//            System.out.printf("%s", e.getMessage());            
//        }
//        finally {
//            myClass.close();
//        }
//    class MyCloseableClass implements Closeable {
//
//        @Override
//        public void close() {
//            //
//            try {
//                System.out.println("Close from MyCloseable");
//                throw new IOException("IOException from close()");
//            } catch (IOException ext) {
//                System.err.printf("%s%n", ext.getMessage());
//            }
//        }
//
//        public void printMessage(String message) {
//            System.out.println(message);
//        }
//
//    }
}
