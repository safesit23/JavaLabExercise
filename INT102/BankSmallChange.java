package Exercise;
import java.util.Scanner;
public class BankSmallChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b1000=0,b500=0,b100=0,b50=0,b20=0,b10=0,b5=0,b2=0,b1=0,c50=0,c25=0;
        double money;
        System.out.print("ENTER Your Money : ");
        money=input.nextDouble();
        if(money>=1000){
            b1000=(int)money/1000;
            money-=(b1000*1000);
        }if(money>=500){
            b500=(int)money/500;
            money-=(b500*500);
        }if(money>=100){
            b100=(int)money/100;
            money-=(b100*100);
        }if(money>=50){
            b50=(int)money/50;
            money-=(b50*50);
        }if(money>=20){
            b20=(int)money/20;
            money-=(b20*20);
        }if(money>=10){
            b10=(int)money/10;
            money-=(b10*10);
        }if(money>=5){
            b5=(int)money/5;
            money-=(b5*5);
        }if(money>=2){
            b2=(int)money/2;
            money-=(b2*2);
        }if(money>=1){
            b1=(int)money/1;
            money-=(b1*1);
        }
        System.out.println("B1000= "+b1000);
        System.out.println("B500= "+b500);
        System.out.println("B100= "+b100);
        System.out.println("B50= "+b50);
        System.out.println("B20= "+b20);
        System.out.println("B10= "+b10);
        System.out.println("B5= "+b5);
        System.out.println("B2= "+b2);
        System.out.println("B1= "+b1);
        money=money*100;
        System.out.println((int)money);
        if((int)money==75){
            System.out.println("C50= 1\nC25= 1");
        }else if((int)money==50){
            System.out.println("C50= 1");
        }else if((int)money==25){
            System.out.println("C25= 1");
        }else{
            System.out.println("Stang Cannot Change.");
        }
    }
}
