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
            double result = number;
            if(rate >= 2){
                for (int i = 1; i < rate; i++) {
                    result *= number;
                }
            } else if(rate == 0) {
                result = 1;
            }
            System.out.println("Результат возведения числа " + number + " в степень " + rate + " равен: " + result);
        } catch (Exception e) {
            System.out.println("Вы ввели неверные числа (число)!");
        }

    }
}
