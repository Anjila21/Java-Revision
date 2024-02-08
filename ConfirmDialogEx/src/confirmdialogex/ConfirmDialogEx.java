
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmDialogEx implements ActionListener {

    JButton b1;
    JFrame f;

    ConfirmDialogEx() {
        f = new JFrame();
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        b1 = new JButton("Click Here!!!");
       // b1.setBounds(20, 20, 50, 40);
        f.add(b1);
        b1.addActionListener(this);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent a) {
        int s = JOptionPane.showMessageDialog(f, "Do you want to Exit??", "Close",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
   
        
        if (s==(JOptionPane.YES_OPTION))
        {
            System.out.println("You pressed yes");
            System.exit(0);
        }
    
    }

    public static void main(String[] args) {
        new ConfirmDialogEx();
    }

}
