package sit.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import sit.db.ConnectionManager;

public class StudentController {
    private Connection con;
    
    public StudentController(String username, String psw) 
            throws ClassNotFoundException, SQLException{ //Constructor
        
        String url="jdbc:derby://localhost:1527/student";           
        con=ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connection created sucessfully");
        
    }
    
    //Overloading Constructor
    public StudentController(Properties pro) throws SQLException{
        String url="jdbc:derby://localhost:1527/student";           
        con=ConnectionManager.createConnection(url, pro);
        System.out.println("Connection created sucessfully");
    }
}
