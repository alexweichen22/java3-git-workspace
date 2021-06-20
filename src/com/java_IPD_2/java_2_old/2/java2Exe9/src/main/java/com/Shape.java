package _java_exe.java2Exe9.src.main.java.com;

public abstract class Shape implements IShape {
    
    abstract public String getShapeName();

    abstract public void setShapeName(String shapeName);
    
    @Override
    public double calculatePerimeter(){return 1;}
    
    @Override
    public double calculateArea(){return 1;}
    
    @Override
    public void printX(double value){}
    
    
}
