/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.JComboBoxTest.JComboBoxTest.src.jcomboboxtest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;


/**
 *
 * @author teacher
 */
public class JComboBoxTest extends JFrame{
    
    private final JComboBox cb;
    private final JCheckBox chb1;
    private final JCheckBox chb2;
    private final JButton btn1;
    private final JButton btn2;
    
    
    public JComboBoxTest(){
        
        super("Testing JComboBox");
        setLayout(new FlowLayout()); // set frame layout
        
        //Define the ComboBox
        cb = new JComboBox();
        cb.addItem("RED");
        cb.addItem("BLUE");
        cb.addItem("YELLOW");
        cb.addItem("GREEN");
        
        cb.setPreferredSize(new Dimension(200, 20));
        
        add(cb);
        
        //Define the Check Boxes
        chb1 = new JCheckBox("Background");
        
        add(chb1);
        
        chb2 = new JCheckBox("Foreground");
        
        add(chb2);
        
        //Define the Buttons
        btn1 = new JButton("OK");
        btn2 = new JButton("CANCEL");
        add(btn1);
        add(btn2);
        
        CheckBoxEvent cbe = new CheckBoxEvent();
        chb1.addItemListener(cbe);
        chb2.addItemListener(cbe);
    }
    
    private class CheckBoxEvent implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent ie) {
            
            //if(ie.getItem() == chb1) return;
            
            Color selectedColor;
            switch(cb.getSelectedItem().toString()){
                case "RED":
                    selectedColor = Color.RED;
                    break;
                case "BLUE":
                    selectedColor = Color.BLUE;
                    break;
                case "GREEN":
                    selectedColor = Color.GREEN;
                    break;
                default:
                    selectedColor = Color.YELLOW;
            }
            
            //check the type of the checkbox
            if(ie.getSource() == chb1)
            {
                //set the combobox background color based on the color selected
                
                if(ie.getStateChange() == ItemEvent.SELECTED)
                    getContentPane().setBackground(selectedColor);
            }
            else if(ie.getSource() == chb2)
            {
                //set the combobox foreground color based on the color selected
                if(ie.getStateChange() == ItemEvent.SELECTED)
                    cb.setForeground(selectedColor);
            }
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JComboBoxTest cbt = new JComboBoxTest(); 
        cbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cbt.setSize(250, 135);
        cbt.setVisible(true);
        
    }
    
}
