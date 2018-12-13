package mq;

import java.io.File;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-07 14:53
 * @lastdate: 2018/12/7
 */
public class TestIO {

    public static void main(String[] args) {
        char ch;
        File path = new File("subDir");
        if(path.mkdir()){
            System.out.println("successful");
        }
    }
}
