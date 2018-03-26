package ch9.fileanddb;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        String myMessage="Mango    Grape   Apple   Guana";
        Scanner sc = new Scanner(myMessage);
        while(sc.hasNext()){    //ยังมีคำให้อ่านไหม
            System.out.println(sc.next());  //สนใจเป็นคำ
        }
    }
}
