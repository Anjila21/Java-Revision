import javax.swing.*;
import java.awt.*;

public class JScrollBarEx {
  JTextArea ta;
    JScrollBarEx() {
       JFrame f = new JFrame("JScrollPane");
       
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        ta =new JTextArea(10,15);
        
        JScrollPane js = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        f.add(js);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new JScrollBarEx();
    }

}
