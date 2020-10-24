package HomeWork02;

import java.util.Arrays;

public class HW02Task04 {
    public static void main(String[] args) {
        SortingWithGenerics<Integer> sorting = new SortingWithGenerics<>();
        // 4.3. Тестирование алгоритмов сортировки
        // 4.3.1.
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Исходный массива arr1 до сортировки:");
        System.out.println(Arrays.toString(arr1));
        sorting.bubbleSort(arr1, true);
        System.out.println("Массива arr1 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr1));
        // 4.3.2.
        Integer[] arr2 = {1, 1, 1, 1};
        System.out.println("Исходный массива arr2 до сортировки:");
        System.out.println(Arrays.toString(arr2));
        sorting.bubbleSort(arr2, true);
        System.out.println("Массива arr2 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr2));
        // 4.3.3.
        Integer[] arr3 = {9, 1, 5, 99, 9, 9};
        System.out.println("Исходный массива arr3 до сортировки:");
        System.out.println(Arrays.toString(arr3));
        sorting.bubbleSort(arr3, true);
        System.out.println("Массива arr3 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr3));
        // 4.3.4.
        Integer[] arr4 = {};
        System.out.println("Исходный массива arr4 до сортировки:");
        System.out.println(Arrays.toString(arr4));
        sorting.bubbleSort(arr4, true);
        System.out.println("Массива arr4 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr4));

        // 4.4. Создание массива рандомной длинны и заполнение его рандомным числами
        Integer[] randArr = ArraysCreator.randomCreateIntArray(21);
        System.out.println("Массив рандомной длинны с рандомными числами:");
        System.out.println(Arrays.toString(randArr));
        sorting.cocktailSort(randArr);
        System.out.println("Рандомный массив после шейкерной сортировки:");
        System.out.println(Arrays.toString(randArr));

        // 4.5. Создание массива руками через консоль
        Integer[] manualArr = ArraysCreator.manualCreateIntArray();
        System.out.println("Массив, заполненный через консоль:");
        System.out.println(Arrays.toString(manualArr));
        sorting.cocktailSort(manualArr);
        System.out.println("Массив, заполненный через консоль, после шейкерной сортировки:");
        System.out.println(Arrays.toString(manualArr));

    }
}
