package sit.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import sit.db.ConnectionManager;
import sit.model.Student;

public class StudentController { //จัดการเฉพาะ Student DB
    private Connection con;
    
/*--------------------------StudentController----------------------------------*/
    public StudentController(String username, String psw) 
            throws ClassNotFoundException, SQLException{ //Constructor
        
        String url="jdbc:derby://localhost:1527/student";           
        con=ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connection (1) created sucessfully");
    }
    
    //Another ways to Connection by Properties (Overloading Constructor)
    public StudentController(Properties pro) throws SQLException{
        String url="jdbc:derby://localhost:1527/student";           
        con=ConnectionManager.createConnection(url, pro);
        System.out.println("Connection (2) created sucessfully");
    }
    
    //Another ways to Connection by Properties by File (Overloading Constructor)
    public StudentController(String fileName) throws SQLException, IOException{
        con=ConnectionManager.createConnection(fileName);
        System.out.println("Connection (3) by Properties by File Succesfully");
    }
    
/*------------------------------Execute------------------------------------*/
    
    //Delete All Students
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
    
    //Insert Student
    public int insertStudent(Student std) throws SQLException{
        int insertedRec=0;
        int id=std.getStdId();
        String first=std.getStdFirstName();
        String last=std.getStdLastName();
        String sq1="insert into student(stdId,firstname,lastname) "
                + "values ("+id+", '"+first+"', '"+last+"')";
        //Print ข้อมูลมาเพื่อเช็ค
        System.out.println("SQL inserted="+sq1);
        Statement stmt=con.createStatement();
        insertedRec=stmt.executeUpdate(sq1);
        return insertedRec;
    }
    
    //Insert Student by File    **ไม่จำเป้นต้องทำ 2 LOOP
    public int insertStudentBatch(File student) throws FileNotFoundException, SQLException{
        int insertedRec=0;
        String sq1;
            Scanner sc = new Scanner(student);
            while(sc.hasNextLine()){   //Loop บรรทัด   โดยผูกกับไฟล์
                String line=sc.nextLine();
                Scanner scStr=new Scanner(line);
                while(scStr.hasNext()){         //Loop คำ โดยผูกกับString
                    int id=scStr.nextInt();
                    String firstname=scStr.next();
                    String lastname=scStr.next(); 
                    sq1="insert into student(stdId,firstname,lastname) "
                    + "values ("+id+", '"+firstname+"', '"+lastname+"')";
                    Statement stmt=con.createStatement();
                    insertedRec+=stmt.executeUpdate(sq1);
                }
            }
        return insertedRec;
    }
        
    //Insert Student by ArrayList
    public int insertStudentBatch(ArrayList<Student> studentList) throws SQLException{
        int insertedRec=0;
        int count=studentList.size();
        String sq1;
        for(int i=0;i<count;i++){
            int id=studentList.get(i).getStdId();
            String firstname=studentList.get(i).getStdFirstName();
            String lastname=studentList.get(i).getStdLastName();
            sq1="insert into student(stdId,firstname,lastname) "
                    + "values ("+id+", '"+firstname+"', '"+lastname+"')";
            Statement stmt=con.createStatement();
            insertedRec+=stmt.executeUpdate(sq1);
        }
        return insertedRec;
    }
    
    //Update Student
    public int updateStudent(Student std) throws SQLException{
        int insertedRec=0;
        int id=std.getStdId();
        String first=std.getStdFirstName();
        String last=std.getStdLastName();
        String sq1="UPDATE student SET FIRSTNAME='"+first+"',lastname='"+last+"' WHERE stdid="+id;
        //Print ข้อมูลมาเพื่อเช็ค
        System.out.println("SQL update="+sq1);
        Statement stmt=con.createStatement();
        insertedRec=stmt.executeUpdate(sq1);
        return insertedRec;
    }
    
    //Find Student by ID (USE ResultSet)
    public void findStudentById(int id) throws SQLException{
        ArrayList<Student> stdList = new ArrayList<Student>();
        String sql = "SELECT * FROM STUDENT WHERE STDID="+id; 
        //Print ข้อมูลมาเพื่อเช็ค
        System.out.println("SQL findById="+sql);    
        // เตรียมคำสั่ง SQL
        Statement stmt=con.createStatement();
        //executQuery จะได้เป็น ResultSet ได้ออกมาเป็นตาราง
        ResultSet resultSet = stmt.executeQuery(sql);
        // วนลูปดึงข้อมูลจนกว่าจะหมด
        while (resultSet.next()) {
        // กำหนดค่าให้ออบเจ็กต์โดยค่าที่ดึงมาจากตาราง Student
            int tempid=resultSet.getInt("STDID");
            String firstname=resultSet.getString("FIRSTNAME");
            String lastname=resultSet.getString("LASTNAME");
            Student std=new Student(tempid,firstname,lastname); //1 Records
            stdList.add(std);   //เก็บข้อมูลแต่ละออบเจ็กต์ลงไปในตัวแปรประเภท List
            }
        for(Student stu:stdList){
            System.out.println(stu);
        }
    }
    
    //Find Student by ID (USE ResultSet)
    public void findStudentByname(String name) throws SQLException{
        ArrayList<Student> stdList = new ArrayList<Student>();
        String sql = "SELECT * FROM STUDENT WHERE FIRSTNAME='"+name+"'"; 
        //Print ข้อมูลมาเพื่อเช็ค
        System.out.println("SQL findByName="+sql);        
        // เตรียมคำสั่ง SQL
        Statement stmt=con.createStatement();
        //executQuery จะได้เป็น ResultSet ได้ออกมาเป็นตาราง
        ResultSet resultSet = stmt.executeQuery(sql);
        // วนลูปดึงข้อมูลจนกว่าจะหมด
        while (resultSet.next()) {
            // กำหนดค่าให้ออบเจ็กต์โดยค่าที่ดึงมาจากตาราง Student
            int tempid=resultSet.getInt("STDID");
            String firstname=resultSet.getString("FIRSTNAME");
            String lastname=resultSet.getString("LASTNAME");
            Student std=new Student(tempid,firstname,lastname); //1 Records
            stdList.add(std);   //เก็บข้อมูลแต่ละออบเจ็กต์ลงไปในตัวแปรประเภท List
            }
        for(Student stu:stdList){
            System.out.println(stu);
        }
    }
    
/*-----------------------------Execute By AjUmaporn----------------------------*/
    //Insert Student from File (By AjUmaporn)
    public int insertStudentFromFile(String filename) throws FileNotFoundException, SQLException{
        int insertedRec=0;
        String sq1;
        Scanner sc = new Scanner(new File(filename));
        //sc.useDelimiter(",");     //แบ่งคำโดยใช้ Delimiter
        
        while(sc.hasNext()){
            int id=sc.nextInt();
            String firstname=sc.next();
            String lastname=sc.next();
            System.out.println(id+" "+firstname+" "+lastname);
            //ไปเรียก method insertStudent ที่เคยเขียนเอาไว้
            insertedRec+=insertStudent(new Student(id,firstname,lastname));
        }
        
        return insertedRec;
    }
    
    //select Student
    public ArrayList<Student> selectStudent() throws SQLException{
        Statement stmt=con.createStatement();
        String sq1="SELECT * FROM STUDENT";
        System.out.println(sq1);
        ResultSet rs=stmt.executeQuery(sq1);
        ArrayList<Student> stdList = new ArrayList<Student>();
        // read column of each record in ResultSet
        while(rs.next()){
            //get datatype โดยระบุ column
            int id = rs.getInt("STDID");   
            String firstname=rs.getString("FIRSTNAME");
            String lastname=rs.getString("LASTNAME");
            //orm process
            Student std=new Student(id,firstname,lastname); //1 Records
            stdList.add(std);   //เก็บข้อมูลแต่ละออบเจ็กต์ลงไปในตัวแปรประเภท List
        }
        return stdList;
    }

    //execute Command
    public ArrayList<Student> executeSQLCommand(String sq1) throws SQLException{
        ArrayList<Student> stdList = null;
        Statement stmt=con.createStatement();
        boolean isSelectedCmd=stmt.execute(sq1);
        if(isSelectedCmd){  //true return stdList
            stdList = new ArrayList<>();
            ResultSet rs=stmt.getResultSet();
            while(rs.next()){
            //get datatype โดยระบุ column
            int id = rs.getInt("STDID");   
            String firstname=rs.getString("FIRSTNAME");
            String lastname=rs.getString("LASTNAME");
            //orm process
            Student std=new Student(id,firstname,lastname); //1 Records
            stdList.add(std);   //เก็บข้อมูลแต่ละออบเจ็กต์ลงไปในตัวแปรประเภท List
            }
        }else{  //false return null
            int updateRecs=stmt.getUpdateCount();
            System.out.println(updateRecs+" update Recs");
        }
        
        return stdList;
    }
    
    
    
}