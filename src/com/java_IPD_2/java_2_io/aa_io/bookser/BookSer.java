package _java_exe.bookSer.src.bookser;

/* 3.	You have a class Book serializable (title, isbn, author, year). 
Create a collection of books in a file library.ser in which you can add 
books using the java.io.ObjectOutputStream object and get a list of books
using the java.io.ObjectInputStream object. */
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookSer {

    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("library.ser")));
        } catch (IOException ioExep) {
            System.err.println("Error Opening file. Terminating ...");
            System.exit(1);
        }

    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n?", "Enter Number, Title, ISBN, AUTHOR, YEAR", "Enter end-of-file indicator to end input");

        while (input.hasNextInt()) {
            try {
                BookRecord bookRecord = new BookRecord(input.nextInt(), input.next(), input.next(), input.next(), input.nextInt());
                output.writeObject(bookRecord);
            } catch (NoSuchElementException elementExcep) {
                System.err.println("Invalid input, Please try again");
                input.nextLine();
            } catch (IOException ioExcep) {
                System.err.println("Error writing. Terminating...");
                break;
            }
            System.out.print("?");
        }

    }

    public static void closeFile() {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioExep) {
            System.err.println("Error closing file. Terminating ... ");
        }

    }

}
