package Platform;
public class JavaOverflow {
    public static void main(String[] args) {
        //Question1: Print the minimum value (MIN_VALUE) and maximum value (MAX_VALUE) of Byte.
        byte b=Byte.MIN_VALUE;
        byte a=Byte.MAX_VALUE;
        System.out.println("Question1: ");
        System.out.println("Minimum Value: "+b);
        System.out.println("Maximum Value: "+a);
        
        //Question2:  Declare variable a and b as Byte. Assign the MAX_VALUE to a and MIN_VALUE to b. 
        //Increase the value of a by 1 (a++) and decrease to value of b by 1 (b--)
        System.out.println("\nQuestion2: ");
        System.out.println("Increase Value of a by 1:"+(a++));
        System.out.println("Decrease Value of b by 1:"+(b--));
        
        //Question3: Write a loop that uses Byte as loop variable. Start the loop from 0 to 149.
        System.out.println("\nQuestion(Ver1): ");
        byte numTest=0;
        for(int i=0;i<=149;i++){
            System.out.println(numTest);
            numTest++;
        }
        System.out.println("\nQuestion(Ver2): ");
        for(byte i=0;i<=149;i++){
            System.out.println(i);
        }
        
    }
}
