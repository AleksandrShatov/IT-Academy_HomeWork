package HomeWork02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class ArraysCreator {

    /**
     * Метод создаёт массив рандомной длины целых рандомных чисел
     * @param maxLength ограничение для максимальной длины массива
     * @return массив Integer
     */
    public static Integer[] randomCreateIntArray(final int maxLength){
        Random rand = new Random();
        int randLength = rand.nextInt(maxLength);
        Integer[] randArr = new Integer[randLength];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(maxLength);
        }
        return randArr;
    }

    /**
     * Метод создаёт массив с помощью ввода значений вручную через консоль
     * @return массив Integer
     */
    public static Integer[] manualCreateIntArray() {
        Integer[] arr = {};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите целое и положительное число элементов массива: ");
            String line = reader.readLine();
            int manualLength = Integer.parseInt(line);
            if (manualLength < 0) {
                System.out.println("Количество элементов массива не может быть отрицательными числом!");
            } else {
                arr = new Integer[manualLength];
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Ведите элемент a[" + i + "]: ");
                    line = reader.readLine();
                    arr[i] = Integer.parseInt(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Введено неверное значение!");
        }
        return arr;
    }

}
