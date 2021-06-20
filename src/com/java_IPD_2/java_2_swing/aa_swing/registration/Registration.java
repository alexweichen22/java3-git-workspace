package _java_exe.registration.src.registration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Registration extends JFrame {

    private final JLabel lb1;
    private final JTextField tf1;
    private final JLabel lb2;
    private final JTextField tf2;
    private final JRadioButton rb1;
    private final JRadioButton rb2;
    private final JButton btn;
    private final ButtonGroup btng;

    public Registration() {
        super("Registration");
        
        setLayout(new FlowLayout());

        lb1 = new JLabel("First Name:");
        this.add(lb1);

        tf1 = new JTextField(24);        
        this.add(tf1);

        lb2 = new JLabel("Last Name:");
        this.add(lb2);

        tf2 = new JTextField(24);
        this.add(tf2);
        
        rb1 = new JRadioButton("Male");     
        rb2 = new JRadioButton("Female");       
        
        btng = new ButtonGroup();
        btng.add(rb1);
        btng.add(rb2);
        
        this.add(rb1);
        this.add(rb2);        

        btn = new JButton("Register");
        this.add(btn);

        RegisterButtonEar rbe = new RegisterButtonEar();
        btn.addActionListener(rbe);

    }

    private class RegisterButtonEar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String titleOfPerson = "";
            if (rb2.isSelected()) titleOfPerson = "Miss.";
            else if (rb1.isSelected()) titleOfPerson = "Mr.";
            JOptionPane.showMessageDialog(null, "Hello\n" + titleOfPerson + " " + tf1.getText()+" " +tf2.getText());
        }
    }

    public static void main(String[] args) {
        Registration rg1 = new Registration();
        rg1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rg1.setSize(300, 200);
        rg1.setVisible(true);
    }

}
