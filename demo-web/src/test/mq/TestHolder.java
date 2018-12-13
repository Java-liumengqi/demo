package mq;

import com.mq.bean.Hold;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-21 09:28
 * @lastdate: 2018/11/21
 */
public class TestHolder {

    public static void main(String[] args) {
        Hold hold = new Hold();
        CountDownLatch c = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                c.countDown();
                hold.initialize();
            }).start();
        }
    }
}
