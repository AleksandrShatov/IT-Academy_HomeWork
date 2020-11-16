package ForkJoin;

public class WithoutForkJoinMain {
    public static void main(String[] args) {
        long numOfOperations = 40_000_000_000L;

        long startTime = System.currentTimeMillis();

        long sum = 0L;
        for (long i = 0; i < numOfOperations; i++) {
            sum += i;
        }
        System.out.println(sum);

        long stopTime = System.currentTimeMillis();

        System.out.println("Time is " + (stopTime - startTime) + " ms");

    }

}
