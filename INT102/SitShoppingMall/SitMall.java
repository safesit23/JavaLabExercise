package OOP.view;
import OOP.model.SitShop;
import java.util.Scanner;
public class SitMall {
    public static void main(String[] Args){
    	Scanner input = new Scanner(System.in);
        SitShop s1 = new SitShop();
        System.out.println("Welcome to SIT SHOPPING MALL");
        System.out.println("Shop1");
        System.out.print("Enter name: ")
        s1.name(input.next);
        System.out.print("Enter Length (m): ")
        s1.shopLength(input.nextDouble);
        System.out.print("Enter Long (m): ")
        s1.shopLong(input.nextDouble);

        System.out.println("Shop2");
        System.out.print("Enter name: ")
        s2.name(input.next);
        System.out.print("Enter Length (m): ")
        s2.shopLength(input.nextDouble);
        System.out.print("Enter Long (m): ")
        s2.shopLong(input.nextDouble);

        System.out.println("\n----------------------");
        System.out.println("Sit Shopping Mall has"+SitShop.getCountShop()+" shops");
        System.out.println(""+s1+s2+"\n");
        
    }
}
