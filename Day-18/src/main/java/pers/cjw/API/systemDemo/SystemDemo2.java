package pers.cjw.API.systemDemo;

public class SystemDemo2 {

    public static void main(String[] args) {
        //计算1~100000之间有多少个质数。
        //用两种方法，分别输出计算所用时间，看哪个方法更快。

        long start1 = System.currentTimeMillis();//记录方法1开始时间。
        for (int i = 1; i <= 100000; i++) {//使用方法1计算。
            boolean flag = isPrime1(i);
            if (flag) {
                System.out.println(i);
            }
        }
        long end1 = System.currentTimeMillis();//计算方法1结束时间
        System.out.println("方法1的总时间为：" + (end1 - start1) + "毫秒");//获取方法1运行的总时间.


        long start2 = System.currentTimeMillis();//记录方法2开始时间。
        for (int i = 1; i <= 100000; i++) {//使用方法2计算。
            boolean flag = isPrime2(i);
            if (flag) {
                System.out.println(i);
            }
        }
        long end2 = System.currentTimeMillis();//计算方法2结束时间
        System.out.println("方法2的总时间为：" + (end2 - start2) + "毫秒");//获取方法2运行的总时间.

    }

    //方法1：判断是否为质数的方式
    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //方法2：判断是否为质数的方式（效率高）
    public static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
