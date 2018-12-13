package mq;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-07 16:18
 * @lastdate: 2018/12/7
 */
public class TestAtomicInteger {

    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(0);
        for (int i = 0; i <= 999; i++) {
            new Thread(() -> {
                number.incrementAndGet();
            }).start();
        }

        //线程未执行完，主线程让出CPU资源
        /*while(Thread.activeCount() > 1){
            Thread.yield();
        }*/

        //待上面的线程都执行完了，再打印，避免打印的不是最后的数据
        System.out.println(Thread.activeCount());
        System.out.println(number.intValue());
    }
}
