package HomeWork02;

public class HW02Task01_4 {
    public static void main(String[] args) {
        printOverflowMultiplication(1l, 3);
    }

    /**
     * Метод умножающий начальное число startNumber на число factor и продолжающий умножать до наступления
     * переполнения, а затем выводящий информацию о результате перед переполнением и после переполнения.
     * @param startNumber начальное число, которое начинают умножать
     * @param factor число на которое постоянно умножают до наступления переполнения
     */
    public static void printOverflowMultiplication(long startNumber, long factor) {
        long a = startNumber;
        long tmpResult = 0L;
        int i = 1;
        while (a > tmpResult ) {
            System.out.printf("i = %3d; a = %d \n", i, a);
            tmpResult = a;
            a *= factor;
            i++;
        }
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Результат перед переполнением: " + tmpResult);
        System.out.println("Результат после переполнения: " + a);
    }
}
