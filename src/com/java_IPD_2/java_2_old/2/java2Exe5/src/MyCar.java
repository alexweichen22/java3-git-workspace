package _java_exe.java2Exe5.src;

public class MyCar extends Car {

    MyCar(String inPlate) {
        super(inPlate);
    }

    MyCar(String inPlate, String inMake) {
        super(inPlate, inMake);
    }

    MyCar(String inPlate, String inMake, String inModel) {
        super(inPlate, inMake, inModel);
    }

    MyCar(String inPlate, String inMake, String inModel, int inYear) {
        super(inPlate, inMake, inModel, inYear);
    }

    public void addPlate(String inPlate){
        super.addPlate(inPlate);
    }
}
