package mq;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-21 17:56
 * @lastdate: 2018/11/21
 */
public class TestHarness {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("开始执行了。。");
            }
        };
        try {
            System.out.println(timeTasks(5, thread));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static long timeTasks(int threads, final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(threads);

        for (int i = 0; i < threads; i++) {
            new Thread(() -> {
                try {
                    startGate.await();
                    try {
                        task.run();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        endGate.countDown();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        long startTime = System.currentTimeMillis();
        startGate.countDown();
        endGate.await();
        return System.currentTimeMillis() - startTime;
    }
}
