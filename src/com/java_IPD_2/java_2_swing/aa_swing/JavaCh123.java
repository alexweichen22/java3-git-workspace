package javach12.pkg3;

import javax.swing.JOptionPane;

public class JavaCh123 {

    public static void main(String[] args) {
        
        // Play with try-catch below ....
        // ################################
        
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");   
        int number1, number2, sum;
        String result;
        int displayForm;
        
        try{
            number1=Integer.parseInt(firstNumber);
            number2=Integer.parseInt(secondNumber);
            sum = number1+number2;
            result = "The sum is: " + sum;
            displayForm=JOptionPane.INFORMATION_MESSAGE;
        }
        catch(Exception ex)
        {
            result = "<html><font color='red'>One of the inputs is not a number</font></html>";
            //  another way to change color  chapter 13, page 581? ----Color.changeColor() ?????
            displayForm=JOptionPane.ERROR_MESSAGE;
            
        }
        
               
        JOptionPane.showMessageDialog(null, result, "Sum of 2 integers", 
                displayForm);
        
        
        
        
        
        
        // (1) null  -  where to display (Host component)
        // (2) Content to show
        // (3) Title of frame
        // (4) JOptionPane.PLAIN_MESSAGE = -1, only message, no image, etc 
        //     JOptionPane.ERROR_MESSAGE = 0
        //     JOptionPane.INFORMATION_MESSAGE = 
        // For details, check description
        
//        String thirdNumber = JOptionPane.showInputDialog("Enter 3rd number");        
//        int number3 = Integer.parseInt(thirdNumber);        
//        JOptionPane.showMessageDialog(null, "Square of 3rd number" + number3 + "  is " + number3*number3);
       
       
    }
    
}
