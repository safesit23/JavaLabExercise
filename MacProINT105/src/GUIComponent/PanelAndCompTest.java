package GUIComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelAndCompTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Hello World");
        
        panel.add(label);
        frame.add(panel);
        
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
