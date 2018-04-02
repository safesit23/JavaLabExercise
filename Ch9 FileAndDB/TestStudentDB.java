package sit.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import sit.controller.StudentController;
import sit.model.Student;

public class TestStudentDB {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int rec;
        try{
            //Connection1
            //StudentController stdCtrl = new StudentController("sit","sit");
            
            //Connection by Properties
            /*
            Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl = new StudentController(dbPros);
            */
            
            //Connection by Properties by File
            String file="dpProperties.txt";
            StudentController stdCtrl = new StudentController(file);
            
            //deleteAllStudents
            /*
            rec=stdCtrl.deleteAllStudents();
            System.out.println("deleted"+recs+" records");
            */
            
            //inserted
            /*
            rec=stdCtrl.insertStudent(new Student(99,"James","bonds"));
            System.out.println("inserted "+rec+" record");
            */
            
            //findStudentById
            //stdCtrl.findStudentById(201);
            
            //findStudentByname
            //stdCtrl.findStudentByname("James");
            
            //updateStudent
            /*
            rec=stdCtrl.updateStudent(new Student(99,"James","bonds"));
            System.out.println("inserted "+rec+" record");
            */
            
            //insertStudentBatch(File)
            /*
            File myFile=new File("StudentList.txt");
            rec=stdCtrl.insertStudentBatch(myFile);
            System.out.println("inserted "+rec+" record");
            */
            
            //insertStudentBatch(ArrayList)
            /*ArrayList<Student> stdList = new ArrayList<Student>();
            stdList.add(new Student(201,"AA","aaa"));
            stdList.add(new Student(202,"BB","bbb"));
            stdList.add(new Student(203,"CC","ccc"));
            System.out.println(""+stdList.size());
            rec=stdCtrl.insertStudentBatch(stdList);
            System.out.println("inserted "+rec+" record");
            */
            
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