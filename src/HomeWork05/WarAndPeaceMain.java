package HomeWork05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class WarAndPeaceMain {
    public static void main(String[] args) {

        final String book = "Война и мир_книга.txt";
        Set<String> uniqueWords = new HashSet<>();
        List<Character> characters = new ArrayList<>();
        long symbolsCount = 0L;

        long startTime = System.currentTimeMillis();
        long stopTime = 0L;
        try(Reader reader = new FileReader(book)) {
            int read;
            while((read = reader.read()) > -1){
                symbolsCount++;
                characters.add((char) read);
            }

            stopTime = System.currentTimeMillis();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Time is: " + (stopTime - startTime));
        System.out.println("symbolsCount = " + symbolsCount);

        Iterator<Character> iterator = characters.listIterator();

        for (int i = 0; i < 20; i++) {
            if(iterator.hasNext()){
                char ch = iterator.next();
                System.out.println(ch);
            }

        }

    }
}
