package HomeWork02;

public class HW02Task01_5 {
    public static void main(String[] args) {
        printMultiTable();
    }

    /**
     * Метод, печатающий стандартную таблицу умножения
     */
    public static void printMultiTable() {
        printHeader();
        printPartOfTable(2, 5);
        printLine();
        printPartOfTable(6, 9);
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
     * Метод печатающий часть таблицы умножения
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
        printLine();
        System.out.println("  ЭТО");
        System.out.println("  НУЖНО");
        System.out.println("  ЗНАТЬ!");
    }

}
