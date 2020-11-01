package HomeWork05;

public class WarAndPeaceMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        final String textAddr = "Война и мир_книга.txt";

        StringAnalyzer stringAnalyzer = new StringAnalyzer(textAddr);
        stringAnalyzer.analyze();
        stringAnalyzer.printInfo();

        System.out.println("Количество всех слов в строке: " + stringAnalyzer.getWordsCount());

        stringAnalyzer.printHowMany("война");
        stringAnalyzer.printHowMany("Война");
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

        long stopTime = System.currentTimeMillis();

        System.out.println("\nTime is: " + (stopTime - startTime) + " ms");


    }
}
