package ForkJoin.mkyong;

import java.util.stream.LongStream;

public class SlowAdd {

    public static long add(long n) {

        long[] numbers = LongStream.rangeClosed(1, n).toArray();

        long result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

}