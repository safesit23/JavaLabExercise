import java.util.Scanner;
public class FindMean {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int total=0,user,count=0;
        double xbar;
        System.out.print("Enter Value: ");
        user =input.nextInt();
        
        while(user!=-1){
        total = valueall(total,user);
        count++;
        System.out.print("Enter Value: ");
        user =input.nextInt();
        }
        
        xbar=total/count;
        System.out.println("Mean is "+xbar);
        System.out.println(""+count+","+total);
        
    }
    
    public static int valueall(int total,int user){
        total = total+user;
        return total;
    }
    
}
