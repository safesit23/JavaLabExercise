package AddressBook;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContactView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contact");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel panelNorth = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelSouth = new JPanel();
        panelCenter.setLayout(new GridLayout(4,2));
        
        
        
        panel.add(panelNorth);
        panel.add(panelCenter);
        panel.add(panelSouth);
        frame.add(panel);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
