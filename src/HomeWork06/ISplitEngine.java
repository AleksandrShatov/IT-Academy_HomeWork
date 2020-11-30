package HomeWork06;

import java.util.List;

@FunctionalInterface
public interface ISplitEngine {
    /**
     * Метод для разделения исходной строки на заданное число частей(подстрок)
     * @param text исходная строка для разделения
     * @param numberOfParts количество частей
     * @param listForParts списаок, в который сохраняются подстроки
     * @return true - если удалось разделить исходную строку на заданное количество частей,
     *         false - если разделить не удалось
     */
    boolean split(String text, int numberOfParts, List<String> listForParts);
}
