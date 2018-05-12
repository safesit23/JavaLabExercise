package SitPhoneBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM food WHERE nickname LIKE '"+nickName+"%'";
        ResultSet rs = stmt.executeQuery(sql);
    }
    
}

/*
create table PhoneBook(
telephone varchar(10), nickname varchar(50), gen integer,
primary key(telephone)
);
*/