package _java_exe.registrationTest.src.registrationtest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class RegistrationTest extends JFrame {

    private final JLabel lb1, lb2, lb3, lb4;
    private final JTextField tf1, tf2, tf3, tf4;
    private final JButton btn;
    private static final int WIDTH_FRAME = 300;
    private static final int HEIGHT_FRAME = 280;
    private static final int WIDTH_TEXTFIELD = 25;
    private static boolean isFirstNameValid = false;
    private static boolean isLastNameValid = false;
    private static boolean isEmailValid = false;
    private static boolean isRetypeEmailValid = false;

    public RegistrationTest() {
        super();
        this.setResizable(false);
        this.setLayout(new FlowLayout());

        lb1 = new JLabel("First Name:");
        this.add(lb1);

        tf1 = new JTextField(WIDTH_TEXTFIELD);
        this.add(tf1);

        lb2 = new JLabel("Last Name:");
        this.add(lb2);

        tf2 = new JTextField(WIDTH_TEXTFIELD);
        this.add(tf2);

        lb3 = new JLabel("Email:");
        this.add(lb3);

        tf3 = new JTextField(WIDTH_TEXTFIELD);
        this.add(tf3);

        lb4 = new JLabel("Retype Email:");
        this.add(lb4);

        tf4 = new JTextField(WIDTH_TEXTFIELD);
        this.add(tf4);

        btn = new JButton("Validate");
        this.add(btn);

        RegListener handler = new RegListener();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
        tf3.addActionListener(handler);
        tf4.addActionListener(handler);
        btn.addActionListener(handler);

    }

    private class RegListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            while (!isFirstNameValid | !isLastNameValid | !isEmailValid | !isRetypeEmailValid) {
                if ((event.getSource()) == tf1) {
                    if (ValidateInput.validateFirstName(tf1.getText())) {
                        isFirstNameValid = true;
                    } else {
                        isFirstNameValid = false;
                    }
                }
                if ((event.getSource()) == tf2) {
                    if (ValidateInput.validateLastName(tf2.getText())) {
                        isLastNameValid = true;
                    } else {
                        isLastNameValid = false;
                    }
                }
                if ((event.getSource()) == tf3) {
                    if (ValidateInput.validateEmail(tf3.getText())) {
                        isEmailValid = true;
                    } else {
                        isEmailValid = false;
                    }
                if ((event.getSource()) == tf4) {
                    if (ValidateInput.validateEmailReType(tf3.getText(),tf4.getText())) {
                        isRetypeEmailValid = true;
                    } else {
                        isRetypeEmailValid = false;
                    }                   
                }                

            }

        }
    }
}
    public static void main(String[] args) {
        RegistrationTest regTest = new RegistrationTest();
        regTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regTest.setSize(WIDTH_FRAME, HEIGHT_FRAME);
        regTest.setVisible(true);
    }

}
