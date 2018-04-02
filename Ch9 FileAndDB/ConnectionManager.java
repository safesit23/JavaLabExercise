package sit.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager { //สำหรับ Database ใดๆก็ได้
    //เก็บแยก items
    public static Connection createConnection 
        (String url, String username, String psw) 
        throws ClassNotFoundException, SQLException{
            //Optional for register driver name to DriverManager
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
            //บอกที่อยู่ของ Database ตัวนั้นเพื่อ Connect
            Connection cn=DriverManager.getConnection(url, username, psw);
            return cn;
    }
    
    //Another ways to Connection by Properties
    public static Connection createConnection(String url, Properties props) throws SQLException{
        Connection cn=DriverManager.getConnection(url, props);
        return cn;
    }
    
    //Another ways to Connection by Properties File
    public static Connection createConnection(String fileName) throws FileNotFoundException, IOException, SQLException{
        Properties props=new Properties();
        
        //ใช้ class File Reader
        props.load(new FileReader(fileName));   //ผูก Class Properties กับ file
        
        //getProperty จะได้เป็น String ไม่จำเป็นต้องเรียง
        String serverName=props.getProperty("SERVER_NAME"); //ให้ getProperty ตรงกับที่เราตั้งไว้(เรียกว่า KEY)
        String serverPort=props.getProperty("SERVER_PORT");
        String dbName=props.getProperty("DB_NAME");
        String dbUser=props.getProperty("DB_USER");
        String dbPassword=props.getProperty("DB_PASSWORD");
        
        //สร้าง Object =ชื่อ ds    ( เหมือน Scanner ds = new Scanner() )
        org.apache.derby.jdbc.ClientDataSource ds= new org.apache.derby.jdbc.ClientDataSource();
        ds.setServerName(serverName);
        ds.setPortNumber(Integer.parseInt(serverPort));
        ds.setDatabaseName(dbName);
        ds.setUser(dbUser);
        ds.setPassword(dbPassword);
        Connection cn = ds.getConnection();
        return cn;
    }
    
    
    //Close Connection
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }
    
}