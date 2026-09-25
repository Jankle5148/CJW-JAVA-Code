package pers.cjw.API.jdk8.zoneDateTimeDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {

        //ZoneDateTime：带时区的时间类

        //ZonedDateTime now() 获取当前时间的ZonedDateTime对象
        //ZonedDateTime ofXXX() 获取指定时间的ZonedDateTime对象
        //ZonedDateTime withXxx(时间) 修改时间系列的方法
        //ZonedDateTime minusXxx(时间) 减少时间系列的方法
        //ZonedDateTime plusXxx(时间) 增加时间系列的方法

        //1.获取当前时间对象(带时区)，比如我们在东八区，那他会自动生成东八区的标准时间
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //==============================================================================================================
        //2.获取指定的时间对象(带时区)：指定年月日时分秒纳秒，还有时区
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        //==============================================================================================================
        //3.先分别指定Instant 和 时区，通过这两个东西再获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);//先指定时间戳
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");//再指定时区
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);//根据时间戳和时区，得到带时区的时间
        System.out.println(time2);

        //==============================================================================================================
        //3.withXxx 修改时间，
        //withYear：修改年份，以此类推
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);

        //==============================================================================================================
        //4. 减少时间，minus：零下、负、减
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        //5.增加时间，plus：加
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);

        //jdk8中的时间对象都是不可变的。
        //看似上面的方法都是在原对象上进行了修改，实则都是创建了一个新的修改后的对象，所以我们要定义一个变量去接收。

    }
}
