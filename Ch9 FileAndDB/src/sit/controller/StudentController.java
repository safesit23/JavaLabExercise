package sit.controller;
import java.sql.Connection;
import java.sql.SQLException;
import sit.db.ConnectionManager;

public class StudentController {
    private Connection con;
    
    public StudentController(String username, String psw) 
            throws ClassNotFoundException, SQLException{ //Constructor
        
        String url="jdbc:derby://localhost:1527/student";
        con=ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connection created sucessfully");
        
    }
}
