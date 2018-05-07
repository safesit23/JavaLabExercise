package sit.controller;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/*
สร้าง ListSelectionListener เพื่อเมื่อที่จะเลือกแถวไหนจะแสดงข้อมูลใน left panel แล้วสามารถแก้ไขข้อมูลได้
*/

public class StudentSelectionListener implements ListSelectionListener{
    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;
    private JTable tblStudent; 

    //เป็นข้อมูลชุดเดียวกับที่ view
    public StudentSelectionListener(JTable tblStudent, JTextField txtStdId, JTextField txtStdFirstName, JTextField txtStdLastName) {
        this.tblStudent = tblStudent;
        this.txtStdId = txtStdId;
        this.txtStdFirstName = txtStdFirstName;
        this.txtStdLastName = txtStdLastName;
    }

    //(Implements method เดียว) ทุกครั้งที่เปลี่ยนแถว valueChanged จะทำงาน
    @Override
    public void valueChanged(ListSelectionEvent e) {
        //รู้ว่าเลือกแถวไหน
        int selectRow=tblStudent.getSelectedRow();
        //เอาข้อมูลออกมา tblStudent.getValueAt(int Row, int Column)
        String stdId=(String)(tblStudent.getValueAt(selectRow, 0));
        String stdFirstName=(String)(tblStudent.getValueAt(selectRow, 1));
        String stdLastName=(String)(tblStudent.getValueAt(selectRow, 2));
        
        //เอาข้อมูลโชว์ใน TextField ผ่านการเรียก setText
        txtStdId.setText(stdId);
        txtStdFirstName.setText(stdFirstName);
        txtStdLastName.setText(stdLastName);
    }
}
    

