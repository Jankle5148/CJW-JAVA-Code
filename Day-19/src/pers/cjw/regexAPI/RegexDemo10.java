package pers.cjw.regexAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {

        //贪婪爬取:在爬取数据的时候尽可能获取长的数据
        //非贪婪爬取:在爬取数据的时候尽可能获取短的数据

        //如果只写+或*，表示贪婪匹配
        //如果在+或者*后面跟上?，则是非贪婪匹配

        //ab+:
        //贪婪爬取:abbbbbbbbbbbb，符合ab+的最长数据
        //非贪婪爬取:ab，符合ab+的最短数据

        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //贪婪爬取
        String regex = "ab+";//a出现1次，b至少出现1次的贪婪爬取，即abbbbbbbbbbbb
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

        //非贪婪爬取
        regex = "ab+?";//a出现1次，b至少出现1次的非贪婪爬取，即ab
        p = Pattern.compile(regex);
        m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
