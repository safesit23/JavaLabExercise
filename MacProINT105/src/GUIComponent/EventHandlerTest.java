package GUIComponent;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventHandlerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EventHandlerTest");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        //--------Component---------
        JTextField text1 = new JTextField("First Text",20);
        JTextField text2 = new JTextField("",20);
        JButton button = new JButton("CHANGE TEXT");
        
        //------ActionListener-------
        ButtonListener buttonEvent = new ButtonListener(text1,text2);
        button.addActionListener(buttonEvent);
        
        
        
        
        //-----add component
        panel.add(text1, BorderLayout.NORTH);
        panel.add(text2, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        frame.add(panel);
        
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
