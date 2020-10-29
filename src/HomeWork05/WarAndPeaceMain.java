package HomeWork05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

public class WarAndPeaceMain {
    public static void main(String[] args) {

        final String book = "Война и мир_книга.txt";
        Set<String> uniqueWords = new HashSet<>();

        long startTime = System.currentTimeMillis();
        long stopTime = 0L;
        try(Reader reader = new FileReader(book)) {
            while(reader.read() > -1){
                int count = reader.read();
                uniqueWords.add(Integer.toBinaryString(count));
            }

            stopTime = System.currentTimeMillis();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Time is: " + (stopTime - startTime));
        System.out.println();


    }
}
