package HomeWork05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * Класс, анализирующий строку и позволяющий найти все слова в заданной строке
 */
public class StringAnalyzer {

    /**
     * Заданная строка, в которой осуществляется поиск
     */
    private final String string;

    /**
     * Количество всех символов в заданной строке
     */
    private long charsCount = 0L;

    /**
     * Количество всех слов в заданной строке
     */
    private long wordsCount = 0L;

    /**
     * Количество уникальных слов в заданной строке
     */
    private long uniqueWordsCount = 0L;

    /**
     *
     */
    private List<Character> characters = new ArrayList<>();

    /**
     * Карта, которая хранит все найденные слова
     * Ключём(K) являетмя уникальное слово, найденное в заданной строке
     * Значением(V) являетмя количество раз, которое данное слово встречается в заданной строке
     */
    private Map<String, Integer> words = new HashMap<>();

    /**
     * Набор, содержащий только уникальные слова, найденные в заданной строке
     */
    private Set<String> uniqueWords = new HashSet<>();

    /**
     * Конструктор, принимающий строку, в которой необходимо найти слова
     * @param string заданная строка, в которой осуществляется поиск
     */
    public StringAnalyzer(String string) {
        this.string = string;
    }

    /**
     * Метод, возвращающий количество всех символов в заданной строке
     * @return charsCount - количество всех символов в заданной строке
     */
    public long getSymbolsCount() {
        return this.charsCount;
    }

    /**
     * Метод, возвращающий количество уникальных слов в заданной строке
     * @return uniqueWordsCount - количество уникальных слов в заданной строке
     */
    public long getUniqueWordsCount() {
        return this.uniqueWordsCount;
    }

    /**
     * Метод, проверающий заданный символ ch на соответствие необходимым условиям
     * @param ch заданный символ для проверки в формате int
     * @return true - если символ соответствует условиям, false - если не соответствует
     */
    public boolean isValidCharacter(int ch) {
        return isValidCharacter((char) ch);
    }

    /**
     * Метод, проверающий заданный символ ch на соответствие необходимым условиям
     * @param ch заданный символ для проверки в формате char
     * @return true - если символ соответствует условиям, false - если не соответствует
     */
    public static boolean isValidCharacter(char ch) {
        boolean cond1 = (ch >= 'A' && ch <= 'Z');
        boolean cond2 = (ch >= 'a' && ch <= 'z');
        boolean cond3 = (ch >= 'А' && ch <= 'Я');
        boolean cond4 = (ch >= 'а' && ch <= 'я');
        boolean cond5 = (ch == 'Ё' || ch == 'ё');
        boolean cond6 = (ch == '-');
        if(cond1 || cond2 || cond3 || cond4 || cond5 || cond6) {
            return true;
        }
        return false;
    }

    /**
     * Метод, проверяющий заданную строку (слово) на корректное количество и расположение в ней символа тире '-'
     * @param word заданная строка (слово) для проверки
     * @return true - если расположение тире в строке являетмя правильным, т.е. встречается не более одного раза и
     * не расположено в начале строки либо в конце строки, false - в случае неправильного расположения тире в строке
     */
    public static boolean isValidDashInWord(String word) {
        if(word.length() <= 0) {
            return false;
        }
        char[] charFromWord = word.toCharArray();
        if(charFromWord[0] == '-' || charFromWord[charFromWord.length - 1] == '-') {
            return false;
        }
        int amountOfDashes = 0;
        for (int i = 0; i < charFromWord.length - 1; i++) {
            if(charFromWord[i] == '-') {
                amountOfDashes++;
            }
        }
        if(amountOfDashes > 1) {
            return false;
        }
        return true;
    }

    /**
     * Метод, осуществляющий поиск всех слов в заданной строке и формирующий из найденных слов карту.
     * Ключами карты являются найденные слова, а значениями - количество повторений этих слов в строке
     */
    public void analyze() {
        try(Reader reader = new FileReader(string)) {
            boolean startWord = false; // Флаг начала составления слова
            boolean endWord = false;   // Флаг конца составления слова
            StringBuilder word = null; // Составляемое слово
            int read;
            /* Цикл чтения строки */
            while((read = reader.read()) > -1){
                char readableChar = (char) read; // Читаемый в данный момент символ
                this.charsCount++;
                characters.add(readableChar);
                /* Если читаемый символ удовлетворяет условиям, то начинаем составлять слово,
                   в противном случае заканчиваем составлять слово*/
                if(isValidCharacter(readableChar)) {
                    startWord = true;
                    endWord = false;
                } else {
                    startWord = false;
                    endWord = true;
                }
                if(startWord && (word == null)) {
                    word = new StringBuilder();
                }
                if(startWord && (word != null)) {
                    word.append(readableChar);
                }
                /* После завершения формирования(считывания) слова добавляем его в карту и в коллекцию Set */
                if(endWord && (word != null)) {
                    if(isValidDashInWord(word.toString())) {
                        uniqueWords.add(word.toString());
                        if(words.containsKey(word.toString())) {
                            int value = words.get(word.toString());
                            words.remove(word.toString());
                            words.put(word.toString(), ++value);
                        } else {
                            words.put(word.toString(), 1);
                        }
                        word = null;
                    } else {
                        word = null;
                    }
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.uniqueWordsCount = uniqueWords.size();

        setWordsCount();
    }

    /**
     * Метод осуществляет поиск указанное количество слов, наиболее часто встречающихся в строке,
     * и выводит на печать найденное слово и количество его повторений в строке
     * порядке уменшения количества повторений.
     * @param amountUniqueWords - количество часто встречаемых слов необходимых для поиска и печати
     */
    public void printCommonWords(int amountUniqueWords) {
        System.out.println("Most " + amountUniqueWords + " common words: ");
        Map<String, Integer> tmpMap = new HashMap<>(words);
        int amount = 0;
        int maxTmpAmount = 0;
        String maxTmpString = "";
        while(amount < amountUniqueWords && tmpMap.size() > 0) {
            Set<Map.Entry<String, Integer>> set = tmpMap.entrySet();
            for (Map.Entry<String, Integer> word : set) {
                if(word.getValue() > maxTmpAmount) {
                    maxTmpString = word.getKey();
                    maxTmpAmount = word.getValue();
                }
            }
            System.out.println(maxTmpString + " - " + maxTmpAmount + " раз(а)");
            tmpMap.remove(maxTmpString);
            amount++;
            maxTmpAmount = 0;
            maxTmpString = "";
        }
    }

    /**
     * Метод, печатающий заданный TOP слов через Stream API
     * @param amountUniqueWords - количество часто встречаемых слов необходимых для поиска и печати
     */
    public void printTop(int amountUniqueWords) {
        System.out.println("TOP with Stream API: ");
        words.entrySet().stream() .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(amountUniqueWords) .forEach(System.out::println);
    }

    /**
     * Метод печатает основную информацию по заданной строке
     */
    public void printInfo() {
        System.out.println("Количество символов в строке = " + getSymbolsCount());
        System.out.println("Количество всех слов в строке = " + getWordsCount());
        System.out.println("Количество уникальных слов в книге = " + getUniqueWordsCount());
    }

    /**
     * Метод подсчитывает количество всех(с учётом повторений) слов в заданной строке
     */
    private void setWordsCount() {
        Set<Map.Entry<String, Integer>> set = words.entrySet();
        for (Map.Entry<String, Integer> word : set) {
            wordsCount += word.getValue();
        }
    }

    /**
     * Метод возвращает количество всех слов в заданной строке
     * @return количество всех слов в заданной строке
     */
    public long getWordsCount() {
        return this.wordsCount;
    }

    /**
     * Метод печатает количество повторений для указанного слова
     * @param word - слово, для которого нужно распечатать количество его повторений в исходной строке
     */
    public void printAmountForWord(String word) {
        if(words.containsKey(word)) {
            System.out.println("Слово " + "'" + word + "'" + " встречается " + words.get(word) + " раз(а).");
        } else {
            System.out.println("Слово " + "'" + word + "'" + " отсутстыует в данной строке!");
        }
    }
}
