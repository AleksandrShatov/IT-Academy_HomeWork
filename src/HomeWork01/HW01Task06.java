package HomeWork01;

public class HW01Task06 {
    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[] {1,0,2,3,4,5,6,7,8,9}));
        System.out.println(createPhoneNumber2(new int[] {1,0,2,3,4,5,6,7,8,9}));
        System.out.println(createPhoneNumber2(new int[] {1,0,2,3,4,5,61,7,8,9}));

    }

    // Метод использует форматированный вывод для создания строки с номером
    public static String createPhoneNumber(int[] numbers){
        if(!checkNumbers(numbers)){
            return "Введены неверные данные для номера телефона!";
        }
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    // Метод использует обычную конкатенацию строк для формирования строки с номером
    public static String createPhoneNumber2(int[] numbers){
        if(!checkNumbers(numbers)){
            return "Введены неверные данные для номера телефона!";
        }
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" +
                numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }

    // Метод для проверки чисел из массива для номера, что бы они удовлетворяли условию: от 0 до 9.
    public static boolean checkNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0 || numbers[i] >= 10){
                return false;
            }
        }
        return true;
    }

}
