package pers.cjw.API.jdk8.localDateDemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {
    public static void main(String[] args) {

        //LocalDate类：本地时间类，包含 年 月 日

        //1.获取当前时间的日历对象(包含 年/月/日)
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期:" + nowDate);//今天的日期:2024-10-31

        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println("指定日期:" + ldDate);//指定日期:2023-01-01

        //==============================================================================================================
        //3.get系列方法获取日历中的每一个属性值

        // 获取年
        int year = ldDate.getYear();
        System.out.println("year: " + year);

        //获取月
        // （1）方式一:
        Month m = ldDate.getMonth();//得到月
        //可以直接打印m，也可以获取m的值再打印，打印的是对应月份的英文
        System.out.println("month: " + m);//JANUARY
        System.out.println("month: " + m.getValue());//JANUARY
        //（2）方式二:
        int month = ldDate.getMonthValue();//得到月对应的值1-12
        System.out.println("month: " + month);//1

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day:" + day);

        //获取一年的第几天
        int dayOfYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayOfYear);

        //获取星期几
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        //==============================================================================================================
        //is开头的方法表示判断，与之前同理
        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));

        //with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);

        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(1);
        System.out.println(plusLocalDate);

        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);

        //==============================================================================================================
        // 判断今天是否是你的生日：比较日月，如果日月相同，则为生日。
        LocalDate birDate = LocalDate.of(2000, 1, 1);
        LocalDate nowDate1 = LocalDate.now();

        //MonthDay是一个专门存储”几月几日“的对象。
        //先获取生日中的日月，创建MonthDay对象
        //再获取当日中的日月，创建MonthDay对象
        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        //比较两个日月是否相同，相同则为生日
        System.out.println("今天是你的生日吗? " + birMd.equals(nowMd));//今天是你的生日吗?
    }
}
