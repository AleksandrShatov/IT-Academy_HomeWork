package ForkJoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

// TODO - попробовать переделать для расчёта чисел Фибоначчи
public class RecursiveSum extends RecursiveTask<Long> {

    private final long from;
    private final long to;

    private final long numOfOperations;
    private final int numOfThreads;

    public RecursiveSum(long from, long to, long numOfOperations, int numOfThreads) {
        this.from = from;
        this.to = to;
        this.numOfOperations = numOfOperations;
        this.numOfThreads = numOfThreads;
    }

    @Override
    protected Long compute() {

        /* THRESHOLD = numOfOperations/numOfThreads
         * Выбор ширины - проблема:
         * слишком маленький = куча объектов задач
         * слишком большой = мало параллелизма
         */
        if((to - from) <= (numOfOperations/numOfThreads)) {
            long sum = 0L;
            for (long i = from; i < to; i++) {
                sum += i;
            }
            return sum;
        } else {
            long middle = (to + from) / 2;
            RecursiveSum firstHalf = new RecursiveSum(0, middle, numOfOperations, numOfThreads);
            firstHalf.fork(); // fork() - кладёт задачу в локальную очередь и тут же возвращается, даёт возможность "украсть" задачу
            RecursiveSum secondHalf = new RecursiveSum(middle + 1, to, numOfOperations, numOfThreads);
//            secondHalf.fork();

//            ForkJoinTask.invokeAll(firstHalf ,secondHalf); // invokeAll() сам 'форкает' правильно эти задачи

            long secondValue = secondHalf.compute();
            return firstHalf.join() + secondValue;
            /*
             * join() - "ждать, пока задача закончится", даёт возможность занять поток ещё чем-нибудь
             * Магия начинается здесь!
             * Можно сделать одно из следующих действий:
             * 1. выполнить эту join-нящуюся задачу, на которой только что fork()-нулись
             * 2. найти в очереди задачу и выполнить (операция дороже, чем просто "заджойнится" на head-е очереди;
             *    поэтому, если fork() и join() делаем руками, то лучше "джойнится" в обратном порядке,
             *    т.к. это делается ("джойнимся") на самой последней fork()-нутой задаче)
             * 3. пойти в чужую очередь и "украсть" задачу
             * 4. ...
             * 5. заблокироваться
             */
//            return secondHalf.join() + firstHalf.join();
        }
    }
}
