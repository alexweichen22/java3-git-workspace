package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public final class SwingCal {
  
  public static void main(String[] aArgs){
    SwingCal app = new SwingCal();
    app.buildAndDisplayGui();
  }
  
  private void buildAndDisplayGui(){
    JFrame frame = new JFrame("Test Frame"); 
    buildContent(frame);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  
  private void buildContent(JFrame aFrame){
    JPanel panel = new JPanel();
    panel.add(new JLabel("Hello"));
    JButton ok = new JButton("OK");
    ok.addActionListener(new ShowDialog(aFrame));
    panel.add(ok);
    aFrame.getContentPane().add(panel);      
  }
  
  private static final class ShowDialog implements ActionListener {
    ShowDialog(JFrame aFrame){
      fFrame = aFrame;
    }
    @Override public void actionPerformed(ActionEvent aEvent) {
      JOptionPane.showMessageDialog(fFrame, "This is a dialog");
    }
    private JFrame fFrame;
  }
} 
