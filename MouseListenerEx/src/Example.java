
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Container;

public class Example implements MouseListener
{

    JLabel l;
    JTextArea ta;
    Container c;

    Example() {

        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        c.setLayout(null);
        
        
        l = new JLabel("Click me");
        l.setBounds(50,100,100,40);
        c.add(l);
        
        ta = new JTextArea();
        ta.setBounds(200,50,300,400);
        c.add(ta);
        
        l.addMouseListener(this);
        f.setVisible(true);

    }
    public void mousePressed(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+"Mouse Pressed");
    }
   
      public void mouseReleased(MouseEvent e)
    {
        
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
        new Example();
    }
}
