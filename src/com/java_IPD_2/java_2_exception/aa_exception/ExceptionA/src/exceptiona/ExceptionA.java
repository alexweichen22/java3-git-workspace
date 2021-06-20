package _java_exe.ExceptionA.src.exceptiona;

import java.lang.Exception;

public class ExceptionA extends Exception{
    
    ExceptionA(String s) {
        super(s);
    }

}
class ExceptionB extends ExceptionA{

    ExceptionB(String b){
        super(b);
    }
}