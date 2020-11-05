package HomeWork02;

public class HW02Task01_1 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Вы не ввели число через аргумент!");
        } else {
            printFactorial(args[0]);
        }
        // Тестовые проверки
        System.out.println("Результат работы тестовых проверок:");
        printFactorial("ad5b");
        printFactorial("13");
        printFactorial(9);
        printFactorial(-3);
        printFactorial(23);
    }

    /**
     * Метод вычисляющий факториал числа, полученного из заданной строки и печатающий результат
     * @param stringNumber заданная строка с числом
     */
    public static void printFactorial(String stringNumber) {
        try {
            printFactorial(Long.parseLong(stringNumber));
        } catch (NumberFormatException e) {
            System.out.println(stringNumber + " - не является числом!");
        }
    }

    /**
     * Метод вычисляющий факториал числа number и печатающий результат
     * @param number заданное целое число
     */
    public static void printFactorial(long number) {
        if(number <= 1){
            System.out.println("Исходное число меньше либо равно единице.");
        } else if(number > 20) {
            System.out.println("Исходное число болльше 20, и поэтому произойдёт переполнение!");
        } else {
            System.out.println("Вы ввели число: " + number);
            long result = 1L;
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
