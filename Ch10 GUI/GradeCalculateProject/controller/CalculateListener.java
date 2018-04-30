package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
//ตัวดักฟัง (Listener)
public class CalculateListener implements ActionListener{
     private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JTextField txtGPA;
    
    //ต้องการ Array ของ Grade+Credit หลังจากนั้นคำนวณและเก็บลง txtGPA
    public CalculateListener(JTextField txtGrade[],JTextField txtCredit[],JTextField txtGPA){
        this.txtGrade=txtGrade;
        this.txtCredit=txtCredit;
        this.txtGPA=txtGPA;
    }
    //parameter e คือเกาะอยู่ที่ปุ่มที่กด
    @Override
    public void actionPerformed(ActionEvent e) {
        /*//แสดงว่าปุ่มไหนถูกกด
        System.out.println(e.getActionCommand());
        */
        
        float gpa=0;
        float totalCredit=0;
        float totalGrade=0;
        for(int i=0;i<txtGrade.length;i++){
            float grade=convertLetterGradeToNumber(txtGrade[i].getText());
            float credit=Float.parseFloat(txtCredit[i].getText());
            totalGrade+=grade*credit;
            totalCredit+=credit;
        }
        gpa=totalGrade/totalCredit;
        txtGPA.setText(gpa+"");
    }
    
    public float convertLetterGradeToNumber(String grade){
        float value;
        switch(grade){
            case "A":   value=4;     break;
            case "B+":  value=3.5f;   break;
            case "B":   value=3;     break;
            case "C+":  value=2.5f;   break;
            case "C":   value=2;     break;
            case "D+":  value=1.5f;   break;
            case "D":   value=1;     break;
            case "F":   value=0;     break;
            default:    value=-1; 
        }
        return value;
    }
    
}
