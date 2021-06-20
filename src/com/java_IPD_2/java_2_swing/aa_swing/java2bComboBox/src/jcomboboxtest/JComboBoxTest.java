package _java_exe.java2bComboBox.src.jcomboboxtest;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;

public class JComboBoxTest extends JFrame {

    private final JComboBox cb;
    private final JCheckBox chb1, chb2;
    private final JButton btn1, btn2;

    // Constructor
    public JComboBoxTest() {
        super("Testing JComboBox");
        this.setLayout(new FlowLayout());

        //Define ComboBox
        cb = new JComboBox();
        cb.addItem("RED");
        cb.addItem("BLUE");
        cb.addItem("YELLOW");
        cb.addItem("GREEN");
        cb.setPreferredSize(new Dimension(200, 20));
        this.add(cb);

        //Define CheckBox
        chb1 = new JCheckBox("Background");
        chb2 = new JCheckBox("Foreground");
        this.add(chb1);
        this.add(chb2);


        //Define Button
        btn1 = new JButton("OK");
        btn2 = new JButton("CANCEL");
        this.add(btn1);
        this.add(btn2);


        CheckBoxEvent cbe = new CheckBoxEvent();    // Instantiate the inner class
        chb1.addItemListener(cbe);
        chb2.addItemListener(cbe);
}
        private class CheckBoxEvent implements ItemListener {    //<<<java.awt.event.ItemListener;>>>

            @Override
            public void itemStateChanged(ItemEvent ie) {
                // if(ie.getItem() == chb1) return;
                Color selectedColor;                  // <<<java.awt.Color;>>>
                switch (cb.getSelectedItem().toString()) {
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
                        break;
                }

                // Check the type of checkbox
                if (ie.getSource() == chb1) {
                    //set the combobox background color based on color selected
                    if (ie.getStateChange() == ItemEvent.SELECTED)
                        getContentPane().setBackground(selectedColor);
                } else if (ie.getSource() == chb2) {
                    //set the combobox foreground color based on color selected
                    if (ie.getStateChange() == ItemEvent.SELECTED)
                        cb.setForeground(selectedColor);
                }


            }
        }

        public static void main (String[]args){
            JComboBoxTest cbt = new JComboBoxTest();
            cbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cbt.setSize(250, 135);
            cbt.setVisible(true);
        }

    }




