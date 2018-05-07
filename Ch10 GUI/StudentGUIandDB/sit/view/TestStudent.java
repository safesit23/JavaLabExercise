package sit.view;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import sit.controller.StudentController;
import sit.model.Student;

public class TestStudent {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
      StudentController stdCtrl = new StudentController("sit","sit");
      StudentGUIView stdView = new StudentGUIView();
        System.out.println("List of Student: ");
      ArrayList<Student> list = stdCtrl.selectStudent();
      for(Student std:list){
          System.out.println(std);
      }
        
    }
}

