package _java_exe.InterfaceTest.src.interfacetest;

// ################################################
public class InterfaceTest implements TestInterface1, TestInterface2 {
    
    @Override
    public void show() {
        TestInterface1.super.show();
        TestInterface2.super.show();  // Through override, may choose what to show ....        
    }

    public static void main(String[] args) {
        InterfaceTest iTest = new InterfaceTest();
        iTest.show();
    }
    
}



