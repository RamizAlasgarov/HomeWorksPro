package myExaple.fileWriterAndReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStrm {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\picr.png")){
            FileOutputStream fileOutputStream = new FileOutputStream("foto.png");
            int i ;
            while ((i=fileInputStream.read()) != -1){
                fileOutputStream.write(i);
            }
            System.out.println("done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
