package _java_exe.JavaApplication15.src.javaapplication15;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ItemEvent;

public class JComboBoxTest extends JFrame {

    private final JComboBox cb;
    private final JCheckBox chb1, chb2;
    private final JButton btn1, btn2;

    public JComboBoxTest() {
        super("Testing JComboBox");

        // Define JComboBox
        cb = new JComboBox();
//        cb.add("RED");
//        cb.add("YELLOW");
//        cb.add("RED");
//        cb.

        add(cb);

        // Define the Check Box
        chb1 = new JCheckBox("Background");
        add(chb1);

        chb2 = new JCheckBox("Foreground");
        add(chb2);

        // Define buttons
        btn1 = new JButton("OK");
        btn2 = new JButton("CANCEL");
        add(btn1);
        add(btn2);
        
        

    

    

    private class CheckBoxEvent implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {

            Color selectedColor = new Color;
            switch (cb.getSelectedItem().toString()) {
                case "RED":
                    selectedColor = Color.RED;
                    break;
                case "GREEN":
                    selectedColor = Color.GREEN;
                    break;
                case "BLUE":
                    selectedColor = Color.BLUE;
                    break;
                default:
                    selectedColor = Color.YELLOW;
            }
            if (ie.getSource() == chb1) {
                //Set the combobox background color based on color selected
                if(ie.getStateChange()==ItemEvent.SELECTED)
                cb.setBackground(selectedColor);
            } else if (ie.getSource() == chb2) {
                if(ie.getStateChange()==ItemEvent.SELECTED)
                cb.setForeground(selectedColor);
            }

        }
    }

}

public static void main(String[] args) {
        JComboBoxTest cbt = new JComboBoxTest();
        cbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cbt.setSize(250,135);
        cbt.setVisible(true);
    }
}
