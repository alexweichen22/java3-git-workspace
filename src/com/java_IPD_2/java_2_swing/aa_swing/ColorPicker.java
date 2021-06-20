package _java_exe.colorPicker.src.colorpicker;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JColorChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ColorPicker extends JFrame {

    private final JButton btn;
    private boolean colorSwitch = false;
    private int clickCount=0;
//    private boolean setColorChooserVisible = false;
    private JColorChooser jcc;
    
    public ColorPicker(){
        super("Color Picker");
        setLayout(new BorderLayout());
                
        //Define the button
        btn = new JButton("Choose Color");
        this.add(btn,BorderLayout.SOUTH);        
    
        ButtonEar buttonEar = new ButtonEar();
        btn.addActionListener(buttonEar);
}

    
    private class ButtonEar implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae){        
//        if(getContentPane().getBackgound()==Color.yellow)
//        getContentPane().setBackground(Color.white);
//        else if (getContentPane().getBackgound()==Color.white)

        
        if (clickCount%2==0)
            //getContentPane().setBackground(Color.yellow);
            
            //jcc.setVisible(true);
        else if(clickCount%2==1)
            //getContentPane().setBackground(Color.white);
            //jcc.setVisible(true);
        clickCount++;
//        setColorChooserVisible = true;
    }
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ColorPicker cp = new ColorPicker();
        cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setSize(600,400);
        cp.setVisible(true);
    }
    
}
