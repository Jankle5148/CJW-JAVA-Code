package pers.cjw.API.jdk8.localDateTimeDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        //LocalDateTime：相当于LocalDate 和 LocalTime 的结合：存年月日时分秒

        // 当前时间的的日历对象(包含年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天是:" + nowDateTime);//今天是：

        //==============================================================================================================
        //get方法
        System.out.println(nowDateTime.getYear());//年
        System.out.println(nowDateTime.getMonthValue());//月，值为1-12
        System.out.println(nowDateTime.getDayOfMonth());//日，值为1-31
        System.out.println(nowDateTime.getHour());//时
        System.out.println(nowDateTime.getMinute());//分
        System.out.println(nowDateTime.getSecond());//秒
        System.out.println(nowDateTime.getNano());//纳秒

        // getDayOfYear:获得当年的第几天，而不是1-31日
        System.out.println("dayOfYear:" + nowDateTime.getDayOfYear());

        //getDayOfWeek：星期几，返回星期几的英文
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());

        //getMonth：几月份，返回月份的英文
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        //==============================================================================================================

        //将 LocalDateTime 对象转换为 LocalDate 对象，相当于忽略时分秒
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        //将 LocalDateTime 对象转换为 LocalTime 对象，相当于忽略年月日
        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

    }
}
