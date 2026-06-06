package pers.cjw.regexAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Pattern: 表示正则表达式
//Matcher: 文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。在大串中去找符合匹配规则的子串。

public class RegexDemo7 {
    public static void main(String[] args) {

        //利用正则表达式，进行本地数据的简易爬虫：
        //有如下文本，请按照要求爬取数据。
        //Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
        //因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
        //要求:爬出里面所有的JavaXX

        //1.确认文本
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，"
                + "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //2.获取 正则表达式 的对象(之前使用字符串存储正则表达式，现在使用Pattern对象）
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //Java+0到2位的任意数字

        //3.获取文本匹配器对象m，拿着m去读取str，找str中符合正则表达式p的子串
        Matcher m = p.matcher(str);

        //4.只要匹配器m找到任意了一个符合的子串，m.find方法就会返回true，表示find到了,进入循环。
        //同时底层会保存该子串的 起始索引 和 结束索引+1 ，并使用subString进行截取（包左不包右）
        while (m.find()) {
            System.out.println(m.group());//返回截取的子串
        }
        //直到找不到了，才退出循环。

    }

}
