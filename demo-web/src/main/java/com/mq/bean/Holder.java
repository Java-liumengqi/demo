package com.mq.bean;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-21 09:29
 * @lastdate: 2018/11/21
 */
public class Holder {

    private int n;

    public Holder(int n) {
        try {
            Thread.sleep(100);
            this.n = n;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void assertSanity(){
        if(n != n){
            throw new AssertionError("false");
        }
    }
}
