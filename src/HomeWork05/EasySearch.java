package HomeWork05;

public class EasySearch implements ISearchEngine {

    /**
     * Метод, который осуществляет поиск заданной строки word в строке text
     * и возвращающий количество раз, которое оно встречается
     * @param text заданная строка для поиска
     * @param word строка в которой ищем
     * @return количество раз, которое строка text встречается в строке word
     */
    @Override
    public long search(String text, String word) {
        long count = 0L; // Количество найденных строк
        // TODO - нужна ли проверка соседних символов, что бы не находило часть слова???
//        if(!StringAnalyzer.isValidDashInWord(word)) {
//            return count;
//        }
        boolean isMatchFound = false; // Переменная для отслеживания найденных совпадений
        boolean beforeWord = false; // Переменная для отслеживания валидности символа, стоящего перед найденной строкой
        boolean afterWord = false; // Переменная для отслеживания валидности символа, стоящего после найденной строки
        int indexFind = -1; // Переменная, запоминающая начальный индекс в случае нахождения искомой строки
        int fromIndex = 0; // Переменная для индекса, с которого будем искать строку
        /*
         * Цикл для поиска строки word, который будет работать до тех пор, пока будут находится совпадения.
         * На каждой итерации мы ищем совпадение, если находим, то вычисляем стартовый индекс для следующего поиска на
         * следующей итерации.
         */
        do {
            indexFind = text.indexOf(word, fromIndex);
            if(indexFind == -1) {
                isMatchFound = false;
            } else {
                isMatchFound = true;
                fromIndex = indexFind + word.length();

                if(fromIndex >= text.length() - 1) {
                    afterWord = true;
                } else {
                    afterWord = !StringAnalyzer.isValidCharacter(text.charAt(fromIndex));
                }

                if(indexFind == 0) {
                    beforeWord = true;
                } else {
                    beforeWord = !StringAnalyzer.isValidCharacter(text.charAt(indexFind - 1));
                }

                if(beforeWord && afterWord) {
                    count++;
                }
            }
        } while(isMatchFound);

        return count;
    }

}
