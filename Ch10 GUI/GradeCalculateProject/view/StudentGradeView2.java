package view;

import controller.CalculateListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.StudentGrade;

public class StudentGradeView2 {
    private JFrame frameGrade;  //topLevel
    private JLabel lblSubject[];
    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JButton btnCalculate;
    private StudentGrade[] stdGrade;
    private JTextField txtGPA;
    private JPanel jpnSubject;
    private JPanel jpnCalculate;
    

    public StudentGradeView2(int numOfSubjects,StudentGrade[] myGrade) {
        //create array of Labels and TextFields
        lblSubject = new JLabel[numOfSubjects];
        txtGrade = new JTextField[numOfSubjects];
        txtCredit = new JTextField[numOfSubjects];
        stdGrade = myGrade;
        initGui();
    }
    
    private void initGui(){
        FlowLayout flow =new FlowLayout();
        jpnCalculate=new JPanel();
        jpnCalculate.setLayout(flow);

        
        //--------------------------------------------
        jpnCalculate.add(new JLabel("GPA"));
        txtGPA=new JTextField("0.00");
        jpnCalculate.add(txtGPA);
        
        btnCalculate=new JButton("Calculate");
        //ส่งข้อมูลใน text ให้ Listener
        CalculateListener c1 = new CalculateListener(txtGrade, txtCredit, txtGPA);
        //นำปุ่มไปผูกกับ addActionListener
        btnCalculate.addActionListener(c1);
        jpnCalculate.add(btnCalculate);
        //------------------------------------------------
        addSubjectToFrame();
        //Create JFrame [Constructor : JFrame(String title)] 
        frameGrade = new JFrame("GPA CALCULATOR");
        //Default Size เป็น 0,0 / Visible เป็น false / ปุ่มปิด(DefaultCloseOperation)
        //โดย FIX ลำดับดังนี้ size, Location, Visible
        frameGrade.setSize(400, 400);
        frameGrade.add(jpnSubject, BorderLayout.NORTH);
        frameGrade.add(jpnCalculate, BorderLayout.CENTER);
        frameGrade.pack();
        //ทำให้เมื่อเปิดโปรแกรมมาหน้าจอโปรแกรมจะอยู่ตรงกลางของหน้าจอ
        frameGrade.setLocationRelativeTo(null);
        frameGrade.setVisible(true);
        frameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void addSubjectToFrame(){
        GridLayout grid = new GridLayout(7,3);
        jpnSubject=new JPanel();
        jpnSubject.setLayout(grid);
        /*
        หรือเขียนแบบนี้
        JPanel jpnSubject = new JPanel(new GridLayout(7,3));
        */
        
        //add header label
        jpnSubject.add(new JLabel("Subject"));
        jpnSubject.add(new JLabel("Grade"));
        jpnSubject.add(new JLabel("Credit"));
        
        //add subject, grade, credit
        for(int i=0;i<lblSubject.length;i++){
            lblSubject[i]=new JLabel(stdGrade[i].getSubject());
            txtGrade[i] = new JTextField(stdGrade[i].getGrade());
            //ใช้ Float ของ Wrapper หรืออีกวิธีคือ ""+float
            Float credit = stdGrade[i].getCredit();
            //Casting to string
            txtCredit[i] = new JTextField(credit.toString());
            
            //add each course to frame
            jpnSubject.add(lblSubject[i]);
            jpnSubject.add(txtGrade[i]);
            jpnSubject.add(txtCredit[i]);
        }
    }
    
}
