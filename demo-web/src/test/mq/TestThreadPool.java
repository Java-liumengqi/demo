package mq;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-10 14:59
 * @lastdate: 2018/12/10
 */
public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

    }
}
