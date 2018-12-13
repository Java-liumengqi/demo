package com.mq.bean;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-21 09:31
 * @lastdate: 2018/11/21
 */
public class Hold {

    public Holder holder;

    public void initialize(){
        holder = new Holder(42);
        holder.assertSanity();
        System.out.println(holder);
    }
}
