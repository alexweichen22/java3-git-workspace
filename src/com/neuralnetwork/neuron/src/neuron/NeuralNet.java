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
public class NeuralNet {
// The values of the neural net topology are fixed in this class ( 2 neurons in the input layer)
// 2 hidden layers with 3 neurons each,
// 1 neuron in the output layer
    
    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;
    private int numberOfHiddenLayers;
    public void initNet(){
    }
    public void printNet(){
    // print the neural net as a whole.
    // each input and output weight of each layer is shown
    }
}
