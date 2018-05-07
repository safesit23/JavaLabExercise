package sit.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentGUIView {
    private JFrame frameStudent;
    
    private JPanel jpnStudentRecord;
    private JPanel jpnButton;
    private JPanel jpnStudentTable;
    
    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;
    
    private JButton btnSave;
    private JButton btnSaveAs;
    private JButton btnReset;
    
    private JTable tblStudent; 
    private JScrollPane scrlStudent;
    
    private JPanel jpnStudentLeft;

    public StudentGUIView() {
        initGUI();  //ให้ไปสร้างใน method
    }
    
    public void initGUI(){
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
        jpnStudentTable=new JPanel();
        tblStudent=new JTable();
        //add data to table here
        scrlStudent=new JScrollPane();
        scrlStudent.add(tblStudent);
        jpnStudentTable.add(scrlStudent);
        
        frameStudent.add(jpnStudentLeft,BorderLayout.WEST);
        frameStudent.add(jpnStudentTable,BorderLayout.CENTER);
        frameStudent.setSize(700,400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
    
}
