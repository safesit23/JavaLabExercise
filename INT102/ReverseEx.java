package Exercise;

import java.util.Scanner;

public class ReverseEx {
     
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Password : ");
    String password = sc.next();
    System.out.print("Number : ");
    int number = sc.nextInt();
    number = number%100;
    System.out.println("Reverse Password : "+test(password)+number);    
    }
    
    public static String test (String letter){
    char letter1 = letter.charAt(3);
    char letter2 = letter.charAt(2);
    char letter3 = letter.charAt(1);
    char letter4 = letter.charAt(0);
    return letter1+""+letter2+""+letter3+""+letter4;
    }
}
