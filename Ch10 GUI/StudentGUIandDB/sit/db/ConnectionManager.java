/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author INT105
 */
public class ConnectionManager {
    
    public static Connection createConnection
        (String dbName, 
        String username, String psw) throws ClassNotFoundException, SQLException{
   
        Properties props=new Properties();
        
       // props.put("DERBY_SERVER_NAME", "localhost");
      //  props.put("DERBY_DB_NAME", dbName);
        props.put("user", username);
        props.put("password", psw);
      //  props.put("DERBY_SERVER_PORT", "1527");
           
      //  Connection cn=createConnection(props);
      Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/student", props);
        
        return cn;
    }
        
    public static Connection createConnection(String fileName)throws SQLException, FileNotFoundException, IOException{   
        
            Properties props=new Properties();
            props.load(new FileReader(fileName));
            Connection cn=createConnection(props);
            return cn;
    }
    public static Connection createConnection (Properties props) throws SQLException{
      
        org.apache.derby.jdbc.ClientDataSource ds =
                    new org.apache.derby.jdbc.ClientDataSource();
        
            String server=props.getProperty("SERVER_NAME");
            int port=Integer.parseInt(props.getProperty("SERVER_PORT"));
            String dbName = props.getProperty("DB_NAME");
            String username=props.getProperty("DB_USERNAME");
            String psw=props.getProperty("DB_PASSWORD");
            
            ds.setServerName(server);
            ds.setPortNumber(port);
            ds.setDatabaseName(dbName);
            ds.setUser(username);
            ds.setPassword(psw);
            Connection cn=ds.getConnection();
            return cn;
            
    }
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }
    
  
}