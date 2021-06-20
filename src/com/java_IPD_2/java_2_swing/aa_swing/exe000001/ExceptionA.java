package _java_exe.java2.src;

public class ExceptionA extends Exception {
    ExceptionA(String messageA) {
        super(messageA);
    }
}

class ExceptionB extends ExceptionA {
    ExceptionB(){
        super("Message from default Constructor of ExceptionB");
        }
    ExceptionB(String messageB) {
        super(messageB);
    }

}


