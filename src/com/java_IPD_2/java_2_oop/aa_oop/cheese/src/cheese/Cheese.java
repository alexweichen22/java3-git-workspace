package _java_exe.cheese.src.cheese;

public class Cheese implements InterfaceCheese{              
    Cheese(){}

    @Override                                         // Polymorphism
    public void setWeight(double weight) {
        //This is intentionally kept as empty for child class to override.
    }
   
}
