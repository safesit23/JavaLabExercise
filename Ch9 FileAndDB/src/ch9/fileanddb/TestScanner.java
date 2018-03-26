package ch9.fileanddb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        try{
            File myFile=new File("StudentList.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){   
                String line=sc.nextLine();
                System.out.println(line);
                
                Scanner scStr=new Scanner(line);
                while(scStr.hasNext()){
                    System.out.println(scStr.next());
                }
                System.out.println("----");
            }
        }
        catch(FileNotFoundException ff){
            System.out.println(ff);
        }

        
    }
}
