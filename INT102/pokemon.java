package Exercise;

import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int com1,com2,com3,hero1,hero2,hero3, powerup1,powerup2,powerup3,count=0,select;
        String startgame,name, yes="yes", result=null,play;
        System.out.print("Enter nickname: ");
        name=input.next();
        System.out.println("Hello "+name+" Welcome to Hero VS Monster GAME");
        System.out.println("Choose: (1 Start Game or 2 Instruction)");
        select=input.nextInt();
        while(select==2){
            System.out.println("1.เมื่อเริ่มเกมส์ผู้เล่นจะได้รับ HERO 3 ตัวพร้อมแสดง CP ซึ่งผู้เล่นมีสิทธิ์ Random ค่า CP ใหม่ได้จนกว่าจะพอใจ");
            System.out.println("2.เมื่อผู้เล่นพอใจกับค่า CP ของ HERO แล้วเมื่อเริ่มเกมส์ผู้เล่นมีสิทธิ์เพิ่มค่า CP กับตัวละครเดียวเท่านั้น");
            System.out.println("3.ผู้เล่นจะชนะก็ต่อเมื่อค่า CP ของ HERO มากกว่าหรือเท่ากับ Monster");
            System.out.print("Choose: (1 Start Game or 2 Instruction)");
            select=input.nextInt();    
        }
        do{
        do{
            com1=(int)(Math.random()*1001)+1500;
            com2=(int)(Math.random()*1001)+1500;
            com3=(int)(Math.random()*1001)+1500;
            hero1=(int)(Math.random()*1001)+1500;
            hero2=(int)(Math.random()*1001)+1500;
            hero3=(int)(Math.random()*1001)+1500;
        
            System.out.println("Hero VS Monster");
            System.out.println("Hero 1 cp = "+hero1);
            System.out.println("Hero 2 cp = "+hero2);
            System.out.println("Hero 3 cp = "+hero3);
            System.out.println("Want to Random again?: (yes or no)");
            startgame=input.next();
        } while(startgame.equals(yes));
        
        System.out.println("Round 1");
        System.out.print("Power up? (1/0): ");
        powerup1=input.nextInt();
        if(powerup1==1){
            hero1=hero1+250;
            result=testType1(com1,hero1);
            count=count+testType2(com1,hero1);
            System.out.println("Com1 cp"+com1+" -- Hero1 cp"+hero1+" "+result);
            
            System.out.println("\nRound2");
            result=testType1(com2,hero2);
            count=count+testType2(com2,hero2);
            System.out.println("Com2 cp"+com2+" -- Hero2 cp"+hero2+" "+result);
            
            System.out.println("\nRound3");
            result=testType1(com3,hero3);
            count=count+testType2(com3,hero3);
            System.out.println("Com3 cp"+com3+" -- Hero3 cp"+hero3+" "+result);
            
            
        }else {
            result=testType1(com1,hero1);
            count=count+testType2(com1,hero1);
            System.out.println("Com1 cp"+com1+" -- Hero1 cp"+hero1+" "+result);
            
            System.out.println("\nRound2");
            System.out.print("Power up? (1/0): ");
            powerup2=input.nextInt();
            if(powerup2==1){
                hero2=hero2+250;
                result=testType1(com2,hero2);
                count=count+testType2(com2,hero2);
                System.out.println("Com2 cp"+com2+" -- Hero2 cp"+hero2+" "+result);
                
                System.out.println("\nRound3");
                result=testType1(com3,hero3);

                System.out.println("Com3 cp"+com3+" -- Hero3 cp"+hero3+" "+result);
                
            }else{
                result=testType1(com2,hero2);
                count=count+testType2(com2,hero2);
                System.out.println("Com2 cp"+com2+" -- Hero2 cp"+hero2+" "+result);
                
                System.out.println("\nRound3");
                hero3=hero3+250;
                result=testType1(com3,hero3);
                count=count+testType2(com3,hero3);
                System.out.println("Com3 cp"+com3+" -- Hero3 cp"+hero3+" "+result);
            }
  
        }
        System.out.println("\nConclude: You win "+count+" times");
        count=0;
        System.out.println("\nDo you want to play again?: (yes or no)");
        play=input.next();
        }while(play.equals(yes));
        System.out.println("GOOD BYE!\nCREDIT: SAFE IT23");
    } 
    
    public static String testType1(int com, int hero){
    String result;
    if(hero>=com){
        result="You win!";
    }else{
        result="You Lose!";
    }
    return result;
    }
    
    public static int testType2(int com, int hero){
    int count;
    if(hero>=com){
        count=1;
    }else{
        count=0;
    }
    return count;
    }
}
