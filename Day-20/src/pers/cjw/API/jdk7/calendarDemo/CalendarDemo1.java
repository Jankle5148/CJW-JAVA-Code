package pers.cjw.API.jdk7.calendarDemo;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {

        // Calendar日历类:可以进行日期运算。
        // 它是一个抽象类，不能创建对象，
        // 我们可以使用它的子类：java.util.GregorianCalendar类。

        //1.通过Calendar的静态方法getInstance()方法获取GregorianCalendar对象。
        // getInstance返回一个GregorianCalendar对象，赋给Calendar，相当于多态。
        //简单来说：就是获取当前日历c
        Calendar c = Calendar.getInstance();

        //2.打印c，会出来全类名，已经c中的各项属性值
        System.out.println(c);

        //3.获取日历c的单独属性：如年月日时分秒，星期几
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//Calendar的月份值是0-11，所以要+1
        int day = c.get(Calendar.DAY_OF_MONTH);

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        //4.返回值为1-7，1为星期日
        int week = c.get(Calendar.DAY_OF_WEEK);//返回值范围：1--7，分别表示："星期日","星期一","星期二",...,"星期六"

        //5.打印年月日时分秒，以及星期几
        System.out.println(year + "年" + month + "月" + day + "日" +
                hour + ":" + minute + ":" + second);
        System.out.println(getWeek(week));
    }

    //返回星期几
    private static String getWeek(int w) {
        //星期数组
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return weekArray[w - 1];//返回值为1，代表一周第一天，即星期日，但星期日索引为0，所以减1
    }
}
