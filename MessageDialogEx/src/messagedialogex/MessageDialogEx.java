
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageDialogEx implements ActionListener {

    JButton b1;
    JFrame f;

    MessageDialogEx() {
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
        JOptionPane.showMessageDialog(f, "This is Warning Message", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new MessageDialogEx();
    }

}
