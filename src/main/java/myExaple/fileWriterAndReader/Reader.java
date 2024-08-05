package myExaple.fileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt");
            int character;
            while ((character = reader.read()) != -1){
                System.out.println((char) character);
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}
