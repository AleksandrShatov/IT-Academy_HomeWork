package HomeWork01;

import java.util.Scanner;

public class HW01Task05_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scan.nextLine();
        
        String friendName = "Вася";
        String girlName = "Анастасия";
        
        boolean isFriend = friendName.equals(userName);
        boolean isGirl = girlName.equals(userName);

        if(isFriend){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        } else if(isGirl) {
            System.out.println("Я тебя так долго ждал.");
        } else{
            System.out.println("Добрый день, а вы кто?");
        }

    }
}