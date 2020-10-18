package HomeWork04;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{
    /**
     * Размер контейнера по умолчанию
     */
    private static final int DEFAULT_SIZE = 0;

    /**
     * Поле для хранения объектов контейнера
     */
    private T[] data = (T[])new Object[DEFAULT_SIZE];

    public DataContainer(T[] data) {
        this.data = data;
    }


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
    public <T> T[] getItems(){
        return  (T[]) data;
    }

    /**
     * Метод, удаляющий объект из контейнера по указанному индексу
     * @param index индекс объекта, который необходимо удалить
     * @return true - если удаление прошло успешно, false - если удаления не было
     */
    public boolean delete(int index){
        if (index < 0 || index >= data.length ){
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
    public boolean delete(T item){
        int itemIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(item)){
                itemIndex = i;
                break;
            }
        }
        return delete(itemIndex);
    }

    /**
     * Метод для сортировки объектов контейнера
     * @param comparator - объект с реализацией сравнения объектов контейнера
     */
    public void sort(Comparator<? super T> comparator){
        boolean isSwap = true;
        while(isSwap){
            isSwap = false;
            for (int i = 0; i < data.length -1; i++) {
                if(comparator.compare(data[i], data[i + 1]) > 0){
                    T tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                    isSwap = true;
                }
            }
        }
    }

    /**
     * Метод, преобразующий содержимое контейнера в строку без учёта объектов null
     * @return  String - перечень объектов контейнера
     */
    @Override
    public String toString(){
        String result= "[";
        boolean needComma = false;
        for (T item : data) {
            if(item != null){
                if(needComma){
                    result += "; ";
                } else{
                    needComma = true;
                }
                result += String.valueOf(item);
            } else{
                continue;
            }
        }
        result += "]";
        return result;
    }

    /**
     *
     * @param container
     */
    public static <T> void sort(DataContainer<? extends Comparable> container){
//        boolean isSwap = true;
//        while(isSwap){
//            isSwap = false;
//            for (int i = 0; i < container.getItems().length -1; i++) {
//                if(container.get(i).compareTo(container.get(i + 1)) > 0){
//                    T tmp1 = (T) container.get(i);
//                    T tmp2 = (T) container.get(i + 1);
//                    T[] partOfContainer = Arrays.copyOfRange((T[]) container, i + 2, container.getItems().length);
//                    for (int j = i; j < container.getItems().length; j++) {
//                        container.delete(j);
//                    }
//                    container.add(tmp2);
//                    container.add(tmp1);
//                    for (int j = 0; j < partOfContainer.length; j++) {
//                        container.add(partOfContainer[j]);
//                    }
//                    isSwap = true;
//                }
//            }
//        }
    }

    /**
     *
     * @param container
     * @param comparator
     */
    public static <T> void sort(DataContainer<?> container, Comparator<?> comparator){
//        boolean isSwap = true;
//        while(isSwap){
//            isSwap = false;
//            for (int i = 0; i < container.getItems().length - 1; i++) {
//                if(comparator.compare(container.get(i), container.get(i + 1)) > 0){
//                    T tmp = data[i];
//                    data[i] = data[i + 1];
//                    data[i + 1] = tmp;
//                    isSwap = true;
//                }
//            }
//        }
    }

    // МЕТОД, ПЕЧАТАЮЩИЙ ВСЕ ОБЪЕКТЫ КОНТЕЙНЕРА
    public void print(){
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
//      System.out.println(Arrays.toString(data));
        System.out.println("");
    }

    // ТЕСТОВЫЙ МЕТОД ДЛЯ ФОРМИРОВАНИЯ ТЕСТОВОГО КОНТЕЙНЕРА
    public int addTest(T item){
        T[] copyData = Arrays.copyOf(data, data.length + 1);
        data = copyData;
        data[data.length - 1] = item;
        return data.length - 1;
    }
}
