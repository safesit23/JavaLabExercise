package AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookController {
    private Connection con;
    private ArrayList<Contact> contactList;
    private int currContactIndex;

    public AddressBookController() throws SQLException {
        createConnection("jdbc:derby://localhost:1527/PhoneBook","sit","sit");
    }
    
    
    public void createConnection(String url,String username,String psw) throws SQLException{
        contactList = new ArrayList<Contact>();
        con=DriverManager.getConnection(url, psw, psw);
        System.out.println("AddressBook connect successfully!");
    }
    
    public void closeConnection() throws SQLException{
        con.close();
    }
    
    public void importData() throws SQLException {
        int result=0;
        try {
            Scanner input = new Scanner(new File("addressData.csv"));
            while(input.useDelimiter(",").hasNext()){
                int id = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                String phone = input.next();
                System.out.println("SHOW : "+id+" "+firstName+" "+lastName+" "+" "+phone);
                String sql = "insert into contact(id,firstname,lastname,phone) values(?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.setString(2, firstName);
                pstmt.setString(3, lastName);
                pstmt.setString(4, phone);
                result+=pstmt.executeUpdate();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } finally{
            System.out.println("Show result: "+result);
        }
        
        
    }
}
