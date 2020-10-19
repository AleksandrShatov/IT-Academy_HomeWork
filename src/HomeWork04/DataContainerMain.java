package HomeWork04;

import java.sql.SQLOutput;
import java.util.*;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer i = 13;
        float f = i.floatValue();

        Object[] objects = {};
        DataContainer<Object> myData = new DataContainer<>(objects);

        Double[] numbersOfDouble = {};
        DataContainer<Object> myDouble = new DataContainer<>(numbersOfDouble);

        String[] strings = {};
        DataContainer<Object> myStrings = new DataContainer<>(strings);

        // Заполнение с помощью тестового метода
        myData.addTest(123);
        myData.addTest(null);
        myData.addTest(23);
        myData.addTest(null);
        System.out.println("Массив заполненный с помощь ТЕСТОВОГО метода");
        myData.print();
        System.out.println("Печать с помощью переопределённого toString()");
        System.out.println(myData);
        //TODO
        //System.out.println(myData.get(1).toString());

        // Заполнение с помощью правильного метода
        myData.add(99);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        myData.add(567);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        myData.add(81);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();
        int k = myData.add(null);
        System.out.println("k = " + k);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.print();

        // Заполнение myStrings
        myStrings.add("Whiskey");
        myStrings.add("Frederic");
        myStrings.add("Bob");
        myStrings.add("Alex");
        System.out.println("Вывод контейнера myString");
        System.out.println(myStrings.toString());

        // Проверка сортировки
        DataComparator<Object> dataComparator = new DataComparator<>();
        myData.sort(dataComparator);
        System.out.println("Массив после сортировки");
        myData.print();
        System.out.println("Контейнера myString после сортировки");
        myStrings.sort(dataComparator);
        System.out.println(myStrings.toString());

        // Получение элементов из массива
        System.out.println(myData.get(1).toString());
        System.out.println(myData.get(-3));
        System.out.println(myData.get(22));
        System.out.println(myData.get(5));

        // !!! ПРОБЛЕМЫ С МАССИВОМ T[] !!!
        Object[] copyData = myData.getItems();
        DataContainer<Object> myData2 = new DataContainer<>(myData.getItems());
        System.out.println("Вывод копии хранилища: ");
        System.out.println(myData2.get(2).toString());
        System.out.println(Arrays.toString(copyData));
        System.out.println(myData2.toString());
        //
//        System.out.println("Тест для метода delete(int index):");
//        System.out.println(myData.delete(0));
//        myData.print();
//        System.out.println(myData.delete(23));
//        myData.print();
//        System.out.println(myData.delete(2));
//        myData.print();
//        System.out.println(myData.delete(2));
//        myData.print();
//        System.out.println(myData.delete(2));
//        myData.print();
        //
        System.out.println("Тест для метода delete(T item):");
        System.out.println(myData.delete((Object) 99));
        myData.print();
        System.out.println(myData.delete(new Integer(567)));
        myData.print();
        System.out.println(myData.delete(new Integer(333)));
        myData.print();

        Object[] newObjects = {};
        DataContainer<Object> newData = new DataContainer<>(newObjects);
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        Object o4 = new Object();
        Object o5 = o1;
        Object o6 = o2;
        Object o7 = new Object();
        newData.add(o1);
        newData.add(o2);
        newData.add(o3);
        newData.add(o4);
        newData.add(o5);
        newData.add(o6);
        newData.add(o7);
        System.out.println("Новый контейнер");
        System.out.println(newData);
        System.out.println(newData.delete(o2));
        newData.print();
        System.out.println(newData);
        System.out.println(newData.delete(o7));
        System.out.println(newData);
        Object o13 = new Object();
        System.out.println(newData.delete(o13));
        System.out.println(newData);

        // Тестирование статического метода сортировки
        String[] names = {"Ярослав", "Никита", "Алексей", "Григорий"};
        DataContainer<String> namesContainer = new DataContainer<>(names);
        namesContainer.add("Дмитрий");
        namesContainer.add("Тимофей");
        namesContainer.add("Антон");
        System.out.println("Контейнер имён до сортировки");
        System.out.println(namesContainer.toString());
        System.out.println("Статическая сортировка контейнера имён");
        DataContainer.sort(namesContainer);
        System.out.println(namesContainer.toString());

    }
}
