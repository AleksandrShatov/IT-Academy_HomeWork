package HomeWork05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class StringAnalyzer {

    private final String string;

    private long charsCount = 0L;

    private long wordsCount = 0L;

    private List<Character> characters = new ArrayList<>();

    private Map<String, Integer> words = new HashMap<>();

    private Set<String> uniqueWords = new HashSet<>();

    public StringAnalyzer(String string) {
        this.string = string;
    }

    public long getSymbolsCount() {
        return this.charsCount;
    }


    public boolean isValidCharacter(int ch) {
        return isValidCharacter((char) ch);
    }

    protected boolean isValidCharacter(char ch) {
        boolean cond1 = (ch >= 'A' && ch <= 'Z');
        boolean cond2 = (ch >= 'a' && ch <= 'z');
        boolean cond3 = (ch >= 'А' && ch <= 'Я');
        boolean cond4 = (ch >= 'а' && ch <= 'я');
        boolean cond5 = (ch == 'Ё' || ch == 'ё');
        if(cond1 || cond2 || cond3 || cond4 || cond5) {
            return true;
        }
        return false;
    }

    public void analyze() {
        try(Reader reader = new FileReader(string)) {
            boolean startWord = false; // Начало составления слова
            boolean endWord = false;   // Конец составления слова
            StringBuilder word = null; // Составляемое слово
            int read;
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
                /* */
                if(startWord && (word == null)) {
                    word = new StringBuilder();
                }
                /* */
                if(startWord && (word != null)) {
                    word.append(readableChar);
                }
                /* */
                if(endWord && (word != null)) {
                    if(words.containsKey(word.toString())) {
                        int value = words.get(word.toString());
                        words.remove(word.toString());
                        words.put(word.toString(), ++value);
                    } else {
                        words.put(word.toString(), 1);
                    }
                    word = null;
                }
            }
            reader.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


    public void printInfo() {
        System.out.println("charsCount = " + this.charsCount);

        Iterator<Character> iterator = characters.listIterator();

        for (int i = 0; i < 20; i++) {
            if(iterator.hasNext()){
                char ch = iterator.next();
                System.out.print(ch);
            }
        }

        int uniqueWordsCount = words.size();
        System.out.println("\nКоличество уникальных слов в книге: " + uniqueWordsCount);


        System.out.println("Часть слов из романа:");

        Set<Map.Entry<String, Integer>> set = words.entrySet();

        int i = 0;
        for (Map.Entry<String, Integer> word : set) {
            if(i < 100) {
                System.out.println(word.getKey() + " : " + word.getValue());
            } else {
                break;
            }
            i++;
        }

        for (Map.Entry<String, Integer> word : set) {
            wordsCount += word.getValue();
        }

    }

    public long getWordsCount() {
        return this.wordsCount;
    }

    public void printHowMany(String word) {
        if(words.containsKey(word)) {
            System.out.println("Слово " + "'" + word + "'" + " встречается " + words.get(word) + " раз(а).");
        } else {
            System.out.println("Слово " + "'" + word + "'" + " отсутстыует в данной строке!");
        }
    }

}
