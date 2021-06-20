package _java_exe.java2aGUI.src;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class JComboBoxTest extends JFrame {

// private final
    private final JComboBox cb;
    private final JCheckBox chb1, chb2;
    private final JButton btn1, btn2;

// Define everything from constructor
    public JComboBoxTest() {
        super("Testing JComboBox");                 // Create a "JFrame"
        setLayout(new FlowLayout());                   // set JFrame layout   <<<java.awt.FlowLayout>>>

        // Define the ComboBox
        cb = new JComboBox();
        cb.addItem("RED");
        cb.addItem("BLUE");
        cb.addItem("YELLOW");
        cb.addItem("GREEN");
        cb.setPreferredSize(new Dimension(200,20));    // <<<java.awt.Dimension;>>>
        add(cb);                                     // add JComboBox to JFrame

        // Define the Check Boxes
        chb1=new JCheckBox("Background");
        add(chb1);
        chb2=new JCheckBox("Foreground");
        add(chb2);

        // Define the buttons
        btn1=new JButton("OK");
        btn2=new JButton("CANCEL");
        add(btn1);
        add(btn2);








    }



// Main Method to Test
    public static void main(String[] args) {
        JComboBoxTest cbt = new JComboBoxTest();
    }

}
