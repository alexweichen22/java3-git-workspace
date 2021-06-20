package _java_exe.bookSer.src.bookser;
import java.io.Serializable;
public class BookRecord implements Serializable{
    private int number,year;
    private String title,isbn,author;  
    public BookRecord(int number,String title,String isbn,String author, int year){
        this.number=number;
        this.title=title;
        this.isbn=isbn;
        this.author=author;
        this.year=year;
    }    
    //Getter
    public int getNumber(){
        return number;
    }
    public String getTitle(){
        return title;
    }
    public String getIsbn(){
        return isbn;
    }

    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }    
        //Setter
    public void setNumber(int number){
        this.number=number;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setYear(int year){
        this.year=year;
    }    
}
