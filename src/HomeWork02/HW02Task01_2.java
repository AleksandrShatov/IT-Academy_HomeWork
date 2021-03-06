package HomeWork02;

public class HW02Task01_2 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Вы не ввели число через аргумент!");
        } else {
            printMultiplicationDigitsNumbers(args[0]);
        }
        // Тестовые проверки
        System.out.println("Результат работы тестовых проверок:");
        printMultiplicationDigitsNumbers("ert456sdf");
        printMultiplicationDigitsNumbers("356782");
        printMultiplicationDigitsNumbers(852943);
        printMultiplicationDigitsNumbers(7);
        printMultiplicationDigitsNumbers(2304507);
    }

    /**
     * Метод вычисляющий произведение цифр числа, полученного из заданной строки, и пещатающий результат
     * @param stringNumber заданная строка с числом
     */
    public static void printMultiplicationDigitsNumbers(String stringNumber) {
        try {
            printMultiplicationDigitsNumbers(Long.parseLong(stringNumber));
        } catch (NumberFormatException e) {
            System.out.println(stringNumber + " - не является числом!");
        }
    }

    /**
     * Метод вычисляющий произведение цифр заданного числа number и пещатающий результат
     * @param number заданное целое число
     */
    public static void printMultiplicationDigitsNumbers(long number) {
        if(number <= 9){
            System.out.println("Исходное число меньше либо равно 9.");
        } else {
            System.out.println("Вы ввели число: " + number);
            // Определяем количество цифр в исходном числе
            Long wrapNumber = number;
            String stringNumber = wrapNumber.toString();
            char[] digits = stringNumber.toCharArray();
            int countOfDigits = digits.length;
            // Массив для хранения цифр, из которых состоит заданное число
            int[] numbers = new int[countOfDigits];
            long tmpNumber = number;
            int index = 0;
            boolean isZero = false;
            // Цикл для заполнения массива цифрами. Массив будет заполнен в обратном порядке.
            while(tmpNumber > 0) {
                numbers[index] = (int) tmpNumber % 10;
                if(numbers[index] == 0){
                    System.out.println("В исходном числе присутствует цифра '0', поэтому и произведение всех цифр равно 0.");
                    isZero = true;
                    break;
                }
                tmpNumber /= 10;
                index++;
            }
            if(!isZero) {
                int maxIndex = numbers.length - 1;
                int result = numbers[maxIndex];
                String strResult = "" + numbers[maxIndex];
                int startIndex = maxIndex - 1;
                for (int i = startIndex; i >= 0; i--) {
                    result *= numbers[i];
                    strResult += " * " + numbers[i];
                }
                System.out.println("Результат перемножения цифр из числа " + number + " равен: ");
                System.out.println(strResult + " = " + result);
            }
        }
    }

}
