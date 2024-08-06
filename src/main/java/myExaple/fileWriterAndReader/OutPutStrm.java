package myExaple.fileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class OutPutStrm {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>(List.of("1","2","3"));
        write(stringsList,System.out);
        try(OutputStream outputStream = new FileOutputStream("words")){
            write(stringsList,outputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void write(List<String> words, OutputStream outputStream){
        for (String word : words) {
            try {
                outputStream.write(word.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
