import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0,encode=5;
        String Message,Encryption="";
        Message="XLXNG9%xyfsi%ktw%‡XL%XYZINT%NSKNSNY^%fsi%GJ^TSI%935•3XLXNG9%nx%sj|."
                + "%nskwfxywzhyzwj%tk%XL%Xyzint%Hqzg3%Hmfslnsl%ktw%ymj%gjyyjw%fsi%xznyfgqj%ktw%wjvznwjrjsy%ns%~jfw%756=3";
        for(i=0;i<Message.length();i++){
            Encryption=Encryption+(char)(Message.charAt(i)-encode);
        }
        System.out.println(Encryption);
        
    }
}
