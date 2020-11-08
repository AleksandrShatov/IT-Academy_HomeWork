package HomeWork04;

import HomeWork02.SortingWithGenerics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс контейнер, для хранения объектов
 * @param <T> Тип объектов, хранящихся в контейнере
 */
public class DataContainer<T> {
    /**
     * Размер контейнера по умолчанию
     */
    private static final int DEFAULT_SIZE = 0;

    /**
     * Поле для хранения объектов контейнера
     */
    private T[] data;

    /**
     * Конструктор по умолчанию, без параметров
     */
    public DataContainer() {
        this.data = (T[]) Array.newInstance(Object.class, DEFAULT_SIZE);
    }

    // TODO
//    public DataContainer() {
//        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        data = (T[]) Array.newInstance(clazz, 0);
//    }

//    public DataContainer() {                          // -------------------ВОЗМОЖНА ТАКАЯ ПРОБЛЕМА------------------------------
//        this.data = (T[]) new Object[DEFAULT_SIZE];   // class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Comparable
//    }                                                 // ------------------------------------------------------------------------

    /**
     * Конструктор, принимающий на вход один параметр в виде контейнера объектов
     * @param data контейнер объектов
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Конструктор задающий тип контейнера и количество элементов для него
     * @param type тип элементов для контейнера
     * @param elementsCounter количество элементов в контейнере
     */
    public DataContainer(Class<T> type, int elementsCounter) {
        if(elementsCounter <= 0 || type == null){
            this.data = (T[]) Array.newInstance(Object.class, DEFAULT_SIZE);
        } else {
            this.data = (T[]) Array.newInstance(type, elementsCounter);
        }
    }

    /**
     * Метод для добавления объектов в контейнер
     * @param item добавляемый объект
     * @return индекс позиции, в которую был добавлен объект, либо -1 если добавить данные не удалось
     */
    public int add(T item) {
        if(item == null){
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        T[] copyData = Arrays.copyOf(data, data.length + 1);
        data = copyData;
        data[data.length - 1] = item;
        return data.length - 1;
    }

    /**
     * Метод возвращает объект из контейнера по указанному индексу
     * @param index необходимый индекс оъекта
     * @return объект типа T
     */
    public T get(int index) {
        if(index < 0 || index >= data.length || data[index] == null) {
            return null;
        }
        return data[index];
    }

    /**
     * Метод возвращающий контейнер
     * @return контейнер типа T[]
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод, удаляющий объект из контейнера по указанному индексу
     * @param index индекс объекта, который необходимо удалить
     * @return true - если удаление прошло успешно, false - если удаления не было
     */
    public boolean delete(int index) {
        if (index < 0 || index >= data.length ) {
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            T[] copyData = Arrays.copyOf(data, data.length - 1);
            data = copyData;
            return true;
        }
    }

    /**
     * Метод, удаляющий указанный объект из контейнера
     * @param item объект, который необходимо удалить (первый найденный)
     * @return true - если удаление прошло успешно, false - если удаления не было
     */
    public boolean delete(T item) {
        int itemIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(item)) {
                itemIndex = i;
                break;
            }
        }
        return delete(itemIndex);
    }

    /**
     * Метод для сортировки объектов данного контейнера, с помощью заданного компаратора
     * @param comparator - объект с реализацией сравнения объектов контейнера
     */
    public void sort(Comparator<? super T> comparator) {
        SortingWithGenerics.cocktailSort(data, comparator);
    }

    /**
     * Статический Метод для сортировки объектов заданного (входящего) контейнера
     * @param container заданный контейнер, элементы которого необходимо отсортировать
     * @param <T> тип объектов контейнера
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) { // TODO Сделать описание
        SortingWithGenerics.bubbleSort(container.getItems(), true);
    }

    /**
     * Статический Метод для сортировки объектов заданного (входящего) контейнера с помощью заданного компаратора
     * @param container заданный контейнер, элементы которого необходимо отсортировать
     * @param comparator - объект с реализацией сравнения объектов контейнера
     * @param <T> тип объектов контейнера
     */
    public static <T> void sort(DataContainer<T> container, Comparator<? super T> comparator) {
        SortingWithGenerics.cocktailSort(container.getItems(), comparator);
    }

    /**
     * Метод, преобразующий содержимое контейнера в строку без учёта объектов null
     * @return  String - перечень объектов контейнера
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        boolean needComma = false;
        for (T item : data) {
            if(item != null) {
                if(needComma) {
                    builder.append("; ");
                } else{
                    needComma = true;
                }
                builder.append(item);
            } else{
                continue;
            }
        }
        builder.append(']');
        return builder.toString();
    }

    /**************************
    * МЕТОДЫ ДЛЯ ТЕСТИРОВАНИЯ *
    **************************/

    /**
     * Метод, печатающий все объекты контейнера (включая null)
     */
    public void printAll() {
        boolean needComma = false;
        for (int i = 0; i < data.length; i++) {
            if (needComma){
                System.out.print("; ");
            } else{
                needComma = true;
            }
            if(data[i] != null) {
                System.out.print(data[i].toString());
            } else{
                System.out.print("null");
            }
        }
        System.out.println("");
    }

    /**
     * Метод, добавляющий элементы в контейнер, включая и null
     * @param item добавляемый объект
     * @return индекс позиции, в которую был добавлен объект
     */
    public int addTest(T item) {
        T[] copyData = Arrays.copyOf(data, data.length + 1);
        data = copyData;
        data[data.length - 1] = item;
        return data.length - 1;
    }
}
