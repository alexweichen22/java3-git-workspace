package xxx.java3;

public class TestUtil {
	
	public static void main(String[] args) {
		System.out.println("Hello World-----" + (new java.util.Date()));
	}
	
	public static String returnBookName(String bookName) {
		
		return (addHr()+"This book is:" 
		+ returnH1(bookName) + 
		addBr()+ "This book is checked in On:" + 
		addBr() + (new java.util.Date()).toString().toLowerCase());
	}
	
	public static String returnH1(String data) {
		return ("<h1>"+data+"</h1>");
	}
	
	public static String addBr() {
		return "<br/>";
	}
	
	public static String addHr() {
		return "<hr/>";
	}
}
