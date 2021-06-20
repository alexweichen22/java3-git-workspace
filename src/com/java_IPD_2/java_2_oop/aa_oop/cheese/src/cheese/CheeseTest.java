package _java_exe.cheese.src.cheese;

public class CheeseTest {

    public static void main(String[] args) {
        CheeseSwiss cheeseForClient1 = new CheeseSwiss();
        
//        // Set the unit price of cheese (20.0$ per kilograms)
        cheeseForClient1.setPricePerKilo(20.0);
//        
//        // Set the weight of cheese ( 5.0 kilograms)
        cheeseForClient1.setWeight(5.0);
        cheeseForClient1.calculatePriceTotal();

        
        System.out.printf("%.1f\n",cheeseForClient1.getPriceTotal());
    }
    
}
