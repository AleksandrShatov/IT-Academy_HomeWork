package HomeWork01;

public class HW01Task04 {
    public static void main(String[] args) {

        boolean weekday = false;    // Рабочий день
        boolean vacation = false;   // Отпуск

        System.out.println("1 . Если нерабочий день и нет отпуска, то");
        answerAboutSleep(weekday, vacation);

        weekday = true;
        vacation= false;
        System.out.println("2 . Если рабочий день и нет отпуска, то");
        answerAboutSleep(weekday, vacation);

        weekday = false;
        vacation= true;
        System.out.println("3 . Если нерабочий день и отпуск, то");
        answerAboutSleep(weekday, vacation);

        weekday = true;
        vacation= true;
        System.out.println("4 . Если рабочий день и отпуск, то");
        answerAboutSleep(weekday, vacation);

    }

    //Метод отвечает на вопрос "Спать ли дальше?". true = "Да", false = "Нет"
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean weCanSleep = false;
        if(!weekday || vacation) {
            weCanSleep = true;
        }
        return weCanSleep;
    }

    //Метод выводящий текстовое сообщение по результату работы метода sleepIn()
    public static void answerAboutSleep(boolean weekday, boolean vacation) {
        if(sleepIn(weekday, vacation)){
            System.out.println("Можем спать дальше.");
        } else {
            System.out.println("Пора идти на работу.");
        }
    }

}
