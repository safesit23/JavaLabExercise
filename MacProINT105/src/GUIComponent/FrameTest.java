package GUIComponent;

import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameTest");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
