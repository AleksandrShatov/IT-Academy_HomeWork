package HomeWork02;

/**
 * Класс, позволяющий выводить на печать заданные массивы различными способами
 * @param <N> тип элементов массива
 */
public class ArraysPrinting<N> {

    /**
     * Метод печатающий заданный массив с помощью do....while
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printArrayWithDoWhile(N[] array) {
        if(array.length == 0) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            boolean needComma = false;
            builder.append('{');
            int i = 0;
            do {
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
                i++;
            } while (i < array.length);
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив с помощью while
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printArrayWithWhile(N[] array) {
        if(array.length == 0) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            boolean needComma = false;
            builder.append('{');
            int i = 0;
            while (i < array.length){
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
                i++;
            }
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив с помощью for
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printArrayWithFor(N[] array) {
        if(array.length == 0) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            boolean needComma = false;
            builder.append('{');
            for (int i = 0; i < array.length; i++) {
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
            }
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив с помощью foreach
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printArrayWithForEach(N[] array) {
        StringBuilder builder = new StringBuilder();
        boolean needComma = false;
        builder.append('{');
        for (N n : array) {
            if(needComma) {
                builder.append("; ");
            } else {
                needComma = true;
            }
            builder.append(n);
        }
        builder.append('}');
        System.out.println(builder.toString());
    }

    /**
     * Метод печатающий каждый второй элемент заданного массива
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printEverySecondFromArray(N[] array) {
        if(array.length == 0 || array.length == 1) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            boolean needComma = false;
            builder.append('{');
            for (int i = 1; i < array.length; i += 2) {
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
            }
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив в обратном порядке с помощью do....while
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printReverseArrayWithDoWhile(N[] array) {
        if(array.length == 0) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            boolean needComma = false;
            builder.append('{');
            int i = array.length - 1;
            do {
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
                i--;
            } while (i >= 0);
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив в обратном порядке с помощью while
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printReverseArrayWithWhile(N[] array) {
        if(array.length == 0) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            boolean needComma = false;
            builder.append('{');
            int i = array.length - 1;
            while (i >= 0){
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
                i--;
            }
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив в обратном порядке с помощью for
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printReverseArrayWithFor(N[] array) {
        if(array.length == 0) {
            System.out.println("{}");
        } else {
            StringBuilder builder = new StringBuilder();
            int startIndex = array.length - 1;
            boolean needComma = false;
            builder.append('{');
            for (int i = startIndex; i >= 0; i--) {
                if(needComma) {
                    builder.append("; ");
                } else {
                    needComma = true;
                }
                builder.append(array[i]);
            }
            builder.append('}');
            System.out.println(builder.toString());
        }
    }

    /**
     * Метод печатающий заданный массив в обратном порядке с помощью foreach
     * @param array заданный исходный массив
     * @param <N> тип элементов массива
     */
    public static <N> void printReverseArrayWithForEach(N[] array) {
        // Делаем реверс массива
        for (int k = 0; k < array.length / 2; k++) {
            N tmp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = tmp;
        }
        // Выводим на печать
        printArrayWithForEach(array);
    }
}