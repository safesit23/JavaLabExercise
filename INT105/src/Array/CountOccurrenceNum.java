package Array;
import java.util.Scanner;
public class CountOccurrenceNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num = new int[100]; 
        int [] count = new int[100];
        int i,temp = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        //เก็บข้อมูล
        for(i=0; i < num.length; i++){
            num[i] = input.nextInt();
            if(num[i] == 0){    //ถ้ากรอกเลข 0 จะหยุดทันที
                break;
            }
        }

        for(i = 0; i < num.length; i++){
            temp = num[i];
            count[temp]++;
        }//end of for looop

        for(i=1; i < count.length; i++){
            if(count[i] > 0 && count[i] == 1){
            System.out.printf("%d occurs %d time\n",i, count[i]);
            }
            else if(count[i] >=2){
            System.out.printf("%d occurs %d times\n",i, count[i]);
            }
        }
    }
}
