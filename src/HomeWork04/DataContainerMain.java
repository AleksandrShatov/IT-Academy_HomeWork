package HomeWork04;

import java.util.*;

public class DataContainerMain {
    public static void main(String[] args) {
        // Создание массива с данными и передача его в новый контейнер
        Integer[] integers = {123, null, 32, null};
        DataContainer<Integer> myIntData = new DataContainer<>(integers);

        // Вывод данных контейнера
        System.out.println("Исходный контейнер, напечатанный с помощью тестового метода printAll()");
        myIntData.printAll();
        System.out.println("Исходный контейнер, напечатанный с помощью переопределённого toString()");
        System.out.println(myIntData);

        // Заполнение контейнера данными с помощью метода add(T item) и поэтапный вывод на экран процесса заполнения
        System.out.println("Поэтапный вывод процесса заполнения контейнера новыми данными");
        myIntData.add(99);
        myIntData.printAll();
        myIntData.add(567);
        myIntData.printAll();
        myIntData.add(81);
        myIntData.printAll();
        myIntData.add(47);
        myIntData.printAll();
        myIntData.add(11);
        myIntData.printAll();
        myIntData.add(345);
        myIntData.printAll();
        System.out.println("Результат попытки добавить в контейнер значения null:");
        int index = myIntData.add(null);
        System.out.println("Возвращаемое значение при попытке добавить null: index =" + index);
        System.out.println("Контейнер, напечатанный после попытки добавить в него null");
        myIntData.printAll();

        // Получение данных из контейнера с помощью метода get(int index)
        System.out.println("Получение данных из контейнера по индексу");
        System.out.println("get(1) = " + myIntData.get(1));
        System.out.println("get(-3) = " + myIntData.get(-3));
        System.out.println("get(22) = " + myIntData.get(22));
        System.out.println("get(5) = " + myIntData.get(5));

        // Получение всех элементов контейнера с помощью метода getItems() для КОПИИ контейнера
        DataContainer<Integer> copyMyIntData = new DataContainer<>(myIntData.getItems());
        System.out.println("Получение всех данных из контейнера");
        System.out.println(copyMyIntData.toString());

        // Удаление данных по индексу с помощью метода delete(int index)
        System.out.println("Тестирование метода удаления данных по индексу");
        System.out.println("delete(index: 0) = " + myIntData.delete(0));
        System.out.println(myIntData.toString());
        System.out.println("delete(index: 23) = " + myIntData.delete(23));
        System.out.println(myIntData.toString());
        System.out.println("delete(index: 2) = " + myIntData.delete(2));
        System.out.println(myIntData.toString());
        System.out.println("delete(index: -5) = " + myIntData.delete(-5));
        System.out.println(myIntData.toString());

        // Удаление конкретного объекта из контейнера с помощью метода delete(T item) (если таковой найден)
        System.out.println("Тестирование метода удаления конкретного элемента из контейнера, если таковой будет найден");
        System.out.println("delete(99) = " + myIntData.delete((Integer) 99));
        System.out.println(myIntData.toString());
        System.out.println("delete(444) = " + myIntData.delete((Integer) 444));
        System.out.println(myIntData.toString());

        // Создаём компаратор для сортировки контейнера
        Comparator<Integer> integerComparator = new Comparator<>() {
          @Override
          public int compare(Integer i1, Integer i2) {
              return ((i1.intValue() - i2.intValue()) > 0 ? 1 : (i1.intValue() - i2.intValue()) < 0 ? -1 : 0);
          }
        };
        // Сортировка контейнера с помощью метода sort(Comparator<...> comparator)
        myIntData.sort(integerComparator);
        System.out.println("Вывод данных контейнера после сортировки с помощью заданного компаратора");
        System.out.println(myIntData.toString());

        // Тестирование статического метода сортировки с указанием нового контейнера
        String[] names = {"Ярослав", "Никита", "Алексей", "Григорий", "Борис"};
        DataContainer<String> namesContainer = new DataContainer<>(names);
        namesContainer.add("Дмитрий");
        namesContainer.add("Тимофей");
        namesContainer.add("Антон");
        System.out.println("Контейнер имён до сортировки");
        System.out.println(namesContainer.toString());
        System.out.println("Контейнер имён после сортировки");
        DataContainer.sort(namesContainer);
        System.out.println(namesContainer.toString());

        // Тестирование статического метода сортировки с указанием нового контейнера и компаратора
        Double[] doubles = {3.5, 6.9, 1.1, 5.8, 2.3, 10.2, 0.6, 7.2};
        DataContainer<Double> doublesContainer = new DataContainer<>(doubles);
        System.out.println("Контейнер doublesContainer до сортировки:");
        System.out.println(doublesContainer.toString());

        Comparator<Double> doubleComparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return ((o1.doubleValue() - o2.doubleValue()) > 0 ? -1 : ((o1.doubleValue() - o2.doubleValue()) < 0 ? 1 : 0));
            }
        };

        DataContainer.sort(doublesContainer, doubleComparator);
        System.out.println("Контейнер doublesContainer после сортировки:");
        System.out.println(doublesContainer.toString());

    }
}