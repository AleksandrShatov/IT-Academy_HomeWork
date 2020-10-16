package HomeWork04;

import java.util.Arrays;

public class DataContainer<T> {
    /**
     * Поле для хранения объектов контейнера
     */
    private T[] data = (T[])new Object[0];

    /**
     * Метод для добавления объектов в контейнер
     * @param item добавляемый объект
     * @return индекс позиции, в которую был добавлен объект
     */
    public int add(T item){
        if(item == null){
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
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
    public T get(int index ){
        if(index < 0 || index >= data.length || data[index] == null){
            return null;
        }
        return data[index];
    }

    /**
     * Метод возвращающий контейнер
     * @return контейнер типа T[]
     */
    public T[] getItems(){
        return  data;
    }




    // ТЕСТОВЫЙ МЕТОД ДЛЯ ФОРМИРОВАНИЯ ТЕСТОВОГО КОНТЕЙНЕРА
    public int addTest(T item){
        T[] copyData = Arrays.copyOf(data, data.length + 1);
        data = copyData;
        data[data.length - 1] = item;
        return data.length - 1;
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                System.out.print("null; ");
            } else{
                System.out.print(data[i].toString() + "; ");
            }
        }
//      System.out.println(Arrays.toString(data));
        System.out.println("");
    }
}
