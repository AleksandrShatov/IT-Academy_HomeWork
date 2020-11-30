package HomeWork06;

import java.util.ArrayList;
import java.util.List;

public class EasySplit implements ISplitEngine {
    /**
     * Метод для разделения исходной строки на заданное число частей(подстрок)
     * @param text исходная строка для разделения
     * @param numberOfParts количество частей
     * @param listForParts списаок, в который сохраняются подстроки
     * @return true - если удалось разделить исходную строку на заданное количество частей,
     *         false - если разделить не удалось
     */
    @Override
    public boolean split(String text, int numberOfParts, List<String> listForParts) {
        /* Переменная для результата разделения */
        boolean isSplittedUp = false;
        /* Поиск всех пробелов с сохранением их индексов */
        char[] chars = text.toCharArray();
        List<Integer> spaceIndexes = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') {
                spaceIndexes.add(i);
            }
        }
        /*
         * Проверка условия для возможности разделения заданной строки
         */
        if((chars.length >= (2 * numberOfParts - 1)) && spaceIndexes.size() >= (numberOfParts - 1)) {
            int interval = spaceIndexes.size() / numberOfParts;
            int startIndex = 0;
            int endIndex = 0;
            for (int i = 0; i < numberOfParts; i++) {
                if(i == 0) {
                    startIndex = 0;
                } else {
                    startIndex = spaceIndexes.get(i * interval);
                }
                if(i == (numberOfParts - 1)) {
                    endIndex = text.length();
                } else {
                    endIndex = spaceIndexes.get((i + 1) * interval);
                }
                listForParts.add(text.substring(startIndex, endIndex));
            }
            isSplittedUp = true;
        }

        return isSplittedUp;
    }
}
