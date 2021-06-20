
package com.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
//import java.util.ArrayList;
//import javax.swing.plaf.nimbus.NimbusLookAndFeel; 



public class CalculatorTest extends JFrame {
    
    private final JButton btn7,btn8,btn9,btnDIVIDE;
    private final JButton btn4,btn5,btn6,btnMULTIPLY;
    private final JButton btn1,btn2,btn3,btnDEDUCT;
    private final JButton btn0,btnDOT,btnEQUAL,btnADD;
    private final JTextField tf;
    private final JPanel pn;    
    private final int WIDTH_TEXT_FIELD=9;
    private static final int WIDTH_FRAME = 220;
    private static final int HEIGHT_FRAME = 200;
    private String existingEntry;    
    
    public CalculatorTest(){
        super("Calculator");
        this.setResizable(false);
        
        // Set Layout
        this.setLayout(new FlowLayout());
        
        // Set Grid1 (which is textfield)
        tf=new JTextField(WIDTH_TEXT_FIELD);
        tf.setFont(new Font("Arial", Font.PLAIN, 22));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setEditable(false);
        tf.setBackground(Color.white);
        tf.setLayout(new GridLayout(4,4));
        this.add(tf);   
        
        // Set Panel 
        pn=new JPanel(new GridLayout(4,4));
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btnDIVIDE=new JButton("/");   
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btnMULTIPLY=new JButton("*");        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btnDEDUCT=new JButton("-");          
        btn0=new JButton("0");
        btnDOT=new JButton(".");        
        btnEQUAL=new JButton("=");
        btnADD=new JButton("+");        
        
        pn.add(btn7);
        pn.add(btn8);        
        pn.add(btn9);      
        pn.add(btnDIVIDE);               
 
        pn.add(btn4);        
        pn.add(btn5);           
        pn.add(btn6);
        pn.add(btnMULTIPLY);
  
        pn.add(btn1);   
        pn.add(btn2);
        pn.add(btn3);        
        pn.add(btnDEDUCT);     
       

        pn.add(btn0);   
        pn.add(btnDOT);
        pn.add(btnEQUAL);        
        pn.add(btnADD);           
        
        this.add(pn);   
        
        existingEntry = "";
        
        NumListener numLis = new NumListener();
        tf.addActionListener(numLis);        
        btn0.addActionListener(numLis);
        btn1.addActionListener(numLis);
        btn2.addActionListener(numLis);
        btn3.addActionListener(numLis);
        btn4.addActionListener(numLis);
        btn5.addActionListener(numLis);
        btn6.addActionListener(numLis);
        btn7.addActionListener(numLis);
        btn8.addActionListener(numLis);
        btn9.addActionListener(numLis);  
        btnDOT.addActionListener(numLis);  
        btnADD.addActionListener(numLis);  
        btnDEDUCT.addActionListener(numLis);  
        btnMULTIPLY.addActionListener(numLis);  
        btnDIVIDE.addActionListener(numLis);                                          
        btnEQUAL.addActionListener(numLis);   
} // End of Constructor "Calculator()"
    
  
    private class NumListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            existingEntry+=ae.getActionCommand();
            tf.setText(existingEntry);
        }        
    }
  
    public static void main(String[] args) {
       
        CalculatorTest cal = new CalculatorTest();
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setSize(WIDTH_FRAME, HEIGHT_FRAME);
        cal.setVisible(true);        
    }
}








    

