/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import sit.db.ConnectionManager;
import sit.model.Student;


public class StudentController {
    private Connection cn;
    
    public StudentController(String fileName) throws ClassNotFoundException, SQLException, IOException{
        cn=ConnectionManager.createConnection(fileName);
        System.out.println("Connect Successfully");
       
    }
    
    public StudentController(String username, String psw) throws ClassNotFoundException, SQLException, IOException{
        String url="jdbc:derby://localhost:1527/student";
        cn=ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connect Successfully");
    }
    
    public int deleteStudent(String withCondition) throws SQLException{
        int deletedRecord=0;
        Statement stmt=cn.createStatement();
        deletedRecord=stmt.executeUpdate("delete from student where "+withCondition);
        return deletedRecord;   
    }
    
    public int insertStudentBatch(ArrayList<Student> stdBatch) throws SQLException{
        int totalInsertedRecord=0;
        for (int i = 0; i < stdBatch.size(); i++) {
            totalInsertedRecord+=insertStudent(stdBatch.get(i));
        }
        return totalInsertedRecord;
    }
    
    public int insertStudent(Student std) throws SQLException{
        Statement stm=cn.createStatement();
        String sql="insert into student values("+std.getStdId()+ ", '"+std.getFirstname()+"', '" +std.getLastname()+"')";
        System.out.println(sql);
        int insertedRecord=stm.executeUpdate(sql);
       
        return insertedRecord;
        
    }
    
    public int insertStudentFromFile(String fileName) throws FileNotFoundException, SQLException{
        String sql="insert into student(stdid, firstname, lastname) values(?,?,?)";
        System.out.println(sql);
        PreparedStatement ps=cn.prepareStatement(sql);
        Scanner scFile=new Scanner(new File(fileName));
        int insertedRecs=0;
        while(scFile.hasNext()){
            ps.setInt(1, scFile.nextInt());
            ps.setString(2, scFile.next());
            ps.setString(3, scFile.next());
            insertedRecs+=ps.executeUpdate();
            System.out.println(insertedRecs+" inserted record;");
        }
        return insertedRecs;    
    }
    
    public int updateStudentName(String [] newName, int [] stds) throws SQLException{
        
        int total=0;
        String sql="update student set firstname = ? where stdId = ?";
        PreparedStatement ps=cn.prepareStatement(sql);
        
        for (int i = 0; i < newName.length; i++) {
            ps.setString(1, newName[i]);
            ps.setInt(2, stds[i]);
            total+=ps.executeUpdate();
        }
        return total;
        
    }
    
    public ArrayList<Student> executeYourCommand(String sql) throws SQLException{
        ArrayList<Student> stdList=null;
        Statement stmt=cn.createStatement();
        boolean hasResultSet=stmt.execute(sql);
        if(hasResultSet){
            stdList=new ArrayList<Student>();
            ResultSet studentResultSet=stmt.getResultSet();
            while(studentResultSet.next()){
                Student std=new Student();
                orm(studentResultSet, std);
                stdList.add(std);
            }
            
        }
        else{
            int updateRecs=stmt.getUpdateCount();
            System.out.println(updateRecs+" Updated Records");
        }
        return stdList;
    }
            
    public ArrayList<Student> findByStudentName(String name) throws ClassNotFoundException, SQLException, IOException{
        ArrayList<Student> stdList=selectStudent(true, "where firstname like '%"+name+"%'");
        return stdList;
          
    }
  
    public ArrayList<Student> selectStudent()throws SQLException{
        ArrayList<Student> stdList=new ArrayList<Student>();
        Statement stm=cn.createStatement();
        String sql="select * from student";
     
        ResultSet rs=stm.executeQuery(sql);
      
        while(rs.next()){
            Student std=new Student();
            orm(rs,std);
            stdList.add(std);
            //new Student(rs.getInt("stdId"),rs.getString("firstname"),rs.getString("lastname")));
            
        }
        return stdList;
    }
    public void orm(ResultSet rs, Student std) throws SQLException{
        int stdId=rs.getInt("stdId");
        String firstname= rs.getString("firstname");
        String lastname=rs.getString("lastname");
        std.setStdId(stdId);
        std.setFirstname(firstname);
        std.setLastname(lastname);
      //  System.out.println(std);
    }
    
    
    public ArrayList<Student> selectStudent(boolean filter, String whereClause)throws SQLException, IOException, ClassNotFoundException, FileNotFoundException{
        //Connection cn=ConnectionManager.createConnection("student", "sit", "sit");
        ArrayList<Student> stdList=new ArrayList<Student>();
        Statement stm=cn.createStatement();
        String sql="select * from student";
        if(filter)
            sql+=" "+whereClause;
       // System.out.println(sql);
        ResultSet rs=stm.executeQuery(sql);
        
        while(rs.next()){
         /*   System.out.println(rs.getInt("stdId")+", "+
                    rs.getString("firstname")+", "+
                    rs.getString("lastname"));*/
          //  stdList.add(new Student(rs.getInt("stdId"),rs.getString("firstname"),rs.getString("lastname")));
          Student std=new Student();
          orm(rs, std);
          stdList.add(std);
            
        }
   
        return stdList;
    }
    
    public String[] getStudentColumnName() throws SQLException{
        Statement stmt=cn.createStatement();
        String sql="select * from student";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        
        String[] stdColumns=new String[rsmd.getColumnCount()];
        //System.out.println("count = "+rsmd.getColumnCount());
        for (int i = 0; i < rsmd.getColumnCount(); i++) {
           stdColumns[i]=rsmd.getColumnName(i+1);
           
            
        }
        return stdColumns;

    }
    public void close() throws SQLException{
        ConnectionManager.closeConnection(cn);
    }
}
