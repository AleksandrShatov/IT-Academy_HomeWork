package ForkJoin.mkyong;

public class MainSlowAdd {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(SlowAdd.add(1_000_000));
        long endTime = System.currentTimeMillis();
        System.out.println("Time is: " + (endTime - startTime) + " ms");

    }
}
