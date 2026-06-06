package pers.cjw.API.jdk7.dateDemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        //Date对象的构造：有一个成员变量fastTime，表示距离“时间原点”的毫秒值。

        System.out.println(new Date());
        //无参构造public Date()：返回当前构造函数中调用了System.currentTimeMillis()给成员变量fastTime;
        //所以fastTime就是 当前时刻 距离“时间原点”的毫秒值。
        //构造函数会将毫秒值fastTime“转换”为现在的时间Date对象。
        //计算Date为自1970年1月1日00:00:00 GMT以来向后计算经过了fastTime的时间，也就是现在。
        //所以Date对象就是此刻的Date，即Tue Oct 29 22:02:24 GMT+08:00 2024
        //（为什么能直接输出出来，因为Date类中有重写过的toString）

        System.out.println(new Date(0L));
        //有参构造public Date(long date)：：返回指定时刻，构造函数中将传参date赋值给成员变量fastTime。
        //fastTime为0，所以1970年1月1日00:00:00 GMT以来向后计算了0毫秒的时间。
        //所以Date对象就是Thu Jan 01 08:00:00 GMT+08:00 1970（Date类中有重写过的toString）

        //==============================================================================================================
        //创建日期对象
        Date d = new Date();

        //date的get和set方法，实际上get和set的不是当前时间，而是fastTime
        System.out.println(d.getTime());//得到fastTime
        d.setTime(0L);//设置fastTime
        System.out.println(d.getTime());//得到fastTime

    }
}
