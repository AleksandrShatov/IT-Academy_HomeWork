package ForkJoin.mkyong;
/*
https://mkyong.com/java/java-fork-join-framework-examples/
 */

public class Main {

    public static void main(String[] args) {






        long startTime = System.currentTimeMillis();
        System.out.println(ForkJoinAdd.startForkJoinSum(1_000_000));
        long endTime = System.currentTimeMillis();
        System.out.println("Time is: " + (endTime - startTime) + " ms");

        long startTime2 = System.currentTimeMillis();
        System.out.println(SlowAdd.add(1_000_000));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time is: " + (endTime2 - startTime2) + " ms");

        long startTime3 = System.currentTimeMillis();
        System.out.println(ForkJoinAdd.startForkJoinSum(1_000_000));
        long endTime3 = System.currentTimeMillis();
        System.out.println("Time is: " + (endTime3 - startTime3) + " ms");

        long startTime4 = System.currentTimeMillis();
        System.out.println(SlowAdd.add(1_000_000));
        long endTime4 = System.currentTimeMillis();
        System.out.println("Time is: " + (endTime4 - startTime4) + " ms");

    }
}