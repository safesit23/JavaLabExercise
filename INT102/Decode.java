import java.util.Scanner;
public class Decode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER MESSAGE: ");
        String message = input.nextLine();
        System.out.print("DECODE1: ");
        String de1 = input.next();
        System.out.print("DECODE2: ");
        String de2 = input.next();
        String show = Decode(message,de1,de2);
        System.out.println("DECODE: "+show);
        
    }
    
    public static String Decode(String message,String de1,String de2){
        String show="";
        int lengths = message.length();
        for(int i=0;i<lengths;i++){
            if(message.substring(i, i+1).equals(de1)){
                show=show+de2;
            }else if(message.substring(i, i+1).equals(de2)){
                show=show+de1;
            }else{
                show=show+message.charAt(i);
            }
        }
        return show;
    }
}
