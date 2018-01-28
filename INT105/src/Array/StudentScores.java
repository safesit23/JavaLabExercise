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
        
        //Show Info
        for(i=0;i<numOfSt;i++){
            System.out.println("Student "+i+" score is "+student[i]);
        }
        
        
    
    
    }
}