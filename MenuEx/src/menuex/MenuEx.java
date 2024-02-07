import javax.swing.*;
import java.awt.*;

public class MenuEx {

    MenuEx() {
        
        
        JFrame f= new JFrame("MenuBar Example");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        JMenuBar mb = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Close");
        JMenuItem i3 = new JMenuItem("Save As");
        
        file.add(i1);
        file.add(i2);
        file.add(i3);
        
        mb.add(file);
        JMenu edit = new JMenu("Edit");
        
        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");
        
        edit.add(i4);
        edit.add(i5);
        
        mb.add(edit);
        
        
        f.setJMenuBar(mb);
        f.setVisible(true);
        
        

    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
