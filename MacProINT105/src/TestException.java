
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestException {
    public static void handlerException(String message) throws NotANumberException{
        int num;
        int zero=(int)'0';
        int nine=(int)'9';
        for(int i=0;i<message.length();i++){
            num=message.charAt(i);
            if((num<zero)||(num>nine)){
               throw new NotANumberException("Error not a number");
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter message: ");
            String text=input.next();
            //handlerException(text);
            int num;
            int zero=(int)'0';
            int nine=(int)'9';
            for(int i=0;i<text.length();i++){
                num=text.charAt(i);
                if((num<zero)||(num>nine)){
                    throw new NotANumberException("Error not a number");
                }
            }
            System.out.println("FINISH");
        }
        
        //NotANumberException ex = new NotANumberException("Error not a number");
        catch (NotANumberException ex) {
            System.out.println(ex);
        }
        finally{
            System.out.println("---FINALLY---");
        }
        System.out.println("END PROGRAM");
    }
}
