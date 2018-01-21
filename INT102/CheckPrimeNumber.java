package Exercise;
import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumX,LimitNum=2;
        boolean PrimeNum=true,T=true,F=false;
        System.out.println("This is PRIME NUMBER or not?");
        System.out.print("Enter Integer: ");
        NumX=input.nextInt();
        if(NumX>1){
            while(NumX>LimitNum){
                if(NumX%LimitNum==0){
                    PrimeNum=false;break;
                }
                LimitNum++;
            }
            if(PrimeNum&&T){
                System.out.println(NumX+" is Prime Number.");
            }else{
                System.out.println(NumX+" is not Prime Number.");
            }
        }else{
            System.out.println(NumX+" is not Prime Number.");
        }
    }
}