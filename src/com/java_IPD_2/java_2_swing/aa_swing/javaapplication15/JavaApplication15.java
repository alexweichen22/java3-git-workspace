package _java_exe.JavaApplication15.src.javaapplication15;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaApplication15 {
}

package javaapplication15;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ColorSetTest extends JFrame {

    private final JComboBox cb;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    

    public static void main(String[] args) {
        JFrame jframe = new JFrame("ColorSet");
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);

        JPanel jpanel1 = new JPanel();
        JPanel jpanel2 = new JPanel();
        JPanel jpanel3 = new JPanel();
        
        jpanel1.setVisible(true);
        jpanel2.setVisible(true);
        jpanel3.setVisible(true);

        jframe.add(jpanel1);
        jframe.add(jpanel2);
        jframe.add(jpanel3);
        
        JComboBoxText jcombobox = new JComboBoxTest();
        
    }

}

class JComboBoxTest extends JCombobox {
    public JComboBoxTest(){
        super("Testing JComboBox");
        setLayout(new FlowOut());
        
    }
}









    




