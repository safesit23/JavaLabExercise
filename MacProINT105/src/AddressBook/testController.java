/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook;

import java.sql.SQLException;

/**
 *
 * @author jatawatsafe
 */
public class testController {
    public static void main(String[] args) throws SQLException {
        
        AddressBookController addBook = new AddressBookController();
        Contact tct = addBook.searchData("bee");
        System.out.println(tct);
        

    }
}
