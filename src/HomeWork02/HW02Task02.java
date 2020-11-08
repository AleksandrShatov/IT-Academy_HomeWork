package HomeWork02;

public class HW02Task02 {
    public static void main(String[] args) {
        // Создание и заполнение массива руками через консоль
        Integer[] arr = ArraysCreator.convertIntArrayToInteger(ArraysCreator.manualCreateIntArray());

        // 2.1. Вывод всех элементов массива в консоль разными способами
        System.out.println("2.1.1. Вывод массива с помощью do....while");
        ArraysPrinting.printArrayWithDoWhile(arr);
        System.out.println("2.1.2. Вывод массива с помощью while");
        ArraysPrinting.printArrayWithWhile(arr);
        System.out.println("2.1.3. Вывод массива с помощью for");
        ArraysPrinting.printArrayWithFor(arr);
        System.out.println("2.1.4. Вывод массива с помощью foreach");
        ArraysPrinting.printArrayWithForEach(arr);

        // 2.2. Вывод каждого второго элемента массива в консоль
        System.out.println("2.2. Вывод каждого второго элемента массива");
        ArraysPrinting.printEverySecondFromArray(arr);

        // 2.3. Вывод всех элементов массива в обратном порядке разными способами
        System.out.println("2.3.1. Вывод массива в обратном порядке с помощью do....while");
        ArraysPrinting.printReverseArrayWithDoWhile(arr);
        System.out.println("2.3.2. Вывод массива в обратном порядке с помощью while");
        ArraysPrinting.printReverseArrayWithWhile(arr);
        System.out.println("2.3.3. Вывод массива в обратном порядке с помощью for");
        ArraysPrinting.printReverseArrayWithFor(arr);
        System.out.println("2.3.4. Вывод массива в обратном порядке с помощью foreach");
        ArraysPrinting.printReverseArrayWithForEach(arr);
    }
}
