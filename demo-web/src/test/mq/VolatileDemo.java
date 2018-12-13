package mq;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-07 16:24
 * @lastdate: 2018/12/7
 */
public class VolatileDemo {
    private AtomicInteger number = new AtomicInteger(0);

    public void increase() {
        number.incrementAndGet();
    }

    public int getNumber() {
        return number.intValue();
    }

    public static void main(String[] args) {
        final VolatileDemo demo = new VolatileDemo();

        for (int i = 0; i <= 999; i++) {
            new Thread(() -> {
                demo.increase();
            }).start();
        }

        //线程未执行完，主线程让出CPU资源
        /*while(Thread.activeCount() > 1){
            Thread.yield();
        }*/

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //待上面的线程都执行完了，再打印，避免打印的不是最后的数据
        System.out.println(Thread.activeCount());
        System.out.println(demo.getNumber());
    }
}
