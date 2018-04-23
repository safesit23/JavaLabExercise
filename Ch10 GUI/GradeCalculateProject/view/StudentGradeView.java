package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.StudentGrade;

public class StudentGradeView {
    private JFrame frameGrade;  //topLevel
    private JLabel lblSubject[];
    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JButton btnCalculate;
    private StudentGrade[] stdGrade;

    public StudentGradeView(int numOfSubjects,StudentGrade[] myGrade) {
        //create array of Labels and TextFields
        lblSubject = new JLabel[numOfSubjects];
        txtGrade = new JTextField[numOfSubjects];
        txtCredit = new JTextField[numOfSubjects];
        stdGrade = myGrade;
        initGui();
    }
    
    private void initGui(){
        //Create JFrame [Constructor : JFrame(String title)] 
        frameGrade = new JFrame("GPA CALCULATOR");
        //Default Size เป็น 0,0 / Visible เป็น false / ปุ่มปิด(DefaultCloseOperation)
        //โดย FIX ลำดับดังนี้ size, Location, Visible
        frameGrade.setSize(400, 400);
        
        //Set Layout manager to JFrame
        GridLayout grid=new GridLayout(8,3);    //6(content)+1(head)
        frameGrade.setLayout(grid);
        addSubjectToFrame();
        
        btnCalculate=new JButton("Calculate");
        frameGrade.add(btnCalculate);
        
        frameGrade.pack();
        //ทำให้เมื่อเปิดโปรแกรมมาหน้าจอโปรแกรมจะอยู่ตรงกลางของหน้าจอ
        frameGrade.setLocationRelativeTo(null);
        frameGrade.setVisible(true);
        frameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void addSubjectToFrame(){
        //add header label
        frameGrade.add(new JLabel("Subject"));
        frameGrade.add(new JLabel("Grade"));
        frameGrade.add(new JLabel("Credit"));
        
        //add subject, grade, credit
        for(int i=0;i<lblSubject.length;i++){
            lblSubject[i]=new JLabel(stdGrade[i].getSubject());
            txtGrade[i] = new JTextField(stdGrade[i].getGrade());
            //ใช้ Float ของ Wrapper หรืออีกวิธีคือ ""+float
            Float credit = stdGrade[i].getCredit();
            //Casting to string
            txtCredit[i] = new JTextField(credit.toString());
            
            //add each course to frame
            frameGrade.add(lblSubject[i]);
            frameGrade.add(txtGrade[i]);
            frameGrade.add(txtCredit[i]);
        }
    }
    
}
