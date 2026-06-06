package pers.cjw.API.jdk7.calendarDemo;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {

        //设置方法：set(int field,int value):
        //field为要设置的属性，value传入要设置的值

        //1.获取当前日历
        Calendar c = Calendar.getInstance();

        //2.设置Calendar，比如设置为1998年3月18日
        c.set(Calendar.YEAR, 1998);
        c.set(Calendar.MONTH, 3 - 1);//月份值为0-11，所以三月对应的值是2
        c.set(Calendar.DAY_OF_MONTH, 18);

        //3.Calendar已经设置好。于是此时来获取当前Calendar是星期几
        int w = c.get(Calendar.DAY_OF_WEEK);//星期值为1-7，1对应着星期天
        System.out.println("那天是：" + getWeek(w));


    }

    //查表法，查询星期几
    public static String getWeek(int w) {
        //w = 1到7
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return weekArray[w - 1];
    }
}
