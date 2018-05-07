package sit.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestStream {
    public static void main(String[] args) {
        FileInputStream fis=null;
        DataInputStream dis=null;
        try{
            fis = new FileInputStream("student.dat");
            dis = new DataInputStream(fis);
            while(true){
                int stdId = dis.readInt();
                String stdFirstName=dis.readUTF();
                String stdLastName=dis.readUTF();
                System.out.println(stdId+", "+stdFirstName+", "+stdLastName);
            }
        //EOF เป็นลูกของ IO
        } catch(EOFException eof){
            try{
                dis.close();
            }catch(IOException ex){
                System.out.println(ex);
            }
        } catch(FileNotFoundException fnf){
            System.out.println(fnf);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
