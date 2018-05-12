
import java.util.Scanner;

public class reviewLoop {
    public static void main(String[] args) {
        String input = "1,2,red,blue";
        Scanner s = new Scanner(input).useDelimiter(",");
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}
