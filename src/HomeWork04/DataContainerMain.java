package HomeWork04;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Object> myData = new DataContainer<>();
        // Заполнение с помощью тестового метода
        int a = myData.addTest(123);
        int b = myData.addTest(null);
        int c = myData.addTest(23);
        int d = myData.addTest(null);
        System.out.println("Массив заполненный с помощь ТЕСТОВОГО метода");
        myData.print();
        // Заполнение с помощью правильного метода
        int x = myData.add(99);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        int y = myData.add(567);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        int z = myData.add(81);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        int k = myData.add(null);
        System.out.println("k = " + k);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        // Получение элементов из массива
        System.out.println(myData.get(1));
        System.out.println(myData.get(-3));
        System.out.println(myData.get(22));
        System.out.println(myData.get(5));

        Object[] copyData = myData.getItems();
        System.out.println("Вывод копии хранилища: ");
        System.out.println(Arrays.toString(copyData));


    }
}
