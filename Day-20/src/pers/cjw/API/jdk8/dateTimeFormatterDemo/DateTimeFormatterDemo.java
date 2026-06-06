package pers.cjw.API.jdk8.dateTimeFormatterDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

        //DateTimeFormatter类：用于时间的格式化和解析
        //与jdk7中的SimpleDateFormat类相似。

        //static DateTimeFormatter ofPattern(格式) 获取格式对象
        //String format(时间对象) 按照指定方式格式化

        //1.获取时间对象，此处获得一个上海的标准时间
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //2.DateTimeFormatter 的 ofPattern 方法返回一个解析/格式化器对象（并且可以指定格式）
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm;ss EE a");

        //3.利用格式化器对象将时间对象格式化，让时间按固定格式输出
        String str = dtf1.format(time);
        System.out.println(str);

    }
}
