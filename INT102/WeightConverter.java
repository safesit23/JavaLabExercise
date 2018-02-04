import java.text.DecimalFormat;
import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.000");
        double earth;
        int choice;
        System.out.print("Enter Weight: ");
        earth = input.nextDouble();
        System.out.print("Choose Planet(1-mercury,2-venus,3-jupiter,4-saturn): ");
        choice = input.nextInt();
        while(choice!=0){
            switch(choice){
                case 1: System.out.println("Mercury = "+fmt.format(Mercuryweight(earth))); break;
                case 2: System.out.println("Venus = "+fmt.format(Venusweight(earth))); break;
                case 3: System.out.println("Jupiter = "+fmt.format(Jupiterweight(earth))); break;
                case 4: System.out.println("Saturn = "+fmt.format(Saturnweight(earth))); break;
                default: System.out.println("Choose again!");
            }
        System.out.print("Choose Planet(1-mercury,2-venus,3-jupiter,4-saturn): ");
        choice = input.nextInt();
        }
        System.out.println("GOOD BYE!");
        
    }
    
    public static double Mercuryweight(double earth){
        double mercury = earth*0.4;
        return mercury;
    }
    
    public static double Venusweight(double earth){
        double Venus = earth*0.9;
        return Venus;
    }
    
    public static double Jupiterweight(double earth){
        double Jupiter = earth*2.5;
        return Jupiter;
    }
    public static double Saturnweight(double earth){
        double Saturn = earth*1.1;
        return Saturn;
    }
    
}
