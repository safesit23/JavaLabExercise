package sit.view;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestObjectStream {
    public static void main(String[] args) {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            fis = new FileInputStream("student-object.dat");
            ois = new ObjectInputStream(fis);
            while(true){
                Object std=ois.readObject();
                System.out.println(std);
            }
        //EOF เป็นลูกของ IO
        } catch(EOFException eof){
            try{
                ois.close();
            }catch(IOException ex){
                System.out.println(ex);
            }
        } catch(FileNotFoundException fnf){
            System.out.println(fnf);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);;
        }
    }
}
