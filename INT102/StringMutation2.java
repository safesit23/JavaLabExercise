package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringMutation2 {
    public static void main(String[] args) throws FileNotFoundException{
            Scanner inputFile = new Scanner(new File("InputFile/Encryption.txt"));
            String message,mutation="";
            int encode=1;
            message=inputFile.nextLine();
            message=message+"\n"+inputFile.nextLine();
            message=message+"\n"+inputFile.nextLine();
            for(int i=0;i<message.length();i++){
                mutation=mutation+(char)(message.charAt(i)-encode);
            }
            System.out.println(mutation);
            
    }
   
}
