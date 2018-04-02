package sit.view;

import java.sql.SQLException;
import java.util.Properties;
import sit.controller.StudentController;
import sit.model.Student;

public class TestStudentDB {
    public static void main(String[] args) {
        try{
            //StudentController stdCtrl = new StudentController("sit","sit");
            Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl = new StudentController(dbPros);
            
            //deleteAllStudents
            /*
            int recs=stdCtrl.deleteAllStudents();
            System.out.println("deleted"+recs+" records");
            */
            
            //inserted
            int rec=stdCtrl.insertStudent(new Student(99,"James","bonds"));
            System.out.println("inserted "+rec+" record");
            
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
