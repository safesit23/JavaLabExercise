
package AddressBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ImportButtonListener implements ActionListener{

    public ImportButtonListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            AddressBookController addBook = new AddressBookController();
            addBook.importData();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}
