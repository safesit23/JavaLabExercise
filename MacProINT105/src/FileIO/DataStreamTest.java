package FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataStreamTest {
    public static void main(String[] args) {
        //for InputStream
        FileInputStream fileIn = null;
        DataInputStream dataIn = null;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("<<<<<STUDENT DATA FILE>>>>");
            System.out.println("START Scanner");
            System.out.print("Enter id: ");
            int idInput = input.nextInt();
            System.out.print("Enter name: ");
            String nameInput = input.next();
            System.out.println("---------------");
            /*---------File I/O---------*/
            
            //-------------Write to file----------------------
            System.out.println("START WRITE FILE TO OBJECT");
            FileOutputStream fileOut = new FileOutputStream("datafile.dat");
            DataOutputStream dataOut = new DataOutputStream(fileOut);
            dataOut.writeInt(idInput);
            dataOut.writeUTF(nameInput);
            dataOut.close();
            System.out.println("WRITE FINISH\n-------------");
            
            //-------------Read file----------------------
            System.out.println("START READ DATA in FILE");
            fileIn = new FileInputStream("datafile.dat");
            dataIn = new DataInputStream(fileIn);
            while(true){
                int idFromFile = dataIn.readInt();
                String nameFromFile = dataIn.readUTF();
                System.out.println("ID from file: "+idFromFile);
                System.out.println("Name from file: "+nameFromFile);
            }
            
        } catch(EOFException eof){
           try{
            dataIn.close();
           }catch(IOException io){
               System.out.println(io);
           }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally{
            System.out.println("----------\nClose Program");
        }
        
    }
}
