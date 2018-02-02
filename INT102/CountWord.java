import java.util.Scanner;
public class CountWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("ENTER TEXT: ");
        text = input.nextLine();
        int count = Counttext(text);
        System.out.println("WORD = "+count);
    }
    
    public static int Counttext(String text){
        int count=1;
        for(int i=0;i<text.length();i++){
            if(text.substring(i, i+1).equals(" ")){
                count++;
            }
        }
        return count;
    }
    
}
