package Array;
import java.util.Arrays;
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
        //Find highest
        int highestScore = highestScore(student);

        //Show Info and grade
        for(i=0;i<numOfSt;i++){
            System.out.println("Student "+(i+1)+" score is "+student[i]+" and grade is "+studentGrade(student,i,highestScore));
        }
    }
    
    public static char studentGrade(int[] student,int i,int hs){
        char grade;
        if(student[i]>=hs-10){
            grade = 'A';
        }else if(student[i]>=hs-20){
            grade = 'B';
        }else if(student[i]>=hs-30){
            grade = 'C';
        }else if(student[i]>=hs-40){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
    
    public static int highestScore(int[] student){
        int hs;
        Arrays.sort(student);
        hs = student[student.length-1];
        return hs;
    }
}