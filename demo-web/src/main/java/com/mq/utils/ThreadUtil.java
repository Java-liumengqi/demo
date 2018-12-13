package com.mq.utils;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-20 20:27
 * @lastdate: 2018/11/20
 */
public class ThreadUtil {

    public static ThreadLocal<String> local = new ThreadLocal<String>(){
        @Override
        public String get() {
            return "local";
        }
    };
}
