import java.util.Scanner;
public class Sitspace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Astronomer as1 = new Astronomer();
        Astronomer as2 = new Astronomer();
        Astronomer as3 = new Astronomer("Christiaan",6011003l,190,96.16,"Netherland","Saturn");
        Astronomer as4 = new Astronomer("Dalton",6011004l,188,74.67,"Thailand","Mercury");
        Astronomer as5 = new Astronomer("Einstein",6011005l,175,69.91,"Germany","Jupiter");
        int choice;
        String choice2;
        
        System.out.println("Astronomer 1");
        System.out.print("Name: ");
        as1.setName(input.next());
        System.out.print("ID: ");
        as1.setId(input.nextLong());
        System.out.print("Height: ");
        as1.setHeight(input.nextInt());
        System.out.print("Weight: ");
        as1.setWeight(input.nextDouble());
        System.out.print("Nationality: ");
        as1.setNation(input.next());
        System.out.print("Planet: ");
        as1.setPlanet(input.nextInt());
        
        System.out.println("Astronomer 2");
        System.out.print("Name: ");
        as2.setName(input.next());
        System.out.print("ID: ");
        as2.setId(input.nextLong());
        System.out.print("Height: ");
        as2.setHeight(input.nextInt());
        System.out.print("Weight: ");
        as2.setWeight(input.nextInt());
        System.out.print("Nationality: ");
        as2.setNation(input.next());
        System.out.print("Planet: ");
        as2.setPlanet(input.nextInt());
        
        
        System.out.println("\n\nWelcome to SITSPACE");
        System.out.println("Press1 – number of astronomers");
        System.out.println("Press2 – number of THAI people");
        System.out.println("Press3 – number of astronomers in each planets");
        System.out.println("Press0 – EXIT and get all information");
        System.out.print("Enter finction: ");
        choice = input.nextInt();
        while(choice!=0){
            if(choice==1){
                System.out.println("Number of astronomers= "+Astronomer.getCountall());
            }else if(choice==2){
                System.out.println("Number of THAI people= "+Astronomer.getCountthai());
            }else if(choice==3){
                System.out.println("Choose Planet (m,v,j,s): ");
                choice2=input.next();
                if(choice2.equals("m")){
                    System.out.println("Number of astronomers in Mercury= "+Astronomer.getCountmercury());
                }else if(choice2.equals("v")){
                    System.out.println("Number of astronomers in Venus= "+Astronomer.getCountvenus());
                }else if(choice2.equals("j")){
                    System.out.println("Number of astronomers in Jupiter= "+Astronomer.getCountjupiter());
                }else if(choice2.equals("s")){
                    System.out.println("Number of astronomers in Saturn= "+Astronomer.getCountsaturn());
                }
            }else{
                System.out.println("Please choose again!");
            }
           
            System.out.print("Enter finction: ");
            choice = input.nextInt();
            
        }
        
        System.out.println("Astronomer1: "+as1.toString());
        System.out.println("Astronomer2: "+as2.toString());
        System.out.println("Astronomer3: "+as3.toString());
        System.out.println("Astronomer4: "+as4.toString());
        System.out.println("Astronomer5: "+as5.toString());
    }
}
