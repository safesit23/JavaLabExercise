package Exercise;
import java.util.Random;
import java.util.Scanner;
public class BirthdayRandom {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        int y1,y2,date, month, year,feb;
        String nameMonth;
        System.out.print("Input Year1: ");
        y1=input.nextInt();
        System.out.print("Input Year2: ");
        y2=input.nextInt();
        if(y2>y1){
            year=generator.nextInt(y2-y1+1)+y1;
        }else if(y1>y2){
            year=generator.nextInt(y1-y2+1)+y2;
        }else{
            year=y1;
        }
        month=(int)(Math.random()*(12))+1;
        switch(month){
            case 1: 
            nameMonth="January";
            date=generator.nextInt(31)+1; break;
            case 2: 
            nameMonth="Febuaury";
            feb=year%4;
            if(feb==0){
                date=generator.nextInt(29)+1;
            }else{
                date=generator.nextInt(28)+1; 
            }break;
            case 3: 
            nameMonth="March";
            date=generator.nextInt(31)+1; break;
            case 4: 
            nameMonth="April";
            date=generator.nextInt(30)+1; break;
            case 5: 
            nameMonth="May";
            date=generator.nextInt(31)+1; break;
            case 6: 
            nameMonth="June";
            date=generator.nextInt(30)+1; break;
            case 7: 
            nameMonth="July";
            date=generator.nextInt(31)+1; break;
            case 8: 
            nameMonth="August";
            date=generator.nextInt(31)+1; break;
            case 9: 
            nameMonth="September";
            date=generator.nextInt(30)+1; break;
            case 10: 
            nameMonth="October";
            date=generator.nextInt(31)+1; break;
            case 11: 
            nameMonth="November";
            date=generator.nextInt(30)+1; break;
            default: 
            nameMonth="December";
            date=generator.nextInt(31)+1; break;
            
        }
        System.out.println("Random: "+date+" "+nameMonth+" "+year);
        
    }
}
