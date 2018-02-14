package Inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus1 = new Customer (2,"Kanisorn",1000);
        System.out.println("CUSTOMER: "+cus1.getName()+" has point = "+cus1.collectPoint());
        
        NormalMem cus2 = new NormalMem (2,"Safe",1000);
        System.out.println("NORMAL MEMBER: "+cus2.getName()+" has point = "+cus2.collectPoint());
        
        PrivilegeMem cus3 = new PrivilegeMem("AA2561","Ms.Game",2,"Jenny",1000);
        System.out.println("PRIVILEGE MEMBER: "+cus3.getName()+" has point = "+cus3.collectPoint());
        
        System.out.println("\nDiscount:");
        System.out.println(cus2.getName()+" | Discount price(for Normal) = "+cus2.discount());
        System.out.println(cus3.getName()+" | Discount price(for Privilege) = "+cus3.discount());
        
        System.out.println("\nCarpark(for Privilege):");
        System.out.println(cus3.getName()+" | License Plate = "+cus3.getLicensePlate());

        System.out.println("\nPersonal Assistance(for Privilege):");
        System.out.println(cus3.getName()+" | Assistance = "+cus3.getPersonalAssis());
        
        System.out.println("Previlege result = "+cus3.equals(cus1));
    }
}