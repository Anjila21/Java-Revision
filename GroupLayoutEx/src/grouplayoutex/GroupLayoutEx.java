
import javax.swing.*;
import java.awt.*;
import java.awt.Container;

class GroupLayoutEx {

    JButton b1, b2, b3;
    Container c;

    GroupLayoutEx() {
        JFrame f = new JFrame("Group Layout Example");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        GroupLayout g = new GroupLayout(c);
        c.setLayout(g);
        b1 = new JButton("Hello");
        b2 = new JButton("Hi");
        b3 = new JButton("Heyaaaa!!");

        g.setHorizontalGroup(g.createSequentialGroup().addComponent(b1).addGroup(g.createParallelGroup().addComponent(b2).addComponent(b3)));
       g.setVerticalGroup(g.createParallelGroup().addGroup(g.createSequentialGroup().addComponent(b1).addComponent(b2).addComponent(b3)));
    
       f.setVisible(true);
    
    }

    public static void main(String[] args) {
        new GroupLayoutEx();
    }
}
