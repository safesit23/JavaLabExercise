package Array;
import java.util.Scanner;
public class SitStudent {
    public static void main(String[] args) {
        int i;
        double tempS;
        String tempN;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Student: ");
        int num = input.nextInt();
        Student std[] = new Student[num];
        for(i=0;i<std.length;i++){
            System.out.print("\nStudent"+(i+1)+"\nEnter Name: ");
            tempN = input.next();
            System.out.print("Enter Scores: ");
            tempS = input.nextDouble();
            std[i] = new Student(tempN,tempS);
        }
        
        System.out.println("\nSIT SCHOOL have "+Student.getCountStudent()+" students.");
        System.out.println("SIT INFO");
        for(i=0;i<std.length;i++){
            System.out.println(std[i].toString());
        }
        System.out.println("\n"+highestScore(std));
    }
    
    public static String highestScore(Student[] std){
        double highScore = std[0].getScores();
        int index = 0;
        for(int i=0;i<std.length;i++){
            if(std[i].getScores()>highScore){
                index = i;
            }
        }
        return "The Student named "+std[index].getName()+" get Highest Scores = "+std[index].getScores();
    }
}
