package mq;

import java.util.concurrent.Semaphore;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-01 18:19
 * @lastdate: 2018/12/1
 */
public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("线程" + Thread.currentThread().getName() + "执行中");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
                System.out.println("线程" + Thread.currentThread().getName() + "执行完毕");
            }, "thread" + i).start();
        }
    }
}
