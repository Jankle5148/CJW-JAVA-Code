package pers.cjw.API.integer;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {

        //判断任意的一个年份是闰年还是平年
        //要求:用JDK7和JDK8两种方式判断
        //提示：二月有29天的、一年有366天的是闰年

        //思路：把时间设置为该年的3月1日，将其减1天，如果是28号就是平年，29号就是闰年

        System.out.println(2000 + "年" + method1(2000));//jdk7
        System.out.println(2001 + "年" + method2(2001));//jdk8
    }

    private static String method2(int year) {
        //jdk8：月份的范围:1~12

        //1.设定时间为该年的3月1日
        LocalDate ld = LocalDate.of(year, 3, 1);

        //2.把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);

        //3.获取这一天是一个月中的几号
        int day = ld2.getDayOfMonth();

        //4.判断
        if (day == 28) {
            return "是平年";
        } else if (day == 29) {
            return "是闰年";
        }
        return "";

    }

    private static String method1(int year) {
        //jdk7：月份的范围:0~11，month值为2，代表3月

        //1.获取一个日历对象，并进行设置为该年的3月1号
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);//月份的范围:0~11，month值为2，代表3月

        //2.日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);

        //3.看当前的时间是28号还是29号?
        int day = c.get(Calendar.DAY_OF_MONTH);

        //4.判断
        if (day == 28) {
            return "是平年";
        } else if (day == 29) {
            return "是闰年";
        }
        return "";
    }

}
