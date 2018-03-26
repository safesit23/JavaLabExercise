package ch9.fileanddb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int numOfLine=0,numOfWord=0;
        try{
            File myFile=new File("StudentList.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){   //Loop นับบรรทัด
                numOfLine+=1;
                String line=sc.nextLine();
                System.out.println(line);
                
                Scanner scStr=new Scanner(line);
                while(scStr.hasNext()){         //Loop นับคำ
                    numOfWord+=1;
                    System.out.println(scStr.next());
                }
                System.out.println("----");
            }
        }
        catch(FileNotFoundException ff){
            System.out.println(ff);
        }
        System.out.println("Number of Lines: "+numOfLine);
        System.out.println("Number of Words: "+numOfWord);

    }
}
