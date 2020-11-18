package ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {
    // Количество циклов суммирования
    private static final long numOfOperations = 10_000_000_000L;
    // Количество доступных потоков в системе
    private static final int numOfThreads = 2;
//    private static final int numOfThreads = Runtime.getRuntime().availableProcessors();

    /* Выбор ширины - проблема:
     * слишком маленький = куча объектов задач
     * слишком большой = мало параллелизма
     */
    private static final long threshold = numOfOperations / numOfThreads;

    public static void main(String[] args) {
        // Печатаем количество имеющихся в системе потоков
        System.out.println("Number of CPU threads is = " + numOfThreads);
        // Вызов метода с суммированием в одном потоке
        SimpleSum(numOfOperations);
        // Вызов метода с суммированием в нескольких потоках
        ForkJoinSum(0, numOfOperations, threshold);

//        ForkJoinSum(numOfOperations, numOfThreads);
    }

    /**
     * Метод с суммированием в одном потоке
     * @param numOfOperations - количество циклов суммирования
     */
    public static void SimpleSum(long numOfOperations) {
        long sum = 0L; // переменная для суммы
        long startTime = System.currentTimeMillis(); // время перед началом суммирования
        for (long i = 0; i < numOfOperations; i++) { // цикл суммирования
            sum += i;
        }
        long stopTime = System.currentTimeMillis(); // время после окончания суммирования
        // Вывод результата суммирования, может быть неверным из-зи переполнения
        System.out.println(sum);
        // Вывод примерного времени процесса суммирования
        System.out.println("Time SimpleSum is: " + (stopTime - startTime) + " ms");
    }

    /**
     * Метод с суммированием в заданном количестве потоков
     * @param from - начало диаппазона суммирования
     * @param to - конец диаппазона суммирования
     * @param threshold - ширина (предел) дробления задачи
     */
    public static void ForkJoinSum(long from, long to, long threshold) {
        long sum = 0L; // переменная для суммы
        ForkJoinPool pool = new ForkJoinPool(numOfThreads); // создание пула потоков, с заданным количеством
        RecursiveSum recursiveSum = new RecursiveSum(from, to, threshold);
        long startTime = System.currentTimeMillis(); // время перед началом суммирования
        sum = pool.invoke(recursiveSum); // запуск процесса суммирования
        long stopTime = System.currentTimeMillis(); // время после окончания суммирования
        // Вывод результата суммирования, может быть неверным из-зи переполнения
        System.out.println(sum);
        // Вывод примерного времени процесса суммирования
        System.out.println("Time ForkJoinSum for " + numOfThreads + " threads is " + (stopTime - startTime) + " ms");
    }
}
