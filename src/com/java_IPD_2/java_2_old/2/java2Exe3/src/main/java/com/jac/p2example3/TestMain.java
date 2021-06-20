/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.java2Exe3.src.main.java.com.jac.p2example3;

/**
 *
 * @author 6151742
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle v1 = new Vehicle();
        v1.start();
        boolean canStart = Car.CAN_START;            // CAN_START is  static and final from interface IVehicle
            
        //v1.stop(); 
        // AbstractVehicle vehicle007 = new AbstractVehicle();     // Can not directly create an instance out of an abstract class
        VehicleForAbstract vehicle008 = new VehicleForAbstract();  // Must create a lower level class to inheritate from abstract class, and 
                                                                   // create an instance out of the lower level class (child class of the abstract class)

    }
    
}
