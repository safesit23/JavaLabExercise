package SitPhoneBook;

import java.sql.SQLException;
import java.util.Scanner;

public class TestPhoneBook {
    public static void main(String[] args) {
        try{
            int func;
            Scanner input = new Scanner(System.in);
            PhoneController pCon = new PhoneController("sit", "sit");
            System.out.print("(1)Add (2)Search\nEnter Function: ");
            func=input.nextInt();
            while(func!=0){
                if(func==1){
                    System.out.print("1.ADD FUNCTION\nEnter phoneNum: ");
                    String phoneNum = input.next();
                    System.out.print("Enter nickname: ");
                    String nickName = input.next();
                    System.out.println("Enter Gen: ");
                    int gen=input.nextInt();
                    int rec = pCon.addPhoneNumber(phoneNum, nickName, gen);
                    System.out.println("Inserted "+rec+" records\n");
                    
                }else if(func==2){
                    System.out.print("2.FIND FUNCTION\nEnter nickname: ");
                    String nickName = input.next();
                    pCon.findPhoneNumber(nickName);
                }
                System.out.println("\n---------------------------------");
                System.out.print("(1)Add (2)Search\nEnter Function: ");
                func=input.nextInt(); 
            }
            pCon.CloseConnection();
            System.out.println("-----GOOD BYE----");
            
            
            
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } 
        
        
    }
}
