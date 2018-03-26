package ch9.fileanddb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int numOfLine=0,numOfWord=0,numOfChar=0;
        try{
            File myFile=new File("StudentList.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){   //Loop นับบรรทัด   โดยผูกกับไฟล์
                numOfLine+=1;
                String line=sc.nextLine();
                System.out.println(line);
                numOfChar+=line.length();  //นับตัวอักษรรวมช่องว่าง
                Scanner scStr=new Scanner(line);
                while(scStr.hasNext()){         //Loop นับคำ โดยผูกกับString
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
        System.out.println("Number of char: "+numOfChar);
    }
}
