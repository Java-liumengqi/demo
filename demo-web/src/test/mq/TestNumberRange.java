package mq;

import com.mq.bean.NumberRange;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-21 11:51
 * @lastdate: 2018/11/21
 */
public class TestNumberRange {

    public static void main(String[] args) {
        NumberRange numberRange = new NumberRange();
//        CountDownLatch countDownLatch = new CountDownLatch(2);
        try {
            new Thread(()->{
                numberRange.setUpper(4);
            }).start();
            Thread.sleep(1000);
            new Thread(()->{
                numberRange.setLower(5);
            }).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
