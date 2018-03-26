package ch9.fileanddb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sit.model.Student;

public class TestScanner {
    public static void main(String[] args) {
        int numOfLine=0,numOfWord=0,numOfChar=0;
        ArrayList<Student> stdList = new ArrayList<Student>();  //เพิ่ม ArrayList
        try{
            File myFile=new File("StudentList.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){   //Loop นับบรรทัด   โดยผูกกับไฟล์
                numOfLine+=1;
                String line=sc.nextLine();
                //System.out.println(line);
                numOfChar+=line.length();  //นับตัวอักษรรวมช่องว่าง
                Scanner scStr=new Scanner(line);
                while(scStr.hasNext()){         //Loop นับคำ โดยผูกกับString
                    
                    int id=scStr.nextInt();
                    String firstname=scStr.next();
                    String lastname=scStr.next();
                    Student std=new Student(id,firstname,lastname); //1 Records
                    stdList.add(std);
                    
                    numOfWord+=1;
                    //System.out.println(scStr.next());
                }
                //System.out.println("----");
            }
        }
        catch(FileNotFoundException ff){
            System.out.println(ff);
        }
        for(Student stu:stdList){
            System.out.println(stu);
        }
        
        System.out.println("Number of Lines: "+numOfLine);
        System.out.println("Number of Words: "+numOfWord);
        System.out.println("Number of char: "+numOfChar);
    }
}
