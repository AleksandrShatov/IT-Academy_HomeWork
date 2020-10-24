package HomeWork02;

public class SortingWithGenerics<N extends Comparable> {

    /**
     * Метод для пузыроковой сортировки
     * @param extArr исходный массив для сортировки
     * @param direction направление сортировки: true - по возрастанию, false - по убыванию
     * @return отсортированный массив
     */
    public static <N extends Comparable> void bubbleSort(N[] extArr, boolean direction){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < extArr.length - 1; i++) {
                if(direction) {
                    if(extArr[i].compareTo(extArr[i + 1]) == 1) {
                        swapElements(extArr, i);
                        isSwapped = true;
                    }
                } else {
                    if(extArr[i].compareTo(extArr[i + 1]) == -1) {
                        swapElements(extArr, i);
                        isSwapped = true;
                    }
                }
            }
        }
    }

    /**
     * Метод для шейкерной сортировки
     * @param extArr исходный массив для сортировки
     * @return отсортированный массив
     */
    public static <N extends Comparable> void cocktailSort(N[] extArr){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        int leftIndex = 0;
        int rightIndex = extArr.length - 2;
        while (isSwapped) {
            isSwapped = false;
            for (int i = leftIndex; i <= rightIndex; i++) {
                if(extArr[i].compareTo(extArr[i + 1]) == 1) {
                    swapElements(extArr, i);
                    isSwapped = true;
                }
            }
            leftIndex++;
            for (int j = rightIndex; j >= leftIndex; j--) {
                if(extArr[j].compareTo(extArr[j - 1]) == -1) {
                    swapElements(extArr, j - 1);
                    isSwapped = true;
                }
            }
            rightIndex--;
        }
    }

    /**
     * Метод меняет местам i-й и (i + 1)-й элементы в исходном массиве arr
     * @param arr исходный массив
     * @param i индекс элемента
     */
    public static <N extends Comparable> void swapElements(N[] arr, int i){
        if(i >= 0 && i < arr.length - 1) {
            N tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        } else {
            System.out.println("Неверно задан индекс для элемента массива!");
        }
    }

}


