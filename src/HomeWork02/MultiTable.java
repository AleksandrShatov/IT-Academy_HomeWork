package HomeWork02;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("С какого числа начинаем таблицу умноежния?: ");
        int startNumber = scanner.nextInt();
        System.out.print("Введите максимальное количество столбцов в строке: ");
        int maxCountColumnsInRow = scanner.nextInt();
        System.out.print("Введите количество столбцов в таблице умножения: ");
        int countColumns = scanner.nextInt();

        // Вычисляем общее количество рядов (даже если в последнем ряду будет меньше столбцов)
        int countRow = (int) Math.ceil(countColumns / (double) maxCountColumnsInRow);

        printHeader();
        // Цикл, который пробегает по всем рядам
        for (int i = 0; i < countRow; i++) {
            // Вычисляем значение числа, для крайнего правого столбца в данном ряду
            int currentEnd = startNumber + maxCountColumnsInRow + (maxCountColumnsInRow * i) - 1;
            // Переменная, которая отслеживает сколько на данный момент необходимо распечатать столбцов
            int tmpColumns = countColumns - (maxCountColumnsInRow * i);
            // Если количество оставшихся для печати столбцов меньше максимального количества столбцов в строке,
            if(tmpColumns < maxCountColumnsInRow){
                // то переопределяем значение числа, для крайнего правого столбца в последнем ряду
                currentEnd = startNumber + (maxCountColumnsInRow * i) + tmpColumns - 1;
            }
            // Вызвваем метод для печати одного ряда столбцов таблицы умножения
            printPartOfTable(startNumber + (maxCountColumnsInRow * i), currentEnd);
            printLine();
        }
        printFooter();
    }

    /**
     * Метод, печатающий разделительную линию
     */
    public static void printLine(){
        System.out.println("============================================================");
    }

    /**
     * Метод, печатающий заголовок для таблицы
     */
    public static void printHeader(){
        printLine();
        System.out.println("|                   ТАБЛИЦА УМНОЖЕНИЯ                      |");
        printLine();
    }

    /**
     * Метод печатающий часть таблицы умножения (один ряд столбцов)
     * @param start начальная цифра диаппазона
     * @param end конечная цифра диаппазона
     */
    public static void printPartOfTable(int start, int end){
        for (int i = 1; i <= 10; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf("| %d x %2d = %2d |", j, i, i * j);
            }
            System.out.println("");
        }
    }

    /**
     * Метод, печатающий нижнюю часть таблицы
     */
    public static void printFooter(){
        System.out.println("  ЭТО");
        System.out.println("  НУЖНО");
        System.out.println("  ЗНАТЬ!");
    }

}
