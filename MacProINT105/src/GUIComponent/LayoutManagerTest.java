package GUIComponent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutManagerTest {
    public static void main(String[] args) {
        /*---//FlowLayout---*/
        JFrame frame = new JFrame("BorderLayout");
        JPanel panel = new JPanel();
        
        /*---//GridLayout---*/
        //panel.setLayout(new GridLayout(3,2));
        
        /*---//BorderLayout---*/
        panel.setLayout(new BorderLayout());
        
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        
        
        //add comp (Normal)
//        panel.add(button1);
//        panel.add(button2);
//        panel.add(button3);
//        panel.add(button4);
//        panel.add(button5);
        
        /*---//BorderLayout---*/
        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(button3, BorderLayout.EAST);
        panel.add(button4, BorderLayout.WEST);
        panel.add(button5, BorderLayout.CENTER);
        /**/
        
        frame.add(panel);
        
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*---------------------------*/
    }
}
