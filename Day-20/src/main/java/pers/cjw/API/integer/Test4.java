package pers.cjw.API.integer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {

    public static void main(String[] args) throws ParseException {
        //用JDK7和JDK8两种方式，计算你活了多少天

        method1();//jdk7
        method2();//jdk8
    }

    private static void method2() {
        //JDK8

        //1.定义两个LocalDate对象，保存出生年月日，和当前年月日。
        LocalDate ld1 = LocalDate.of(2000, 1, 1);
        LocalDate ld2 = LocalDate.now();

        //2.不用计算毫秒值，直接ChronoUnit计算 between 在 ld1 和 ld2 的天数
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }

    private static void method1() throws ParseException {
        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值

        //（1）定义生日字符串
        String birthday = "2000年1月1日";
        //（2）定义格式化器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //（3）因为字符串满足格式，所以转换为date对象
        Date date = sdf.parse(birthday);
        //（4）获取出生日期的毫秒值
        long birthdayTime = date.getTime();
        //（5）获取当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //（6）计算毫秒值差值，再转换为天数
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);
    }

}
