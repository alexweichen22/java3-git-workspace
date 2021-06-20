/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuron;
import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * @author Chen
 */
public class Neuron {
    
// Define the Attributes
private ArrayList<Double> listOfWeightIn = new ArrayList<Double>();
private ArrayList<Double> listOfWeightOut = new ArrayList<Double>();

//Define the methods
public double initNeuron(){
// As illustration, return a pseudo random real number
return Math.random();  
}

public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){
// No return value
}

public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){
// No return value
}

public ArrayList<Double> getListOfWeight(){
// Return the list of real numbers stored in listOfWeightOut variable
    return listOfWeightOut;
}

    /**
     * @param args the command line arguments
     * 
     *     public static void main(String[] args) {
        // TODO code application logic here
    }
     * 
     */

    
}
