package _java_exe.java2Exe5.src;

import java.lang.String;
import java.util.Scanner;
public class CarMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCar myCar1 = new MyCar("FB66X5","Toyota","Supra",2012);
        MyCar myCar2 = new MyCar("35GX36","Toyota","Camry",2005);
        System.out.println("Enter new plate for myCar1");
        myCar1.addPlate(input.next());
        System.out.println("Thank you for your new plate input. Now all the plates you have include:");
        for(String plate: myCar1.getPlate()){
            System.out.println(plate);
        }

    }
}
