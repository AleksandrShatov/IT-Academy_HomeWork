package HomeWork02;

public class HW02Task01_4 {
    public static void main(String[] args) {
        long a = 1L;
        long tmpResult = 0L;
        int i = 1;
        while (a > tmpResult ) {
            System.out.printf("i = %3d; a = %d \n", i, a);
            tmpResult = a;
            a *= 3;
            i++;
        }
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Результат перед переполнением: " + tmpResult);
        System.out.println("Результат после переполнения: " + a);
    }
}
