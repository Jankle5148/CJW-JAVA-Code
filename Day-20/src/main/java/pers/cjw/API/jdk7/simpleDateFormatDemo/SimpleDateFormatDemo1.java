package pers.cjw.API.jdk7.simpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //Tue Oct 29 22:02:24 GMT+08:00 2024
        //这种格式的时间看不太懂，不太符合阅读习惯。
        //于是有了SimpleDateFormat类，可以定义时间格式。

        //此类不仅能把符合这个格式的时间的字符串，变成一个Date对象。
        //也能把Date对象，以这个格式生成字符串。

        //simpleDateFormat() 默认格式
        //simpleDateFormat(String pattern) 指定格式
        //final string format(Date date) 格式化(日期对象 ->字符串)
        //Date parse(string source) 解析(字符串 ->日期对象)

        //==============================================================================================================
        //1.无参构造simpleDateFormat对象，时间格式就是默认格式。

        //format方法：Date对象，以SimpleDateFormat对象的格式，生成字符串
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        System.out.println(sdf1.format(d1));//1970/1/1 上午8:00

        //parse方法：符合SimpleDateFormat对象格式的字符串，解析为date对象
        String str1 = "2024/10/30 上午11:11";
        Date d2 = sdf1.parse(str1);
        System.out.println(d2.getTime());//1730257860000


        //==============================================================================================================
        //2.有参构造simpleDateFormat对象，传参为自定义格式的字符串。

        //format方法：Date对象，以SimpleDateFormat对象的格式，生成字符串
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date d3 = new Date(0L);
        System.out.println(sdf2.format(d3));//1970年01月01日08:00:00

        //parse方法：符合SimpleDateFormat对象格式的字符串，解析为date对象
        String str2 = "2024年10月30日11:11:11";
        Date d4 = sdf2.parse(str2);
        System.out.println(d4.getTime());//1730257871000


    }

}
