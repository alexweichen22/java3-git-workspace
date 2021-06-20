/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6151742
 */
public class MyCar extends Car {
    private String owner;
    private int plateAmount = 0;
    private boolean isStarted = false;
    private boolean isCameraOn = false;
    
    
    // Constructor - Static Polimorphism
    MyCar(String inPlate) {
        super(inPlate);
        this.plateAmount = 1;
    }
    MyCar(String inPlate, String inMake) {
        super(inPlate, inMake);
        this.plateAmount = 1;
    }
    MyCar(String inPlate, String inMake, String inModel) {
        super(inPlate, inMake, inModel);
        this.plateAmount = 1;
    }
    MyCar(String inPlate, String inMake, String inModel, int inYear) {
        super(inPlate, inMake, inModel, inYear);
        this.plateAmount = 1;
    }
    
    // Getter
    public String getOwner(){return this.owner;}
    public int getPlateAmount(){return this.plateAmount;}
    public boolean getIsStarted(){return this.isStarted;}
    public boolean getIsCameraOn(){return this.isCameraOn;}
    
    // Setter
    public void setOwner(String owner){this.owner=owner;}
    public void startCar(){this.isStarted=true;}
    public void stopCar(){this.isStarted=false;}
    public void turnOnCamera(){this.isCameraOn=true;}
    public void turnOffCamera(){this.isCameraOn=false;}

    @Override
    public void addPlate(String inPlate){
        super.addPlate(inPlate);
        this.plateAmount +=1;
        
    }
}

