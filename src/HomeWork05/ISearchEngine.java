package HomeWork05;

public interface ISearchEngine {

    /**
     * Метод, который осуществляет поиск заданной строки word в строке text
     * и возвращающий количество раз, которое оно встречаетмя
     * @param text заданная строка для поиска
     * @param word строка в которой ищем
     * @return количество раз, которое строка text встречается в строке word
     */
    long search(String text, String word);

}
