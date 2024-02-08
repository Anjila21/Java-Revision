import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ListenerEx implements MouseListener
{
    JTextField t1,t2;
    JLabel l;
    Container c;
    ListenerEx()
    {
        JFrame f = new JFrame("Mouse Listener Example");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        c.setLayout(new FlowLayout());
        
        t1 = new JTextField();
        t2=new JTextField();
        c.add(t1);
        c.add(t2);
        
        l = new JLabel("Press and Release");
        c.add(l);
        
        l.addMouseListener(this);
        
        
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
          new ListenerEx();
      }
    
}