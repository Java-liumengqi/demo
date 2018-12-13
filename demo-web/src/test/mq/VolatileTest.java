package mq;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-07 17:37
 * @lastdate: 2018/12/7
 */
public class VolatileTest {

    public static volatile int race = 0;

    public static void increase(){
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    increase();
                }
            });
            threads[i].start();
        }
        //等待所有的累加都结束了
        while (Thread.activeCount() > 2)
//            Thread.currentThread().getThreadGroup().list();
            Thread.yield();

        System.out.println(race);
    }
}
