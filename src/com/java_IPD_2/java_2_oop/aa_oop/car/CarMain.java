/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6151742
 */
import java.lang.String;
import java.util.Scanner;
public class CarMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCar myCar1 = new MyCar("FB66X5","Toyota","Supra",2012);       
        System.out.println("Your myCar1 has only one registered plate now, which is" + myCar1.getPlate());
        System.out.println("Do you want to enter another plate for myCar1? Enter Y or N: ");
        while(input.next().equals("Y")){
            System.out.println("Enter another plate number");
            myCar1.addPlate(input.next());
            System.out.println("Do you want to enter another plate for myCar1? Y or N: ");
            
        }
        
        System.out.printf("Thank you. Totally you have %d plate(s), include:\n\n", myCar1.getPlateAmount());
        for(String plate: myCar1.getPlate()){
            System.out.println(plate);
        }

    }
}

