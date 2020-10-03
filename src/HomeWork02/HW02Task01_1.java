package HomeWork02;

public class HW02Task01_1 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Вы не ввели число через аргумент!");
        } else {
            int number = Integer.parseInt(args[0]);
            if(number <= 1){
                System.out.println("Исходное число меньше либо равно единице.");
            } else {
                System.out.println("Вы ввели число: " + number);
                int result = 1;
                String strResult = "1";
                for (int i = 2; i <= number; i++) {
                    result *= i;
                    strResult += " * " + i;
                }
                System.out.println("Результат перемножения чисел от 1 до " + number + " равен: ");
                System.out.println(strResult + " = " + result);
            }
        }
    }
}
