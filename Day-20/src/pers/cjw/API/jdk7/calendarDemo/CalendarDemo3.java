package pers.cjw.API.jdk7.calendarDemo;

import java.util.Calendar;

public class CalendarDemo3 {
    public static void main(String[] args) {

        //计算当前日期200天以后是哪年哪月哪日，星期几？

        // 1.获取当前日历
        Calendar c = Calendar.getInstance();

        //2.将日DAY_OF_MONTH + 200
        c.add(Calendar.DAY_OF_MONTH, 200);

        //3.加完后，再获取年月日
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH) + 1;//转换为实际的月份
        int d = c.get(Calendar.DAY_OF_MONTH);

        //4.获取星期的值，根据星期的值判断是星期几
        int wk = c.get(Calendar.DAY_OF_WEEK);

        //5.将年月日和星期几进行打印
        System.out.println("200天后是：" + y + "年" + m + "月" + d + "日，" + getWeek(wk));


    }

    //查表法，查询星期几
    public static String getWeek(int w) {
        //w = 1到7，但是索引为0-6，所以进行w-1
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return weekArray[w - 1];
    }
}
