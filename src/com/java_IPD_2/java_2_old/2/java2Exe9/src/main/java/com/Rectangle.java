package _java_exe.java2Exe9.src.main.java.com;

public class Rectangle extends Shape {
    
    private double lengthOfRectangle;
    private double widthOfRectangle;
    private double area;
    private double perimeter;    
    
    @Override
    public String getShapeName(){
        return "a fake name";
    }

    @Override
    public void setShapeName(String shapeName){}
    
    @Override
    public double calculatePerimeter(){return 1;}
    
    @Override
    public double calculateArea(){return 1;}
    
    @Override
    public void printX(double value){}
    
    
    
    

//    
//
//   
//    // Setter
//    public void setLength(double length) {
//        this.length = length;
//    }
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    // Getter
//    public double getLength() {
//        return length;
//    }
//    public double getWidth() {
//        return width;
//    }
//    
//    // Methods
//    public double calculatePerimeter(){
//        perimeter = 2*(length+width);
//        return perimeter;
//    }
//    
//    public double calculateArea(){
//        area = length*width;
//        return area;
//    }  
//    
//    public void printArea(){
//        System.out.println("The Area of this Rectangle is: " + this.calculateArea());
//    }
//    
//    public void printPerimeter(){
//        System.out.println("The Perimeter of this Rectangle is: " + this.calculatePerimeter());
//    }
}
