package sit.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import sit.controller.StudentController;
import sit.controller.StudentSelectionListener;
import sit.model.Student;

public class StudentGUIView {
    private JFrame frameStudent;
    
    private JPanel jpnStudentRecord;
    private JPanel jpnButton;
    //private JPanel jpnStudentTable;
    
    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;
    
    private JButton btnSave;
    private JButton btnSaveAs;
    private JButton btnReset;
    
    private JTable tblStudent; 
    private JScrollPane scrlStudent;
    
    private JPanel jpnStudentLeft;

    public StudentGUIView() throws ClassNotFoundException, SQLException, IOException {
        initGUI();  //ให้ไปสร้างใน method
    }
    
    public void initGUI() throws ClassNotFoundException, SQLException, IOException{
        //-----------new-----------------------------
        frameStudent=new JFrame("Student List");
        jpnStudentRecord=new JPanel(new GridLayout(3,2));
        
        jpnStudentRecord.add(new JLabel("Student Id"));
        txtStdId=new JTextField();
        jpnStudentRecord.add(txtStdId);
        
        jpnStudentRecord.add(new JLabel("FirstName"));
        txtStdFirstName=new JTextField();
        jpnStudentRecord.add(txtStdFirstName);
        
        jpnStudentRecord.add(new JLabel("LastName"));
        txtStdLastName=new JTextField();
        jpnStudentRecord.add(txtStdLastName);
        
        jpnButton=new JPanel();
        btnSave=new JButton("Save");
        btnSaveAs=new JButton("Save As Object");
        btnReset=new JButton("Reset");
        jpnButton.add(btnSave);
        jpnButton.add(btnSaveAs);
        jpnButton.add(btnReset);
        
        //Group Panel Left
        jpnStudentLeft = new JPanel(new BorderLayout());
        jpnStudentLeft.add(jpnStudentRecord,BorderLayout.NORTH);
        jpnStudentLeft.add(jpnButton,BorderLayout.CENTER);
        
        //Table
        loadStudentDataToJTable();
        
        frameStudent.add(jpnStudentLeft,BorderLayout.WEST);
        frameStudent.add(scrlStudent,BorderLayout.CENTER);  //ใช้ ScrollPanel แทน
        frameStudent.setSize(700,400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    
    public void loadStudentDataToJTable() throws ClassNotFoundException, SQLException, IOException{
        //-----------------GET DATA INTO ARRAY2D-------------------
        String[] columnHeader={"Student Id","First Name","Last Name"};
        StudentController stdCtrl = new StudentController("sit","sit");
        //1 ช่องเป็น 1 object
        ArrayList<Student> list = stdCtrl.selectStudent();
        
        //Convert ArrayList to Array 2D
        //Array 2D [row=records][column=3]
        String[][] stdList=new String[list.size()][columnHeader.length];
        for(int i=0;i<stdList.length;i++){
            //เอาข้อมูลแต่ละช่องออกมา
            stdList[i][0] =(list.get(i)).getStdId()+"";
            stdList[i][1] =(list.get(i)).getFirstname();
            stdList[i][2] =(list.get(i)).getLastname();
        }
        
        //-------------------TABLE---------------------
        //JTable table = new JTable(data, columnNames);
        tblStudent=new JTable(stdList,columnHeader);
        //ทำให้เวลาเลือกเลือกได้เพียงอันเดียว
        tblStudent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //ADD Listener (StudentSelectionListener)
        StudentSelectionListener ssl=new StudentSelectionListener(tblStudent, txtStdId, txtStdFirstName, txtStdLastName);
        tblStudent.getSelectionModel().addListSelectionListener(ssl);
        
        /*
        //เอาตารางเข้า panel ผ่านการ add
        scrlStudent = new JScrollPane();
        scrlStudent.add(tblStudent);
        */
        scrlStudent = new JScrollPane(tblStudent);  //เอาตารางเข้า panel
    }
    
}
