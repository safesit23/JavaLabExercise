package Array;
import java.util.Scanner;
public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfSt,i;
        System.out.print("Enter the num of student: ");
        numOfSt = input.nextInt();
        int[] student = new int[numOfSt];
        System.out.print("Enter "+numOfSt+" scores: ");
        for(i=0;i<numOfSt;i++){
            student[i] = input.nextInt();
        }
        
        //Show Info and grade
        for(i=0;i<numOfSt;i++){
            System.out.println("Student "+(i+1)+" score is "+student[i]+" and grade is "+studentGrade(student,i));
        }
    }
    
    public static char studentGrade(int[] student,int i){
        char grade;
        if(student[i]>=80){
            grade = 'A';
        }else if(student[i]>=70){
            grade = 'B';
        }else if(student[i]>=60){
            grade = 'C';
        }else if(student[i]>=50){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
}