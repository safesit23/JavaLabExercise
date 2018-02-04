import java.util.Scanner;
public class OddPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter TEXT: ");
        String message = input.nextLine();
        message = Oddposition(message);
        System.out.println("NEW: "+message);
    }
    
    public static String Oddposition(String message){
    String newtext="";
    int length = message.length();
    for(int i=0;i<length;i++){
        if(i%2==0){
            newtext=newtext+message.charAt(i);
        }
    }
    return newtext;
    }
}
