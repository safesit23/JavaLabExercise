import java.util.Date;

public class Time {
    public static void main(String[] args) {
        int check=-1;
        while(true){
            Date date = new Date();  
            if(check!=date.getSeconds()){
            System.out.println(date.toLocaleString());
                check=date.getSeconds();
            }
        }
    }
}
