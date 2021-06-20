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
abstract class AbstractVehicle {
    abstract void abstractStart();    // Interface -- (Forced to be implemented)
    
    void abstractStop() {             // Abstract class --(A mix of interface AND class)
        boolean isStopped;
        isStopped = true;
    }
}

class VehicleForAbstract extends AbstractVehicle{

    @Override
    void abstractStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class Vehicle implements IVehicle {

    boolean isStarted;

    @Override
    public void start() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (!isStarted) {
            isStarted = true;
        }

    }

    @Override
    public void stop() {
        //throw new UnsupportedOperationException("Not supported yet"); //To change body of generated methods, choose Tools | Templates.
        if (isStarted) {
            isStarted = false;
        }
    }

}

class Car extends Vehicle {
    boolean isDoorOpened;
    
    public void openDoor(){
        if(!isDoorOpened)isDoorOpened = true;
    }
    
    public void shutDoor(){
        if(isDoorOpened)isDoorOpened = false;
    }
    
}
