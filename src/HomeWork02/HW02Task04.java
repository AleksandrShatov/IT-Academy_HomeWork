package HomeWork02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class HW02Task04 {
    public static void main(String[] args) {
        // 4.3. Тестирование алгоритмов сортировки
        // 4.3.1.
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Исходный массива arr1 до сортировки:");
        System.out.println(Arrays.toString(arr1));
        SortingAlgorithms.bubbleSort(arr1, true);
        System.out.println("Массива arr1 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr1));
        // 4.3.2.
        int[] arr2 = {1, 1, 1, 1};
        System.out.println("Исходный массива arr2 до сортировки:");
        System.out.println(Arrays.toString(arr2));
        SortingAlgorithms.bubbleSort(arr2, true);
        System.out.println("Массива arr2 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr2));
        // 4.3.3.
        int[] arr3 = {9, 1, 5, 99, 9, 9};
        System.out.println("Исходный массива arr3 до сортировки:");
        System.out.println(Arrays.toString(arr3));
        SortingAlgorithms.bubbleSort(arr3, true);
        System.out.println("Массива arr3 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr3));
        // 4.3.4.
        int[] arr4 = {};
        System.out.println("Исходный массива arr4 до сортировки:");
        System.out.println(Arrays.toString(arr4));
        SortingAlgorithms.bubbleSort(arr4, true);
        System.out.println("Массива arr4 после сортировки 'пузырьком' по возрастанию:");
        System.out.println(Arrays.toString(arr4));

        // 4.4. Создание массива рандомной длинны и заполнение его рандомным числами
        Random rand = new Random();
        int randLength = rand.nextInt(21);
        int[] randArr = new int[randLength];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(21);
        }
        System.out.println("Массив рандомной длинны с рандомными числами:");
        System.out.println(Arrays.toString(randArr));
        SortingAlgorithms.cocktailSort(randArr);
        System.out.println("Рандомный массив после шейкерной сортировки:");
        System.out.println(Arrays.toString(randArr));

        // 4.5. Создание массива руками через консоль
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Введите целое и положительное число элементов массива: ");
             String line = reader.readLine();
            int manualLength = Integer.parseInt(line);
            if(manualLength < 0) {
                System.out.println("Количество элементов массива не может быть отрицательными числом!");
            } else{
                int[] a = new int[manualLength];
                for (int i = 0; i < a.length; i++) {
                    System.out.print("Ведите элемент a[" + i + "]: ");
                    line = reader.readLine();
                    a[i] = Integer.parseInt(line);
                }
                System.out.println("Массив, заполненный через консоль:");
                System.out.println(Arrays.toString(a));
            }
        } catch (Exception e){
            System.out.println("Введено неверное значение!");
        }
    }
}
