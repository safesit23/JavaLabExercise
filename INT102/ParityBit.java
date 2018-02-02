import java.util.Scanner;
public class ParityBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String parity;
        System.out.print("Enter Parity Bit: ");
        parity = input.next();
        System.out.println("8 bit:"+Paritybit(parity));
    }
    
    public static String Paritybit(String parity){
        int lenp = parity.length();
        int count=0;
        String charp;
        for(int i=0;i<lenp;i++){
            if(parity.substring(i,i+1).equals("1")){
                count++;
            }
            
        }
        System.out.println("Count: "+count);
        if(count%2==0){
            parity=""+parity+0;
        }else{
            parity=""+parity+1;
        }    
   
        return parity;            
    }
    
}
