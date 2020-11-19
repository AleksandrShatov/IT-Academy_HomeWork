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
        stringAnalyzer.printHowMany("кто-то");
        stringAnalyzer.printHowMany("Кто-то");
        stringAnalyzer.printHowMany("-");
        stringAnalyzer.printHowMany("арп");
        stringAnalyzer.printHowMany("дор");

        EasySearchDecorator easySearchDecor = new EasySearchDecorator(new EasySearch());

        Set<String> wordsForSearching = new HashSet<>();
        wordsForSearching.add("война");
        wordsForSearching.add("и");
        wordsForSearching.add("мир");
        wordsForSearching.add("кто-то");
        wordsForSearching.add("-");
        wordsForSearching.add("арп");
        wordsForSearching.add("дор");

        Iterator<String> iterator = wordsForSearching.iterator();

        if(string == null) {
            System.out.println("Строка не найдена!");
        } else {
            while(iterator.hasNext()) {
                String item = iterator.next();
                System.out.println("Слово '" + item + "' встречается " + easySearchDecor.search(string, item) + " раз.");
            }
        }

        System.out.println("Количество уникальных слов в книге (через set): " + stringAnalyzer.getUniqueWordsCount());

        long stopTime = System.currentTimeMillis();

        System.out.println("\nTime is: " + (stopTime - startTime) + " ms");

    }
}
