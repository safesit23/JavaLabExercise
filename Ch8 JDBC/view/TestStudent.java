/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import sit.db.StudentController;

/**
 *
 * @author INT105
 */
public class TestStudent {
    public static void main(String[] args) {
        StudentController stdCtrl = new StudentController();
        try{
            //stdCtrl.connectStudentDB(driverClass, url, username, psw); แล้วให้นำข้อมูลจาก DB Connection มาใส่
            stdCtrl.connectStudentDB("org.apache.derby.jdbc.ClientDriver", 
                "jdbc:derby://localhost:1527/student", "sit", "sit");
            stdCtrl.selectAllStudents("select * from student");
        }
        catch(ClassNotFoundException cf){
            System.out.println(cf);
        }
        catch(SQLException sql){
            System.out.println(sql);
        }
    }
}
