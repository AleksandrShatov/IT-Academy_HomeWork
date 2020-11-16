package ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {

    private static final long numOfOperations = 10_000_000_000L;
    private static final int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {

        System.out.println("Number of CPU threads is = " + numOfThreads);

        int count = 0;
        while(count < 1) {
            SimpleSum(numOfOperations);
//            ForkJoinSum(numOfOperations, 4);
            ForkJoinSum(numOfOperations, 2);
            count++;
        }
    }

    public static void SimpleSum(long numOfOperations) {

        long startTime = System.currentTimeMillis();

        long sum = 0L;
        for (long i = 0; i < numOfOperations; i++) {
            sum += i;
        }
        System.out.println(sum);

        long stopTime = System.currentTimeMillis();

        System.out.println("Time SimpleSum is: " + (stopTime - startTime) + " ms");
    }

    public static void ForkJoinSum(long numOfOperations, int numOfThreads) {

        long startTime = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        RecursiveSum recursiveSum = new RecursiveSum(0, numOfOperations, numOfOperations, numOfThreads);
        System.out.println(pool.invoke(recursiveSum));

        long stopTime = System.currentTimeMillis();

        System.out.println("Time ForkJoinSum for " + numOfThreads + " threads is " + (stopTime - startTime) + " ms");

    }
}
