package ForkJoin;

public class WithoutForkJoinMain {
    public static void main(String[] args) {

        long numOfOperations = 10_000_000_000L;

        long startTime = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < numOfOperations; i++) {
            sum += i;
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(sum);
        System.out.println("Time is " + (stopTime - startTime) + " ms");
    }
}
