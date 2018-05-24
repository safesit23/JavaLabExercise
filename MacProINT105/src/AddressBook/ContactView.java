package AddressBook;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContactView {
    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("Contact");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel panelNorth = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelSouth = new JPanel();
        panelCenter.setLayout(new GridLayout(4,2));
        
        JTextField textSearch = new JTextField("Enter the name");
        JButton buttonSearch = new JButton("Search");
        JButton buttonImport = new JButton("Import from file to DB..");
        
        JLabel labelId = new JLabel("ID:");
        JTextField textId = new JTextField("");
        JLabel labelFirstName = new JLabel("FirstName:");
        JTextField textFirstName = new JTextField("");
        JLabel labelLastName = new JLabel("LastName: ");
        JTextField textLastName = new JTextField("");
        JLabel labelPhone = new JLabel("Phone: ");
        JTextField textPhone = new JTextField("");
        
        JButton buttonLeft = new JButton("<");
        JButton buttonRight = new JButton(">");
        
        panelNorth.add(textSearch);
        panelNorth.add(buttonSearch);
        panelNorth.add(buttonImport);
        
        panelCenter.add(labelId);
        panelCenter.add(textId);
        panelCenter.add(labelFirstName);
        panelCenter.add(textFirstName);
        panelCenter.add(labelLastName);
        panelCenter.add(textLastName);
        panelCenter.add(labelPhone);
        panelCenter.add(textPhone);
        
        panelSouth.add(buttonLeft);
        panelSouth.add(buttonRight);
        
        ImportButtonListener imBtnListener = new ImportButtonListener();
        buttonImport.addActionListener(imBtnListener);
        
        SearchButtonListener sBtnListener = new SearchButtonListener(textSearch, textId, textFirstName, textLastName, textPhone, buttonLeft, buttonRight);
        buttonSearch.addActionListener(sBtnListener);
        buttonLeft.addActionListener(sBtnListener);
        buttonRight.addActionListener(sBtnListener);
        
        
        panel.add(panelNorth, BorderLayout.NORTH);
        panel.add(panelCenter, BorderLayout.CENTER);
        panel.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panel);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
