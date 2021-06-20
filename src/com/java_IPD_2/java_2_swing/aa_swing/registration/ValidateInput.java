package _java_exe.registrationTest.src.registrationtest;

public class ValidateInput {

    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("[A-Z][a-zA-Z]*");
    }
    
    public static boolean validateEmail(String email) {
        return email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
    }  
    
    public static boolean validateEmailReType(String email1, String email2){
        return (email1==email2);
    }
}
