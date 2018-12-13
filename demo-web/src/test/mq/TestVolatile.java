package mq;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-07 15:48
 * @lastdate: 2018/12/7
 */
public class TestVolatile {

    public static void main(String[] args) {
        AtomicBoolean stop = new AtomicBoolean(false);

        new Thread(() -> {
            while (!stop.get()){
                System.out.println(Thread.currentThread().getName() + "在执行。。。");
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                stop.set(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
