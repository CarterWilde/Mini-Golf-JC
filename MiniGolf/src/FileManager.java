import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileManager{
    public FileManager(){
    }

    public void save(Model o, String s){
        try{
            FileOutputStream fos = new FileOutputStream(s + ".xml");
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(o);
            encoder.close();
            fos.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }


    public Model readSaveFile(String s){
        try{
            FileInputStream fis = new FileInputStream(s + ".xml");
            XMLDecoder decoder = new XMLDecoder(fis);
            decoder.close();
            fis.close();
            return (Model)decoder.readObject();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        return null;
    }
}
