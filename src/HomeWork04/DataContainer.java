package HomeWork04;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data = (T[])new Object[0];

    public int add(T item){
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

    public int addTest(T item){
        T[] copyData = Arrays.copyOf(data, data.length + 1);
        data = copyData;
        data[data.length - 1] = item;
        return data.length - 1;
    }

    public void print(){
//        for (int i = 0; i < data.length; i++) {
//            if(data[i].equals(null)){
//                System.out.println("null; ");
//            } else{
//                System.out.print(data[i].toString() + "; ");
//            }
//        }
        System.out.println(Arrays.toString(data));
        System.out.println("");
    }
}
