package AddressBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SearchButtonListener implements ActionListener{
    private  JTextField textSearch;
    private JButton buttonSearch;
    private JTextField textId;
    private JTextField textFirstName;
    private JTextField textLastName;
    private JTextField textPhone;
    private JButton buttonLeft;
    private JButton buttonRight;

    public SearchButtonListener(JTextField textSearch, JTextField textId, JTextField textFirstName, JTextField textLastName, JTextField textPhone, JButton buttonLeft, JButton buttonRight) {
        this.textSearch = textSearch;
        this.buttonSearch = buttonSearch;
        this.textId = textId;
        this.textFirstName = textFirstName;
        this.textLastName = textLastName;
        this.textPhone = textPhone;
        this.buttonLeft = buttonLeft;
        this.buttonRight = buttonRight;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            AddressBookController addBook = new AddressBookController();
            
            if(e.getActionCommand().equals("Search")){
                Contact contact = addBook.searchData(textSearch.getText());
                buttonLeft.setVisible(false);
                buttonRight.setVisible(true);
            }else if(e.getActionCommand().equals("<")){
                Contact contact = addBook.leftIndex();
                if(addBook.getIndex()==0){
                    buttonLeft.setVisible(false);
                    buttonRight.setVisible(true);
                }else{
                    buttonLeft.setVisible(true);
                    buttonRight.setVisible(true);
                }
            }else if(e.getActionCommand().equals(">")){
                Contact contact = addBook.rightIndex();
                if(addBook.getIndex()==addBook.getArrSize()){
                    buttonLeft.setVisible(true);
                    buttonRight.setVisible(false);
                }else{
                    buttonLeft.setVisible(true);
                    buttonRight.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
}
