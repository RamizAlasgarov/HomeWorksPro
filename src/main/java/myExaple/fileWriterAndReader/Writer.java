package myExaple.fileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        String rubai = "Сколько, дерзкая, ни жди —\n" +
                "Лишь досада впереди.\n" +
                "Глупостей не делай вновь\n" +
                "И найдёшь свою любовь…";

//        writer(rubai);
        reader();
    }

    public static void writer(String s) throws IOException {
//        FileWriter writer = null;
        try (FileWriter writer = new FileWriter("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt")){
//            writer = new FileWriter("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt");
            writer.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            writer.close();
//        }
        System.out.println("done");
    }

    public static void reader() {
//        FileReader reader = null;
        try(FileReader reader = new FileReader("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt")) {
//            reader = new FileReader("C:\\Users\\ramiz\\OneDrive\\Рабочий стол\\text.txt");
            int character;
            while ((character=reader.read()) != -1){
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }

