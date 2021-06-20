package _java_exe.java2Exe5.src;

import java.util.ArrayList;

public class Car  {
    private ArrayList<String> plate = new ArrayList();
    private String make;
    private String model;
    private int year;


    // Constructor
    Car(String inPlate){
        this.plate.add(inPlate);
    }

    Car(String inPlate, String inMake){
        this(inPlate);
        this.make = inMake;
    }

    Car(String inPlate, String inMake, String inModel){
        this(inPlate, inMake);
        this.model=inModel;
    }

    Car(String inPlate, String inMake, String inModel, int inYear){
        this(inPlate, inMake,inModel);
        this.year=inYear;
    }

    public ArrayList<String> getPlate(){
        return plate;
    }


    public void addPlate(String inPlate) {
        this.getPlate().add(inPlate);
    }



}
