package SitPhoneBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PhoneController {
    private Connection con;
    
    public PhoneController(String user, String psw) throws ClassNotFoundException, SQLException{
        String url="jdbc:derby://localhost:1527/PhoneBook";
        con = ConnectionManager.createConnection(url, user, psw);
        System.out.println("Connection created Succesfully");
    }
    
    public void CloseConnection() throws SQLException{
        ConnectionManager.closeConnection(con);
        System.out.println("Close Connection Succesfully");
    }
    
    public int addPhoneNumber(String phoneNum,String nickName,int gen) throws SQLException{
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO phonebook(telephone,nickname,gen) "
                + "VALUES ('"+phoneNum+"','"+nickName+"',"+gen+")";
        int numRec = stmt.executeUpdate(sql);
        return numRec;
    }
    
    public void findPhoneNumber(String nickName) throws SQLException{
        ArrayList<PhoneBook> arrBook = new ArrayList<PhoneBook>();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM phonebook WHERE nickname LIKE '"+nickName+"%'";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String phone = rs.getString("telephone");
            String nickname = rs.getString("nickname");
            int gen = rs.getInt("gen");
            PhoneBook pb = new PhoneBook(phone,nickname,gen);
            arrBook.add(pb);
        }
        for(PhoneBook show:arrBook){
            System.out.println(show);
        }
    }
    
}

/*
create table PhoneBook(
telephone varchar(10), nickname varchar(50), gen integer,
primary key(telephone)
);
*/