package pers.cjw.regexAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {

        //有如下文本，按要求爬取数据。
        //Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
        //因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台

        //需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
        //需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        //需求3:爬取除了版本号为8，11.17的Java文本，

        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //==============================================================================================================

        //需求1:不区分大小写的java，并且版本号为8，11，17，但是结果只返回java
        String regex1 = "((?i)Java)(?=8|11|17)";
        //?=是一个正向前查找（lookahead），它用于确认后面跟着的内容，但不将!不将！这些内容包括在匹配结果中。

        //获取Pattern对象，Matcher对象，进行匹配，循环打印结果
        System.out.println("-----------1-------------");
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

        //==============================================================================================================
        //需求2:不区分大小写的java，并且版本号为8，11，17
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        //?:是一个非捕获组（non-capturing group），用于将多个选项组合在一起，但不将其作为单独的匹配结果捕获。

        //获取Pattern对象，Matcher对象，进行匹配，循环打印结果
        System.out.println("-----------2-------------");
        p = Pattern.compile(regex2);
        m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

        //==============================================================================================================
        //需求3:不区分大小写的java，但是版本号不能是8，11，17
        String regex4 = "((?i)Java)(?!8|11|17)";
        //?!是一个负向前查找（negative lookahead），用于确认后面不跟随特定的内容。

        //获取Pattern对象，Matcher对象，进行匹配，循环打印结果
        System.out.println("-----------3-------------");
        p = Pattern.compile(regex4);
        m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
