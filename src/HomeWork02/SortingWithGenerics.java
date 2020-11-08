package HomeWork02;

import java.util.Comparator;

public class SortingWithGenerics<N> {

    /**
     * Метод для пузыроковой сортировки примитива int с помощью сортировки по умолчанию
     * @param extArr исходный массив для сортировки
     * @param direction направление сортировки: true - по возрастанию, false - по убыванию
     */
    public static void bubbleSort(int[] extArr, boolean direction){
        Integer[] intArr = new Integer[extArr.length];
        for (int i = 0; i < extArr.length; i++) {
            intArr[i] = extArr[i];
        }
        bubbleSort(intArr, direction);
        for (int i = 0; i < intArr.length; i++) {
            extArr[i] = intArr[i];
        }
    }

    /**
     * Метод для шейкерной сортировки примитива int с помощью сортировки по умолчанию
     * @param extArr исходный массив для сортировки
     */
    public static void cocktailSort(int[] extArr){
        Integer[] intArr = new Integer[extArr.length];
        for (int i = 0; i < extArr.length; i++) {
            intArr[i] = extArr[i];
        }
        cocktailSort(intArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < intArr.length; i++) {
            extArr[i] = intArr[i];
        }
    }

    /**
     * Метод для шейкерной сортировки примитива int с помощью заданного компаратора
     * @param extArr исходный массив для сортировки
     * @param comparator компаратор для сравнения элементов массива
     */
    public static void cocktailSort(int[] extArr, Comparator<Integer> comparator){ //TODO
        Integer[] intArr = new Integer[extArr.length];
        for (int i = 0; i < extArr.length; i++) {
            intArr[i] = extArr[i];
        }
        cocktailSort(intArr, comparator);
        for (int i = 0; i < intArr.length; i++) {
            extArr[i] = intArr[i];
        }
    }

    /**
     * Метод для пузыроковой сортировки с помощью сортировки по умолчанию
     * @param extArr исходный массив для сортировки
     * @param direction направление сортировки: true - по возрастанию, false - по убыванию
     * @param <N> тип элементов массива
     */
    public static <N extends Comparable<N>> void bubbleSort(N[] extArr, boolean direction){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < extArr.length - 1; i++) {
                if(extArr[i].compareTo(extArr[i + 1]) == 0) {
                    continue;
                } else {
                    if(direction) {
                        if(extArr[i].compareTo(extArr[i + 1]) > 0) {
                            swapElements(extArr, i);
                            isSwapped = true;
                        }
                    } else {
                        if(extArr[i].compareTo(extArr[i + 1]) < 0) {
                            swapElements(extArr, i);
                            isSwapped = true;
                        }
                    }
                }
            }
        }
    }

    /**
     * Метод для шейкерной сортировки с помощью сортировки по умолчанию
     * @param extArr исходный массив для сортировки
     * @param <N> тип элементов массива
     */
    public static <N extends Comparable<N>> void cocktailSort(N[] extArr){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        int leftIndex = 0;
        int rightIndex = extArr.length - 2;
        while (isSwapped) {
            isSwapped = false;
            for (int i = leftIndex; i <= rightIndex; i++) {
                if(extArr[i].compareTo(extArr[i + 1]) > 0) {
                    swapElements(extArr, i);
                    isSwapped = true;
                }
                if(extArr[i].compareTo(extArr[i + 1]) == 0) {
                    continue;
                }
            }
            leftIndex++;
            for (int j = rightIndex; j >= leftIndex; j--) {
                if(extArr[j].compareTo(extArr[j - 1]) < 0) {
                    swapElements(extArr, j - 1);
                    isSwapped = true;
                }
                if(extArr[j].compareTo(extArr[j + 1]) == 0) {
                    continue;
                }
            }
            rightIndex--;
        }
    }

    /**
     * Метод для шейкерной сортировки с помощью заданного компаратора
     * @param extArr исходный массив для сортировки
     * @param comparator компаратор для сравнения элементов массива
     * @param <N> тип элементов массива
     */
    public static <N> void cocktailSort(N[] extArr, Comparator<? super N> comparator){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        int leftIndex = 0;
        int rightIndex = extArr.length - 2;
        while (isSwapped) {
            isSwapped = false;
            for (int i = leftIndex; i <= rightIndex; i++) {
                if(comparator.compare(extArr[i], extArr[i + 1]) > 0) {
                    swapElements(extArr, i);
                    isSwapped = true;
                }
                if(comparator.compare(extArr[i], extArr[i + 1]) == 0) {
                    continue;
                }
            }
            leftIndex++;
            for (int j = rightIndex; j >= leftIndex; j--) {
                if(comparator.compare(extArr[j], extArr[j - 1]) < 0) {
                    swapElements(extArr, j - 1);
                    isSwapped = true;
                }
                if(comparator.compare(extArr[j], extArr[j - 1]) == 0) {
                    continue;
                }
            }
            rightIndex--;
        }
    }

    /**
     * Метод меняет местам i-й и (i + 1)-й элементы в исходном массиве arr
     * @param arr исходный массив
     * @param i индекс элемента
     * @param <N> тип элементов массива
     */
    public static <N> void swapElements(N[] arr, int i){
        if(i >= 0 && i < arr.length - 1) {
            N tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        } else {
            System.out.println("Неверно задан индекс для элемента массива!");
        }
    }

}


