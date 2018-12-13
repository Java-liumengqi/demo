package mq;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-24 13:59
 * @lastdate: 2018/11/24
 */
public class TestDao {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        System.out.println(list.size());
    }
}
