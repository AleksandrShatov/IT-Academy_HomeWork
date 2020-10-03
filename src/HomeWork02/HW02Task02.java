package HomeWork02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW02Task02 {
    public static void main(String[] args) {
        // Создание и заполнение массива
        double[] arr = createArray();
        if (arr.length == 0){
            System.out.println("В массиве отсутствуют элементы либо он не создан!");
            return;
        }
        // 2.1. Вывод всех элементов массива в консоль разными способами
        System.out.println("2.1.1. Вывод массива с помощью do....while");
        int i = 0;
        System.out.print("{");
        do {
            System.out.print(arr[i] + "; ");
            i++;
        } while (i < arr.length);
        System.out.print("}\n");

        System.out.println("2.1.2. Вывод массива с помощью while");
        i = 0;
        System.out.print("{");
        while (i < arr.length){
            System.out.print(arr[i] + "; ");
            i++;
        }
        System.out.print("}\n");

        System.out.println("2.1.3. Вывод массива с помощью for");
        System.out.print("{");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "; ");
        }
        System.out.print("}\n");

        System.out.println("2.1.4. Вывод массива с помощью foreach");
        System.out.print("{");
        for (double d : arr) {
            System.out.print(d + "; ");
        }
        System.out.print("}\n");

        // 2.2. Вывод каждого второго элемента массива в консоль
        System.out.println("Вывод каждого второго элемента массива");
        System.out.print("{");
        for (int j = 1; j < arr.length; j += 2) {
                System.out.print(arr[j] + "; ");
        }
        System.out.print("}\n");

        // 2.3. Вывод всех элементов массива в обратном порядке разными способами
        System.out.println("2.3.1. Вывод массива в обратном порядке с помощью do....while");
        i = arr.length - 1;
        System.out.print("{");
        do {
            System.out.print(arr[i] + "; ");
            i--;
        } while (i >= 0);
        System.out.print("}\n");

        System.out.println("2.3.2. Вывод массива в обратном порядке с помощью while");
        i = arr.length - 1;
        System.out.print("{");
        while (i >= 0){
            System.out.print(arr[i] + "; ");
            i--;
        }
        System.out.print("}\n");

        System.out.println("2.3.3. Вывод массива в обратном порядке с помощью for");
        System.out.print("{");
        int startIndex = arr.length - 1;
        for (int j = startIndex; j >= 0; j--) {
            System.out.print(arr[j] + "; ");
        }
        System.out.print("}\n");

        System.out.println("2.3.4. Вывод массива в обратном порядке с помощью foreach");
        // Делаем реверс массива
        for (int k = 0; k < arr.length / 2; k++) {
            double tmp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = tmp;
        }
        // Выводим на печать
        System.out.print("{");
        for (double d : arr) {
            System.out.print(d + "; ");
        }
        System.out.print("}\n");

    }

    /**
     * Метод для создания массива
     * @return
     */
    public static double[] createArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = 0;
        // Создаём массив с нулевым количеством элементов
        double[] arr  = new double[0];
        String inputString = "";
        System.out.print("Введите количество элементов массива (целове положительное число): ");
        try {
            inputString = reader.readLine();
            arrayLength = Integer.parseInt(inputString);
        } catch (Exception e) {
            System.out.println("Неверно введено количество элементов для массива!");
        }
        if(arrayLength < 0){
            System.out.println("Число элементов массива не может быть отрицательным!");
        } else {
            arr  = new double[arrayLength];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Введите элемент [" + i + "]: ");
                try {
                    inputString = reader.readLine();
                    arr[i] = Double.parseDouble(inputString);
                } catch (Exception e) {
                    System.out.println("Неверно введено значение для элемента массива!");
                    arr = new double[0];
                }
            }
        }
        return arr;
    }
}
