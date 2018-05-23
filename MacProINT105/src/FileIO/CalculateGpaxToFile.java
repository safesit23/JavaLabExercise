package FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateGpaxToFile {
    public static void main(String[] args) {
        writeToFile();
        System.out.println("\n-----------------\n");
        readFile();
    }
    public static void writeToFile(){
        double totalSum=0,totalCredit=0;
        FileOutputStream fileOut = null;
        DataOutputStream dataOut = null;
        Scanner input = new Scanner(System.in);
        try{
            fileOut = new FileOutputStream("grade.dat");
            dataOut = new DataOutputStream(fileOut);
            while(true){
                System.out.println(">>> Enter data to calculate GPAX");
                System.out.print("Enter Subject: ");
                String subject=input.next();
                System.out.print("Enter Credit: ");
                double credit = input.nextDouble();
                System.out.print("Enter Grade: ");
                double grade = input.nextDouble();
                totalCredit+=credit;
                totalSum+=credit*grade;
                double gpax = totalSum/totalCredit;
                System.out.println("Total Credit = "+totalCredit+", GPAX = "+gpax);
                
                dataOut.writeUTF(subject);
                dataOut.writeDouble(credit);
                dataOut.writeDouble(grade);
            }
        } catch(InputMismatchException ex){
            try {
                dataOut.close();
            } catch (IOException ex1) {
                System.out.println(ex1);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }finally{
            System.out.println("All data is saved.");
        }
    }
    
    public static void readFile(){
        double totalSum=0,totalCredit=0;
        FileInputStream fileIn = null;
        DataInputStream dataIn = null;
        System.out.println("Subject\t\tCredit\t\tGrade");
        try{
            fileIn = new FileInputStream("grade.dat");
            dataIn = new DataInputStream(fileIn);
            while(true){
                String subject = dataIn.readUTF();
                double credit = dataIn.readDouble();
                double grade = dataIn.readDouble();
                System.out.println(subject+"\t\t"+credit+"\t\t"+grade);
                totalCredit+=credit;
                totalSum+=credit*grade;
                
            }
        } catch(EOFException ex){
            try {
                dataIn.close();
            } catch (IOException ex1) {
                System.out.println(ex1);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally{
            double gpax = totalSum/totalCredit;
            System.out.println("Total Credit = "+totalCredit+", GPAX = "+gpax+"\n");
        }
    }
}
