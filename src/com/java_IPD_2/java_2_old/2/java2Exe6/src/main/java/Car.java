package _java_exe.java2Exe6.src.main.java;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6151742
 */
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

    // Getter
    public ArrayList<String> getPlate(){return plate;}
    public String getMake(){return this.make;}
    public String getModel(){return this.model;}
    public int getYear(){return this.year;}

    // Setter
    public void addPlate(String inPlate) {this.getPlate().add(inPlate);}
    public void setMake(String inMake){this.make=inMake;}
    public void setModel(String inModel){this.model=inModel;}
    public void setYear(int inYear){this.year=inYear;}
    


}

