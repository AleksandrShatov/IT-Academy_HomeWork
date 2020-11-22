package HomeWork05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class WarAndPeaceMain {
    public static void main(String[] args) {
        // Переменная дли имени файла для чтения
        final String fileName = "HomeWork" +  File.separator + "resources" + File.separator + "Война и мир_книга.txt";
        // Переменная для хранения строки, прочитанной из файла
        String string = null;
        // 1-й способ чтения из файла в строку
        try {
            string = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 2-й способ чтения из файла в строку
//        File file = new File(fileName);
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            string = reader.toString();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        // Создаём объект для анализа строки из заданного файла
        StringAnalyzer stringAnalyzer = new StringAnalyzer(fileName);
        stringAnalyzer.analyze();
        stringAnalyzer.printInfo();
        // Находим, сортируем и печатаем наиболее часто встречающиеся слова и их количество
        stringAnalyzer.printCommonWords(10);

        stringAnalyzer.printAmountForWord("война");
        stringAnalyzer.printAmountForWord("и");
        stringAnalyzer.printAmountForWord("мир");
        stringAnalyzer.printAmountForWord("Война");
        stringAnalyzer.printAmountForWord("И");
        stringAnalyzer.printAmountForWord("Мир");

        EasySearchDecorator easySearchDecor = new EasySearchDecorator(new EasySearch());

        Set<String> wordsForSearching = new HashSet<>();
        wordsForSearching.add("война");
        wordsForSearching.add("и");
        wordsForSearching.add("мир");

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

        stringAnalyzer.printTop(10);

    }
}
