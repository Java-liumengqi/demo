package mq;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-07 14:31
 * @lastdate: 2018/12/7
 */
public class TestCyclicBarrier {
    public static void main(String[] args) {
        int num = 10;
        CyclicBarrier barrier = new CyclicBarrier(num, () -> {
            System.out.println("go on together!");
        });
        for (int i = 1; i <= num; i++) {
            new Thread(new CyclicBarrierWorker(i, barrier)).start();
        }
    }
}

class CyclicBarrierWorker implements Runnable {
    private int id;
    private CyclicBarrier barrier;

    public CyclicBarrierWorker(int id, final CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(id + " the people wait");
            barrier.await(); // 大家等待最后一个线程到达
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
