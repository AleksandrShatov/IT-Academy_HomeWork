package HomeWork01;

import java.util.Scanner;

public class HW01Task05_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scan.next();

        final String friendName = "Вася";
        final String girlName = "Анастасия";

        switch (userName){
            case friendName:
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            case girlName:
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}