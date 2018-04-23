/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.StudentGrade;
public class TestStudentGradeGui {
    public static void main(String[] args) {
        StudentGrade myGrade[] = new StudentGrade[6];
        myGrade[0]= new StudentGrade("INT105",3,"A");
        myGrade[1]= new StudentGrade("INT106",3,"A");
        myGrade[2]= new StudentGrade("INT107",3,"A");
        myGrade[3]= new StudentGrade("GEN111",3,"A");
        myGrade[4]= new StudentGrade("LNG103",3,"A");
        myGrade[5]= new StudentGrade("MTH111",3,"A");
        StudentGradeView sgv = new StudentGradeView(6,myGrade);
    }
    
}
