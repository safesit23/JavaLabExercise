package AddressBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SearchButtonListener implements ActionListener{
    private  JTextField textSearch;
    private JTextField textId;
    private JTextField textFirstName;
    private JTextField textLastName;
    private JTextField textPhone;
    private JButton buttonLeft;
    private JButton buttonRight;
    private AddressBookController addBook;

    public SearchButtonListener(JTextField textSearch, JTextField textId, JTextField textFirstName, JTextField textLastName, JTextField textPhone, JButton buttonLeft, JButton buttonRight) throws SQLException {
        this.textSearch = textSearch;
        this.textId = textId;
        this.textFirstName = textFirstName;
        this.textLastName = textLastName;
        this.textPhone = textPhone;
        this.buttonLeft = buttonLeft;
        this.buttonRight = buttonRight;
        this.addBook = new AddressBookController();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            //System.out.println(e.getActionCommand());
            if(e.getActionCommand().equals("Search")){
                textId.setText("");
                textFirstName.setText("");
                textLastName.setText("");
                textPhone.setText(" ");
                Contact contact = addBook.searchData(textSearch.getText());
                if(contact!=null){
                    textId.setText(Integer.toString(contact.getId()));
                    textFirstName.setText(contact.getFirstName());
                    textLastName.setText(contact.getLastName());
                    textPhone.setText(contact.getPhone());
                    buttonLeft.setEnabled(false);
                    buttonRight.setEnabled(true);
                    if(addBook.getIndex()==addBook.getArrSize()-1){
                        buttonRight.setEnabled(false);
                    }
                }else{
                    
                }
                
            }else if(e.getActionCommand().equals("<")){
                Contact contact = addBook.leftIndex();
                textId.setText(Integer.toString(contact.getId()));
                textFirstName.setText(contact.getFirstName());
                textLastName.setText(contact.getLastName());
                textPhone.setText(contact.getPhone());
                if(addBook.getIndex()==0){
                    buttonLeft.setEnabled(false);
                    buttonRight.setEnabled(true);
                }else{
                    buttonLeft.setEnabled(true);
                    buttonRight.setEnabled(true);
                }
            }else if(e.getActionCommand().equals(">")){
                Contact contact = addBook.rightIndex();
                textId.setText(Integer.toString(contact.getId()));
                textFirstName.setText(contact.getFirstName());
                textLastName.setText(contact.getLastName());
                textPhone.setText(contact.getPhone());
                if(addBook.getIndex()==addBook.getArrSize()-1){
                    buttonLeft.setEnabled(true);
                    buttonRight.setEnabled(false);
                }else{
                    buttonLeft.setEnabled(true);
                    buttonRight.setEnabled(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
}
