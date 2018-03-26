package sit.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import sit.db.ConnectionManager;

public class StudentController { //จัดการเฉพาะ Student DB
    private Connection con;
    
    public StudentController(String username, String psw) 
            throws ClassNotFoundException, SQLException{ //Constructor
        
        String url="jdbc:derby://localhost:1527/student";           
        con=ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connection created sucessfully");
        
    }
    
    ////Another ways to Connection by Properties (Overloading Constructor)
    public StudentController(Properties pro) throws SQLException{
        String url="jdbc:derby://localhost:1527/student";           
        con=ConnectionManager.createConnection(url, pro);
        System.out.println("Connection created sucessfully");
    }
    
    //Execution
    public int deleteAllStudents() throws SQLException{
        int deletedRecs=0;
        String sql="delete from student";
        Statement stmt=con.createStatement();
        deletedRecs=stmt.executeUpdate(sql);
        return deletedRecs;
    }
    
    //Close Connection of Student DB
    public void close() throws SQLException{
        ConnectionManager.closeConnection(con);
    }
    
}
