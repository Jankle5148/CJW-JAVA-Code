package pers.cjw.API.jdk7.simpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {

        //假设，你初恋的出生年月日为:2000-11-11
        //请用字符串表示这个数据，并将其转换为:2000年11月11日

        //1.原生日字符串
        String str = "2000-11-11";

        //2.通过原格式，将原生日字符串解析为对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);

        //3.再通过新格式，把对象格式化成新格式字符串。
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);

        //4.打印新生日
        System.out.println(result);


    }

}
