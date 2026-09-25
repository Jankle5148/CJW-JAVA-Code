package pers.cjw.API.jdk7.dateDemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {

        method1();
        method2();

    }

    private static void method2() {

        //比较两个随机生成的时间，谁前谁后
        //1.创建两个date对象，传参随机，并abs保证为非负数
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        //2.获取毫秒值time
        long t1 = d1.getTime();
        long t2 = d2.getTime();

        //3.比较两个time，time大的在后
        if (t1 < t2) {
            System.out.println("d1的毫秒值为" + t1 + "，d2的毫秒值为" + t2 + ",d1在前，d2在后。");
        } else if (t1 > t2) {
            System.out.println("d1的毫秒值为" + t1 + "，d2的毫秒值为" + t2 + ",d2在前，d1在后。");
        } else {
            System.out.println("d1的毫秒值为" + t1 + "，d2的毫秒值为" + t2 + ",d1和d2时间一样。");
        }

    }

    private static void method1() {

        //打印 时间原点 后一年的时间
        //（1）定义一个Date对象，并确保它表示时间原点
        Date d = new Date(0L);

        //（2）得到对象的fastTime，并在此基础上添加一年（添加的时间也是long类型，记得写L）
        long time = d.getTime() + 365 * 24 * 60 * 60 * 1000L;

        //（3）设置为新时间
        d.setTime(time);

        //（4）打印
        System.out.println(d);
    }
}
