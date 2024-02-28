import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddSubMouse implements MouseListener
{
    JTextField t1,t2;
    JLabel l;
    Container c;
    AddSubMouse()
    {
        JFrame f = new JFrame("Mouse Listener Example");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        c.setLayout(null);
        
        t1 = new JTextField();
        t1.setBounds(10,40,100,50);
        
        t2=new JTextField();
        t2.setBounds(10,80,100,50);
        c.add(t1);
        c.add(t2);
        
        l = new JLabel("Press and Release");
        l.setBounds(10,120,200,50);
        c.add(l);
        
        l.addMouseListener(this);
        f.setVisible(true);
        
        
    }
    public void mousePressed(MouseEvent e)
    {
        int first = Integer.parseInt(t1.getText());
        int sec = Integer.parseInt(t2.getText());
        int add = first+sec;
        l.setText("Sum is"+add);
    }
    public void mouseReleased(MouseEvent e)
    {
        int first = Integer.parseInt(t1.getText());
        int sec = Integer.parseInt(t2.getText());
        int sub = first-sec;
        l.setText("Sub is"+sub);
    }
    public void mouseClicked(MouseEvent e)
    {
        
    }
     public void mouseEntered(MouseEvent e)
    {
        
    }
      public void mouseExited(MouseEvent e)
    {
        
    }
      
      public static void main(String[] args)
      {
          new AddSubMouse();
      }
    
}