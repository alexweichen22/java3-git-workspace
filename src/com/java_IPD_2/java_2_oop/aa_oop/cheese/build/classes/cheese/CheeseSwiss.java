package _java_exe.cheese.build.classes.cheese;

public class CheeseSwiss extends Cheese{      // Is a relation
    private double weight;                            
    private String brand;
    private CheeseBrand cheeseBrand =new CheeseBrand("Swiss");         // Has a relation
    private double pricePerKilo;
    private double priceTotal;                                         // Encapsulation
                
    // Getter
    public String getBrand() {return brand;}
    public CheeseBrand getCheeseBrand() {return cheeseBrand;}
    public double getPricePerKilo() {return pricePerKilo;}
    public double getPriceTotal() {return priceTotal; }                // Encapsulation
    public double getWeight() {return weight;}
    
    
    // Constructor
    CheeseSwiss(){}                                                   // Static Polymorphism (Overloading)                     
    CheeseSwiss(double pricePerKilo, double weight){
        this.pricePerKilo = pricePerKilo;
        this.weight=weight;
    }
      
    // Setter

    public void setBrand(String brand) {this.brand = cheeseBrand.getBrandX();}
    public void setCheeseBrand(CheeseBrand cheeseBrand) {this.cheeseBrand = cheeseBrand;}
    public void setPricePerKilo(double pricePerKilo) {this.pricePerKilo = pricePerKilo;}
        
    public void calculatePriceTotal() {
        this.priceTotal = this.getPricePerKilo()*this.getWeight();
    }
           
    @Override                                                       // Dynamic Polymorphism (Overriding)
    public void setWeight(double weight) {
        this.weight=weight;
    }     
       
}
