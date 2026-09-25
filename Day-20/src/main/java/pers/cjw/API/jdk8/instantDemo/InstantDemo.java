package pers.cjw.API.jdk8.instantDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {

        //Instant类：时间戳

        //Instant now() 获取当前时间的Instant对象(标准时间)
        //Instant ofXXX(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
        //ZonedDateTime atZone(ZoneId zone) 指定时区
        //boolean isXXX(Instant otherInstant) 判断系列的方法
        //Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        //Instant plusXxx(long millisToSubtract) 增加时间系列的方法

        //==============================================================================================================
        //1.获取当前时间的Instant对象(这个now指的是标准时间，也就是英国那个时间)
        Instant now = Instant.now();
        System.out.println(now);

        //==============================================================================================================
        //2.根据(秒/毫秒/纳秒)获取Instant对象
        //根据毫秒获取。
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);//1970-01-01T00:00:00Z，时间原点上添加1毫秒
        //根据秒获取。
        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);//1970-01-01T00:00:01Z，时间原点上添加1秒

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);//先在时间原点上添加1秒，再向后调整1000000000纳秒，即1秒，总共增加了两秒。
        // 所以时间是1970-01-01T00:00:02Z，两个传参：第一个就像粗准焦螺旋，第二个就像细准焦螺旋

        //==============================================================================================================
        //3. 指定时区，返回一个时区时间对象。
        // Instant.now()是标准时间，在这个标准下，我们用atZone指定id为Asia/Shanghai时区，得到该时区时间。
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //==============================================================================================================
        //4.isXXX 判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        //用于时间的判断
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面,即instant4是否在instant5之前。
        //语句的英文语序也对的上，相当于instant4 is Before instant5？很好记。
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);//true

        //isAfter:判断调用者代表的时间是否在参数表示时间的后面，即instant4是否在instant5之后。
        //这个语句的英文语序也对的上，相当于instant4 is After instant5？很好记。
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //==============================================================================================================
        //5.Instant minusXxx(long millisToSubtract)：减少时间
        //先定义一个时间
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        //minus：零下，负，所以相当于减多少秒/毫秒/纳秒
        Instant instant7 = instant6.minusSeconds(1);//instant6减一秒
        System.out.println(instant7);//1970-01-01T00:00:02Z
    }
}
