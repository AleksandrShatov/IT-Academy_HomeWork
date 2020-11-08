package HomeWork02;

public class HW02Task04 {
    public static void main(String[] args) {
        System.out.println("4.3. Тестирование алгоритмов сортировки");

        System.out.println("4.3.1.");
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        printBubbleSorting(arr1);

        System.out.println("4.3.2.");
        int[] arr2 = {1, 1, 1, 1};
        printBubbleSorting(arr2);

        System.out.println("4.3.3.");
        int[] arr3 = {9, 1, 5, 99, 9, 9};
        printBubbleSorting(arr3);

        System.out.println("4.3.4.");
        int[] arr4 = {};
        printBubbleSorting(arr4);

        System.out.println("4.4. Создание массива рандомной длинны и заполнение его рандомным числами");
        int[] randArr = ArraysCreator.randomCreateIntArray(21);
        printCocktailSorting(randArr);

        System.out.println("4.5. Создание массива руками через консоль");
        int[] manualArr = ArraysCreator.manualCreateIntArray();
        printCocktailSorting(manualArr);

    }

    /**
     * Метод печатающий исходный массив до и после сортировки пузырьком
     * @param inArr исходный массив
     */
    public static void printBubbleSorting(int[] inArr) {
        System.out.println("Исходный массив до сортировки 'пузырьком':");
        ArraysPrinting.printArrayWithFor(ArraysCreator.convertIntArrayToInteger(inArr));
        SortingWithGenerics.bubbleSort(inArr, true);
        System.out.println("Массив после сортировки 'пузырьком':");
        ArraysPrinting.printArrayWithFor(ArraysCreator.convertIntArrayToInteger(inArr));
    }

    /**
     * Метод печатающий исходный массив до и после шейкерной сортировки
     * @param inArr исходный массив
     */
    public static void printCocktailSorting(int[] inArr) {
        System.out.println("Исходный массив до шейкерной сортировки:");
        ArraysPrinting.printArrayWithFor(ArraysCreator.convertIntArrayToInteger(inArr));
        SortingWithGenerics.cocktailSort(inArr);
        System.out.println("Массив после шейкерной сортировки:");
        ArraysPrinting.printArrayWithFor(ArraysCreator.convertIntArrayToInteger(inArr));
    }
}
