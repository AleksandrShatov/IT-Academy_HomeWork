package HomeWork02;

public class HW02Task01_2 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Вы не ввели число через аргумент!");
        } else {
            int number = Integer.parseInt(args[0]);
            if(number <= 9){
                System.out.println("Исходное число меньше либо равно 9.");
            } else {
                System.out.println("Вы ввели число: " + number);
                // Определяем количество цифр в исходном числе
                char[] chars = args[0].toCharArray();
                int countOfDigits = chars.length;

                // Массив для хранения цифр, из которых состоит заданное число
                int[] numbers = new int[countOfDigits];

                // Флаг наличия цифры '0' в исходном числе
                boolean zeroFlag = false;

                int tmpNumber = number;
                int index = 0;
                // Цикл для заполнения массива цифрами. Массив будет заполнен в обратном порядке.
                while(tmpNumber > 0) {
                    numbers[index] = tmpNumber % 10;
                    if(numbers[index] == 0){
                        zeroFlag = true;
                        break;
                    }
                    tmpNumber /= 10;
                    index++;
                }
                if(zeroFlag) {
                    System.out.println("В исходном числе присутствует цифра '0', поэтому и произведение всех цифр равно 0.");
                } else {
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
}
