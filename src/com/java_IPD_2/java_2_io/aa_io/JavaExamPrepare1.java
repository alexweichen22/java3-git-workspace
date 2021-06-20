package _java_exe.javaExamPrepare1.src.javaexamprepare1;
// Files

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.DirectoryStream;

public class JavaExamPrepare1 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your File or Directory");

        // Create Path Object based on user input
        Path path = Paths.get(input.nextLine());
        try {
            System.out.println("\nfilename ==  " + path.getFileName());
            System.out.println("path root ==  " + path.getRoot());
            System.out.println("getName(0)  ==  " + path.getName(0));
            System.out.println("getName(1)  ==  " + path.getName(1));
            System.out.println("getName(2)  ==  " + path.getName(2));
            System.out.println("getName(3)  ==  " + path.getName(3));
            System.out.println("getName(4)  ==  " + path.getName(4));
            System.out.println("path =" + path);

        } catch (Exception exp) {
            System.out.println("\nNo level 4 directory");
        }
        
        // path Existing or not
        if (Files.exists(path))System.out.println("\nExisting Path");
        else    System.out.println("\nNot Existing Path");
        
        // path isDirectory or not (For existing path, if not directory, it is a file)
        if(Files.isDirectory(path)) System.out.println("It is directory");
        else System.out.println("It is a file, not directory");
        
               
        // path isAbsolute or not
        if(path.isAbsolute()) System.out.println("This is absolute path");
        else System.out.println("It is not absolute path");
        
        // check last modified time
        System.out.println(Files.getLastModifiedTime(path));
        
        // DirectoryStream
        // if the path is a directory, directoryStream contains all files/folders under that directory
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

        for(Path p: directoryStream){
            System.out.println(p);          // this is to print all files/directory names under directoryStream folder
        }
        
        
        
        

    }
}
