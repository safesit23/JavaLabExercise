package Array;
import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num, i;
        System.out.print("Enter num of numbers: ");
        num = input.nextInt();
        int[] numbers = new int[num];
        System.out.print("Enter Number: ");
        for(i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        //calculate sum of all array elements
        for(i=0; i < numbers.length ; i++){
            sum = sum + numbers[i];
        }
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
    }
}
