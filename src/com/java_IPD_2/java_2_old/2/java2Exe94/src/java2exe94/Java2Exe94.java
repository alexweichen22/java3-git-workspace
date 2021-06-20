package _java_exe.java2Exe94.src.java2exe94;
// Exe 11.16 Exception

import java.io.IOException;

public class Java2Exe94 extends Exception {

    public Java2Exe94(String message) {
        super(message + "\n ExceptionA message");
    }

}

class ExceptionB extends Java2Exe94 {

    public ExceptionB(String message) {
        super(message + "\n ExceptionB message");
        

    }
}

    class ExceptionC extends ExceptionB {

        public ExceptionC(String message) {
            super(message + "\n ExceptionC message");
        }
    }
