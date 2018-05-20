package FileIO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectStreamTest {
    public static void main(String[] args) {
        //for InputStream
        FileInputStream fileIn;
        ObjectInputStream objectIn = null;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("<<<<<STUDENT OBJECT FILE>>>>");
            System.out.println("START Scanner");
            System.out.print("Enter id: ");
            int idInput = input.nextInt();
            System.out.print("Enter name: ");
            String nameInput = input.next();
            Student std = new Student(idInput, nameInput);
            System.out.println("SHOW Object: "+std);
            System.out.println("---------------");
            
            /*---------File I/O---------*/
            
            //-------------Write to file----------------------
            System.out.println("START WRITE FILE TO OBJECT");
            FileOutputStream fileOut = new FileOutputStream("objectfile.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(std);
            objectOut.close();
            System.out.println("WRITE FINISH\n-------------");
            
            //-------------Read file----------------------
            System.out.println("START READ DATA in FILE");
            fileIn = new FileInputStream("objectfile.dat");
            objectIn = new ObjectInputStream(fileIn);
            while(true){
                Object stdIn = objectIn.readObject();
                System.out.println("Object from file: "+stdIn);
            }
            
        } catch(EOFException eof){
           try{
            objectIn.close();
           }catch(IOException io){
               System.out.println(io);
           }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } finally{
            System.out.println("----------\nClose Program");
        }
        
    }
}