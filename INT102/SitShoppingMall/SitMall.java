package OOP.view;
import OOP.model.SitShop;
import java.util.Scanner;
public class SitMall {
    public static void main(String[] Args){
    	Scanner input = new Scanner(System.in);
        SitShop s1 = new SitShop();
        SitShop s2 = new SitShop();
        System.out.println("Welcome to SIT SHOPPING MALL");
        System.out.println("Shop1");
        System.out.print("Enter name: ");
        s1.setName(input.next());
        System.out.print("Enter Length (m): ");
        s1.setShopLength(input.nextDouble());
        System.out.print("Enter Long (m): ");
        s1.setShopLong(input.nextDouble());
        s1.setArea();

        System.out.println("\nShop2");
        System.out.print("Enter name: ");
        s2.setName(input.next());
        System.out.print("Enter Length (m): ");
        s2.setShopLength(input.nextDouble());
        System.out.print("Enter Long (m): ");
        s2.setShopLong(input.nextDouble());
        s2.setArea();

        System.out.println("\n----------------------");
        System.out.println("Sit Shopping Mall has"+SitShop.getCountShop()+" shops");
        System.out.println(s1);
        System.out.println(s2);
    }
}