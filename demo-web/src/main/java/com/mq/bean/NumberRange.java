package com.mq.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-21 11:45
 * @lastdate: 2018/11/21
 */
public class NumberRange {
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger upper = new AtomicInteger(0);

    private static List<String> TEST_LIST = Collections.synchronizedList(new ArrayList<String>());


    public void setLower(int n){
        if(n > upper.get()){
            throw new IllegalArgumentException("参数太大");
        }
        lower.set(n);
        System.out.println("lower = " + lower.get());
    }

    public void setUpper(int n){
        if(n < lower.get()){
            throw new IllegalArgumentException("参数太小");
        }
        upper.set(n);
        System.out.println("upper" + upper.get());
    }

}
