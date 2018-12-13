package mq;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-12-04 17:17
 * @lastdate: 2018/12/4
 */
public class TestArray {
    public static void main(String[] args) {
//        printArray();
//        printILoveYou();
//        copyArray();
//        operateArray();
//        charArray();
//        functionOperation();
//        lookupArray();
        lookupPrimeNumber();
    }

    /**
     * 打印数组
     */
    public static void printArray() {
        String[] a = new String[]{"A", "B", "C"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 打印我爱你
     */
    public static void printILoveYou() {
        String[] a = new String[]{"我", "爱", "你"};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    /**
     * copy数组
     */
    public static void copyArray() {
        int[] a = new int[]{1, 3, 4, 3, 2, 3, 2, 5, 6, 9};
        System.out.println("a数组的值：");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("b数组的值：");
        int[] b = Arrays.copyOf(a, 10);
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.print(b[i]);
        }
    }

    /**
     * 数组函数操作
     */
    public static void functionOperation() {
        Scanner g = new Scanner(System.in);
        int sum = 0;
        int[] grade = new int[8];
        for (int i = 0; i < grade.length; i++) {
            System.out.println("请输入学生的分数：");
            grade[i] = g.nextInt();
            sum += grade[i]; // 和 sum = grade[i] + sum;一样
        }
        System.out.println("平均值 = " + sum / 8);
        int max = grade[0];
        int min = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (grade[i] > max) {
                max = grade[i];
            } else {
                min = grade[i];
            }
        }
        System.out.println("最大的分数是：" + max + "，最小的分数是：" + min);
    }

    /**
     * 操作数组
     */
    public static void operateArray() {
        String[] name = new String[]{"张三", "李四", "王二", "麻子", "小红"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }

    /**
     * char数组
     */
    public static void charArray() {
        char[] a = new char[]{'我', '爱', '你'};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    /**
     * 查询数组数据
     */
    public static void lookupArray() {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("请输入" + num.length + "个数，然后回车：");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("请输入想要匹配的数字：");
        int pipei = sc.nextInt();
        int result = Arrays.binarySearch(num, pipei);
        if (result == -1) {
            System.out.println("没有匹配到你想要的数字");
        } else {
            System.out.println("index = " + result);
        }
    }

    /**
     * 查找素数
     */
    public static void lookupPrimeNumber(){
        for (int i = 3; i < 10000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber){
                System.out.println(i);
            }
        }
    }
}
