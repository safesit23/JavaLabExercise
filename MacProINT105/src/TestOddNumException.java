
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestOddNumException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            while(true){
                System.out.print("Enter number: ");
                int number = input.nextInt();
                ExceptionHandler(number);
            }
        } catch (OddNumberException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex) {   //Error if not a number
            System.out.println(ex);
        } finally{
            System.out.println("---FINALLY----");
        }
        System.out.println("END PROG");
    }
    
    public static void ExceptionHandler(int number) throws OddNumberException{
        if(number%2!=0){
            throw new OddNumberException("This is odd Number");
        }
    }
}
