package HomeWork05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class WarAndPeaceMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        final String fileName = "HomeWork" +  File.separator + "resources" + File.separator + "Война и мир_книга.txt";

        String string = null;

        // 1-й способ чтения из файла в строку


        // 2-й способ чтения из файла в строку
        File file = new File(fileName);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 3-й способ чтения из файла в строку
        try {
            string = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringAnalyzer stringAnalyzer = new StringAnalyzer(fileName);
        stringAnalyzer.analyze();
        stringAnalyzer.printInfo();

        System.out.println("Количество всех слов в строке: " + stringAnalyzer.getWordsCount());

        stringAnalyzer.printHowMany("Во-первых");
        stringAnalyzer.printHowMany("во-первых");
        stringAnalyzer.printHowMany("война");
        stringAnalyzer.printHowMany("и");
        stringAnalyzer.printHowMany("мир");
        stringAnalyzer.printHowMany("Война");
        stringAnalyzer.printHowMany("И");
        stringAnalyzer.printHowMany("Мир");
        stringAnalyzer.printHowMany("sdfgcsdg");
        stringAnalyzer.printHowMany("дело");
        stringAnalyzer.printHowMany("и");
        stringAnalyzer.printHowMany("абракадабра");
        stringAnalyzer.printHowMany("три");
        stringAnalyzer.printHowMany("После");
        stringAnalyzer.printHowMany("после");
        stringAnalyzer.printHowMany("фываertewrt");
        stringAnalyzer.printHowMany("Он");
        stringAnalyzer.printHowMany("он");
        stringAnalyzer.printHowMany("кто-то");
        stringAnalyzer.printHowMany("Кто-то");
        stringAnalyzer.printHowMany("что-то");
        stringAnalyzer.printHowMany("Что-то");

        EasySearch es = new EasySearch();

        Set<String> wordsForSearching = new HashSet<>();
        wordsForSearching.add("война");
        wordsForSearching.add("и");
        wordsForSearching.add("мир");
        wordsForSearching.add("во-первых");
        wordsForSearching.add("кто-то");
        wordsForSearching.add("что-то");

        Iterator<String> iterator = wordsForSearching.iterator();


        while(iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Слово '" + item + "' встречается " + es.search(string.toLowerCase(), item) + " раз.");
        }

        long stopTime = System.currentTimeMillis();

        System.out.println("\nTime is: " + (stopTime - startTime) + " ms");

    }
}
