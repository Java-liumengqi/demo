package mq;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.LockSupport;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-23 14:42
 * @lastdate: 2018/11/23
 */
public class TestPark extends AbstractQueuedSynchronizer {

    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("a");
            }
        };

        for (;;){
            thread.start();
            LockSupport.park();
        }
    }
}
