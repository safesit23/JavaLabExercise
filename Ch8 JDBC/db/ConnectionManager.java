/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author INT105
 */
public class ConnectionManager {
    public static Connection createConnection
        (String driverClass,String url, String username, String psw) 
        throws ClassNotFoundException, SQLException{
        //1. load driver class and register to DriverManager
        Class.forName(driverClass);     //โหลด DriverClass และ register
        System.out.println("Driver Loaded");
        
        //2.getConnection from Drivermanager
        Connection cn=DriverManager.getConnection(url, username, psw);
        return cn;
        
    }
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }   
}
