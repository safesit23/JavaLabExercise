package SitPhoneBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection createConnection(String url, String username, String psw) throws ClassNotFoundException, SQLException{
        //Optional for register driver name to DriverManager
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
        //บอกที่อยู่ของ Database ตัวนั้นเพื่อ Connect
        Connection cn=DriverManager.getConnection(url,username, psw);
        return cn;
    }
    
    //Close Connection
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }
}
