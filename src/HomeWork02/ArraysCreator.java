package HomeWork02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ArraysCreator {

    /**
     * Метод создаёт массив рандомной длины целых рандомных чисел
     * @param maxLength ограничение для максимальной длины массива
     * @return массив Integer
     */
    public static int[] randomCreateIntArray(final int maxLength){
        Random rand = new Random();
        int randLength = rand.nextInt(maxLength);
        int[] randArr = new int[randLength];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(maxLength);
        }
        return randArr;
    }

    /**
     * Метод создаёт массив с помощью ввода значений вручную через консоль
     * @return массив Integer
     */
    public static int[] manualCreateIntArray() {
        int[] manualArr = {};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов массива (целове положительное число): ");
        try {
            String line = reader.readLine();
            int manualLength = Integer.parseInt(line);
            if (manualLength < 0) {
                System.out.println("Количество элементов массива не может быть отрицательными числом!");
            } else {
                manualArr = new int[manualLength];
                for (int i = 0; i < manualArr.length; i++) {
                    System.out.print("Ведите элемент a[" + i + "]: ");
                    line = reader.readLine();
                    manualArr[i] = Integer.parseInt(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Введено неверное значение!");
        }
        return manualArr;
    }

    /**
     * Метод преобразует исходный массив примитивов int в массив объектов Integer
     * @param inArr исходный массив примитивов int
     * @return массив объектов типа Integer
     */
    public static  Integer[] convertIntArrayToInteger(int[] inArr) {
        Integer[] outArr = new Integer[inArr.length];
        for (int i = 0; i < inArr.length; i++) {
            outArr[i] = inArr[i];
        }
        return outArr;
    }

    /**
     * Метод преобразует исходный массив объектов Integer в массив примитивов int
     * @param inArr исходный массив объектов Integer
     * @return массив примитивов int
     */
    public static int[] convertIntegerArrayToInt(Integer[] inArr) {
        int[] outArr = new int[inArr.length];
        for (int i = 0; i < inArr.length; i++) {
            outArr[i] = inArr[i];
        }
        return outArr;
    }

}
