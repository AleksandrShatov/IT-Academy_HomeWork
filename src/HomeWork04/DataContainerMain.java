package HomeWork04;

import java.util.*;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer i = 13;
        float f = i.floatValue();

        Integer[] integers = {123, null, 23, null};
        DataContainer<Integer> myData = new DataContainer<>(integers);

        Double[] numbersOfDouble = {};
        DataContainer<Double> myDouble = new DataContainer<>(numbersOfDouble);

        String[] strings = {};
        DataContainer<String> myStrings = new DataContainer<>(strings);

        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator<String> comp2 = (o1, o2) -> o1.length() - o2.length();

        Comparator<String> comp3 = Comparator.comparing(o -> o.length());

       DataContainer<String> dataStrings = new DataContainer<>();
       dataStrings.add("Follow me");
       dataStrings.add("abc");
       dataStrings.add("Hello");
       dataStrings.add("Java");
       System.out.println(dataStrings.toString());
       dataStrings.sort(comp1);
       System.out.println(dataStrings.toString());

        System.out.println("Исходный массив");
        myData.printAll();
        System.out.println("Печать с помощью переопределённого toString()");
        System.out.println(myData);

        // Заполнение с помощью правильного метода
        myData.add(99);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.printAll();
        myData.add(567);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.printAll();
        myData.add(81);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.printAll();
        int k = myData.add(null);
        System.out.println("k = " + k);
        System.out.println("Массив заполненный с помощь ПРАВИЛЬНОГО метода");
        myData.printAll();

        // Заполнение myStrings
        myStrings.add("Whiskey");
        myStrings.add("Frederic");
        myStrings.add("Bob");
        myStrings.add("Alex");
        System.out.println("Вывод контейнера myString");
        System.out.println(myStrings.toString());

        // Проверка сортировки
        DataComparator<Integer> dataComparator = new DataComparator<>();
        myData.sort(dataComparator);
        System.out.println("Массив после сортировки");
        myData.printAll();
        System.out.println("Контейнера myString после сортировки");
//        myStrings.sort(dataComparator);
        System.out.println(myStrings.toString());

        // Получение элементов из массива
        System.out.println(myData.get(1).toString());
        System.out.println(myData.get(-3));
        System.out.println(myData.get(22));
        System.out.println(myData.get(5));

        // !!! ПРОБЛЕМЫ С МАССИВОМ T[] !!!
        Integer[] copyData = myData.getItems();
        DataContainer<Integer> myData2 = new DataContainer<>(myData.getItems());
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
        System.out.println(myData.delete((99)));
        myData.printAll();
        System.out.println(myData.delete(new Integer(567)));
        myData.printAll();
        System.out.println(myData.delete(new Integer(333)));
        myData.printAll();

        String[] newString = {};
        DataContainer<String> newData = new DataContainer<>(newString);
        String s1 = new String();
        String s2 = new String();
        String s3 = s1;
        String s4 = new String();
        String s5 = s1;
        String s6 = s2;
        String s7 = new String();
        newData.add(s1);
        newData.add(s2);
        newData.add(s3);
        newData.add(s4);
        newData.add(s5);
        newData.add(s6);
        newData.add(s7);
        System.out.println("Новый контейнер");
        System.out.println(newData);
        System.out.println(newData.delete(s2));
        newData.printAll();
        System.out.println(newData);
        System.out.println(newData.delete(s7));
        System.out.println(newData);
        String s13 = new String();
        System.out.println(newData.delete(s13));
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

        // Тестирование статического метода сортировки с указанием компаратора
        Double[] doubles = {3.5, 6.9, 1.1, 5.8, 2.3, 10.2, 0.6, 7.2};
        DataContainer<Double> doublesContainer = new DataContainer<>(doubles);
        System.out.println("Массив doubles до сортировки:");
        System.out.println(doublesContainer.toString());
        Comparator<Double> doubleComparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return ((o1.doubleValue() - o2.doubleValue()) > 0 ? -1 : ((o1.doubleValue() - o2.doubleValue()) < 0 ? 1 : 0));
            }
        };
        DataContainer.sort(doublesContainer, doubleComparator);
        System.out.println("Массив doubles после сортировки:");
        System.out.println(doublesContainer.toString());

    }
}
