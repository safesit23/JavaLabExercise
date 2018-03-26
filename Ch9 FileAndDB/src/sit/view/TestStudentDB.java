package sit.view;

import java.sql.SQLException;
import java.util.Properties;
import sit.controller.StudentController;

public class TestStudentDB {
    public static void main(String[] args) {
        try{
            //StudentController stdCtrl = new StudentController("sit","sit");
            Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl = new StudentController(dbPros);
                    
        }
        /*
        catch(ClassNotFoundException cnfEx){
            System.out.println(cnfEx);
        }
        */
        catch(SQLException sqlEx){
            System.out.println(sqlEx);
        }
        
    }
}
