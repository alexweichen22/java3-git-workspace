package _java_exe.java2Exe8.src.main.java;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6151742
 */
public class BuildingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //var house1 = new House();
        //House house1 = new House();
        Building house2 = new House();
        ((House) house2).getDoors();
        //IBuilding house3 = new House();
        //((House)house3).
        //((Building)house3).
        if (house3 instanceof House) {
            System.out.println("house3 is a House type");
            if (house3 instanceof Building) {
                System.out.println("house3 is a Building type");
                if (house3 instanceof IBuilding) {
                    System.out.println("house3 is a IBuilding type");
                    if (!(house3 instanceof Window)) {
                        System.out.println("house3 is NOT a Window type");
                    }

        System.out.printf("First door: %s, second door: %s\n", house1.getDoors()[0].getName(), house1.getDoors()[1].getName());
        System.out.printf("First window: %s, second window: %s\n", house1.getWindows()[0].getName(), house1.getWindows()[1].getName());
                    
        //var house4 = house3.getTypeOfCass  // Building generic type of varialbe of which the type can be determined when it is created.           
   
                }
            }
        }
    }
}
