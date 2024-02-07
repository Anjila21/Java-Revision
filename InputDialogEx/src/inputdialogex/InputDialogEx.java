import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputDialogEx implements ActionListener
{
    JButton b1;
     InputDialogEx()
             {
                 JFrame f = new JFrame("Input Dialog Example");
                 f.setSize(500,500);
                 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 f.setLocationRelativeTo(null);
                 b1 = new JButton("Click Me!!!");
                 b1.setBounds(20,20,60,50);
                 f.add(b1);
                 f.setLayout(new FlowLayout());
                 b1.addActionListener(this);
                 f.setVisible(true);
                 
             }
     public void actionPerformed(ActionEvent a)
     {
         String s= JOptionPane.showInputDialog("Enter Your Name");
         
             if(s.length()>0)
             {
                 System.out.println("Your Name is:"+s);
             }
         
     }
     public static void main(String[] args)
     {
         new  InputDialogEx();
         
     }
    
}