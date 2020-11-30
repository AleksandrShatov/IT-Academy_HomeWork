package HomeWork06;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WarAndPeaceMain06 {
    public static void main(String[] args) {

        final String fileName = "HomeWork" + File.separator + "resources" + File.separator + "Война и мир_книга.txt";

        final List<String> partsArchive = new ArrayList<>();

        final int numberOfParts = 10;

        // Список слов для поиска
        final List<String> wordsForFinding = new ArrayList<>();
        wordsForFinding.add("война");
        wordsForFinding.add("и");
        wordsForFinding.add("мир");

        String string = null;
        try {
            string = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("Неудалось прочитать файл и создать строку");
            e.printStackTrace();
        }

        System.out.println("Длина заданной строки: " + string.length());

        EasySplit splitter = new EasySplit();
        boolean isSplittedUp = splitter.split(string, numberOfParts, partsArchive);

        if(isSplittedUp) {

            int totalPartsLength = 0;
            for (int i = 0; i < partsArchive.size(); i++) {
                int lengthOfPart = partsArchive.get(i).length();
                System.out.println("Длина " + (i + 1) + "-й части: " + lengthOfPart);
                totalPartsLength += lengthOfPart;
            }
            System.out.println("Суммарная длина всех частей: " + totalPartsLength);

            Iterator<String> iteratorForFinding = wordsForFinding.iterator();

            while(iteratorForFinding.hasNext()) {

                String wordForFinding = iteratorForFinding.next();

                ExecutorService executor = Executors.newFixedThreadPool(numberOfParts);
                List<Future<Long>> futures = new ArrayList<>();
                for (int i = 0; i < numberOfParts; i++) {
                    Future<Long> submit = executor.submit(new SearchDecoratorCallableTask(partsArchive.get(i), wordForFinding));
                    futures.add(submit);
                }

                long result = 0L;
                while(futures.size() > 0) {
                    Iterator<Future<Long>> iterator = futures.iterator();
                    while(iterator.hasNext()) {
                        Future<Long> future = iterator.next();
                        if(future.isDone()) {
                            try {
                                result += future.get();
                                iterator.remove();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            } catch (ExecutionException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                System.out.println("Количество слов '" + wordForFinding + "': " + result);
                executor.shutdown();
            }
        } else {
            System.out.println("Исходную строку не удалось разделить на " + numberOfParts + " частей.");
        }
    }
}
