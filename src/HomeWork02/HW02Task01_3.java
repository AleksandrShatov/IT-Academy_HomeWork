package HomeWork02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW02Task01_3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите первое число, которое будем возводить в степень: ");
            double number = Double.parseDouble(reader.readLine());
            System.out.print("Введите целое положительное число (степень): ");
            int rate =  Integer.parseInt(reader.readLine());
            System.out.println("Исходное число: " + number);
            System.out.println("Исходная степень: " + rate);
            double result = pow(number, rate);
            System.out.println("Результат возведения числа " + number + " в степень " + rate + " равен: " + result);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Вы ввели неверные числа (число)!");
        }
        // Тестовые проверки
        System.out.println("Результат работы тестовых проверок:");
        testPow(-3, -2);
        testPow(-3, 5);
        testPow(4, 3);
        testPow(2.6, 4);
        testPow(7.3, 1);
        testPow(3.8, 0);

    }

    /**
     * Метод возведения исходного числа number в заданную целую степень rate
     * @param number исходное число, которое возводим в степень rate
     * @param rate степень, в которую возводят исходное число (целое положительное число)
     * @return результат возведения в степень, либо -1, если введены неверные данные
     */
    public static double pow(double number, int rate) {
        if(rate < 0) {
            return -1;
        }
        double result = number;
        if(rate >= 2){
            for (int i = 1; i < rate; i++) {
                result *= number;
            }
        } else if(rate == 1) {
            result = number;
        } else if(rate == 0) {
            result = 1;
        }
        return result;
    }

    /**
     * Метод для тестирования метода pow()
     * @param number исходное число, которое возводим в степень rate
     * @param rate степень, в которую возводят исходное число (целое положительное число)
     */
    public static void testPow(double number, int rate) {
        if(rate < 0) {
            System.out.println("Вы ввели отрицательную степень!");
        } else {
            double result = pow(number, rate);
            System.out.println("Результат возведения числа " + number + " в степень " + rate + " равен: " + result);
        }
    }

}
