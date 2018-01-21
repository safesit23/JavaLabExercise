package Exercise;
import java.util.Scanner;
public class CarparkRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HourIn, MinIn, HourOut, MinOut,Mintt,RateH,RateM,Value;
        System.out.print("Time In: ");
        HourIn=input.nextInt();
        MinIn=input.nextInt();
        System.out.print("Time Out: ");
        HourOut=input.nextInt();
        MinOut=input.nextInt();
        Mintt=((HourOut*60)-(HourIn*60))+(MinOut-MinIn);
        
        if(Mintt<=15){
            Value=0;
        }else if(Mintt<=180){
            RateH=Mintt/60;
            RateM=Mintt%60;
            if(RateM==0){
                RateH=RateH+0;
            }else{
                RateH=RateH+1;
            }
            Value=RateH*10;
        }else if(Mintt<=360){
            RateH=Mintt/60;
            RateM=Mintt%60;
            if(RateM==0){
                RateH=RateH+0;
            }else{
                RateH=RateH+1;
            }
            Value=30+(RateH-3)*20;
        }else{
            Value=200;
        }
        
        System.out.println("Min: "+Mintt+" mins");
        System.out.println("Value: "+Value+" baht");
    }
}
