/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuron;
import java.util.ArrayList;
/**
 *
 * @author Chen
 */
public abstract class Layer {
// This class is abstract, and cannot be instantiated.
    
    
// Setup Attributes
private ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();
private int numberOfNeuronsInLayer;

// Setup Methods
public ArrayList<Neuron> getListOfNeurons(){
// Return Arraylist of Neuron class objects
    return listOfNeurons;
}

public void setListOfNeurons(ArrayList<Neuron> listOfNeurons){
// Set the listOfNeurons function with an ArrayList variable of Neuron class objects
// No return value;
}

public int getNumberOfNeuronsInLayer(){
    return numberOfNeuronsInLayer;
}

public void setNumberOfNeuronsInLayer (int numberOfNeuronsInLayer){
// No returns;
}



}
