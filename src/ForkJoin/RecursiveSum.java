package ForkJoin;

import java.util.concurrent.RecursiveTask;

public class RecursiveSum extends RecursiveTask<Long> {
    /**
     * Начало диаппазона для суммирования
     */
    private final long from;
    /**
     * Конец диаппазона суммирования
     */
    private final long to;
    /**
     * Ширина (предел) дробления задачи
     */
    private final long threshold;

    /**
     * Конструктор с параметрами для объекта задачи суммирования
     * @param from - начало диаппазона для суммирования
     * @param to - конец диаппазона суммирования
     * @param threshold - ширина (предел) дробления задачи
     */
    public RecursiveSum(long from, long to, long threshold) {
        this.from = from;
        this.to = to;
        this.threshold = threshold;
    }

    /**
     * Метод выполняющий основную логику задачи суммирования
     * @return результат суммирования (тип long)
     */
    @Override
    protected Long compute() {
        /* Сравниваем заданный диаппазон задачи с необходимой шириной (пределом) дробления,
         * если проверяемый диаппазон меньше ширины, то выполняем суммирование,
         * в противном случае мы разделяем (дробим) нашу задачу (наш диаппазон) на 2 подзадачи.
         * И так до тех пор, пока не получим достаточное количество более мелких задач.
         * Далее, рассчитывается сумма в каждой подзадаче и происходит 'склеивание' рассчётов в окончательный результат
         */
        if((to - from) <= threshold) {
            long sum = 0L;
            for (long i = from; i < to; i++) {
                sum += i;
            }
            return sum;
        } else {
            long middle = (to + from) / 2; // Определяем середину заданного диаппазона текущей задачи
            RecursiveSum firstHalf = new RecursiveSum(from, middle, threshold); // Создаём первую подзадачу
            firstHalf.fork(); // fork() - кладёт задачу в локальную очередь и тут же возвращается, даёт возможность "украсть" задачу
            RecursiveSum secondHalf = new RecursiveSum(middle + 1, to, threshold); // Создаём вторую подзадачу
            long secondValue = secondHalf.compute();
            return firstHalf.join() + secondValue; // 'Склеиваем' два решения и возвращаем результат суммирования

//            ForkJoinTask.invokeAll(firstHalf ,secondHalf); // invokeAll() сам 'форкает' правильно эти задачи
//            secondHalf.fork();
//            return secondHalf.join() + firstHalf.join();
        }
    }
}





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
