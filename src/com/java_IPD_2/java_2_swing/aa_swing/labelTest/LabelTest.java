package java2ch12.pkg5;

// Fig. 12.7: LabelTest.java
// Testing LabelFrame.
import javax.swing.JFrame;

public class LabelTest {

    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // This is to define the terminate the process when the GUI interface is closed!!!!
        labelFrame.setSize(260, 180);
        labelFrame.setVisible(true);
    }
} // end class LabelTest
