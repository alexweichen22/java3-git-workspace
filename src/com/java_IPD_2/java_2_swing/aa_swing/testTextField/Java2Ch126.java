package java2ch12.pkg6;
//Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import javax.swing.JOptionPane;

public class Java2Ch126 extends JFrame {

    private final JTextField textField1; // text field with set size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField passwordField; // password field with text

// TextFieldFrame constructor adds JTextFields to JFrame
    public Java2Ch126() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

// construct text field with 10 colums
        textField1 = new JTextField(10);
        add(textField1); // add textField1 to JFrame

// 
        textField2 = new JTextField("Enter text here");
        add(textField2); // add textField2 to JFrame

//
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3); // add textField3 to JFrame

// construct password field with default text
        passwordField = new JPasswordField("Hidden Text");
        add(passwordField); // add passwordField to JFrame

// register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }

// private inner class for event handling
    private class TextFieldHandler implements ActionListener {
        // process text field events

        @Override
        public void actionPerformed(ActionEvent event) {

            String string = "";
// user pressed Enter in JTextField textField1
            if (event.getSource() == textField1) {
                string = String.format("textField1: %s", event.getActionCommand());
            } // user pressed Enter in JTextField textField2
            else if (event.getSource() == textField2) {
                string = String.format("textField2: %s", event.getActionCommand());
            } // user pressed Enter in JTextField textField3
            else if (event.getSource() == textField3) {
                string = String.format("textField3: %s", event.getActionCommand());
            } // user pressed Enter in JTextField passwordField
            else if (event.getSource() == passwordField) {
                string = String.format("passwordField: %s", event.getActionCommand());
            }

// display JTextField content
            JOptionPane.showMessageDialog(null, string);
        }
    }
} // end private inner class
