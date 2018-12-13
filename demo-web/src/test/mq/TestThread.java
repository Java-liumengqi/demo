package mq;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-04 20:26
 * @lastdate: 2018/12/4
 */
public class TestThread{

    private static Integer count = 100;

    public static void main(String[] args) {
//        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " count = " + count--);
            }).start();
        }
    }
}
