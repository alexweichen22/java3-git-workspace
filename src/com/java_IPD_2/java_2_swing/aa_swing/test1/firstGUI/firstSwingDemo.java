package _java_exe.java2aGUI.src.firstGUI;
import javax.swing.JFrame;
import javax.swing.JButton;
public class firstSwingDemo {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static void main(String[] args) {
        // Setup JFrame
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(WIDTH,HEIGHT);
        firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Setup JButton
        JButton endButton = new JButton("Click this button to end");

        // Instantiate ActionListener
        EndingListener buttonEar = new EndingListener();

        // add listener to button
        endButton.addActionListener(buttonEar);

        // Add jbutton to jframe
        firstWindow.add(endButton);

        // set jframe visible
        firstWindow.setVisible(true);

    }
}
