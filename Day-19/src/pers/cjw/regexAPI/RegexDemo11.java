package pers.cjw.regexAPI;

public class RegexDemo11 {
    public static void main(String[] args) {

        //有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
        //要求1:把字符串中三个姓名之间的所有字母替换为vs
        //要求2:把字符串中的三个姓名切割出来

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";

        //要求1：用replaceAll：替换所有满足要求的的子串，返回替换后的字符串
        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);

        //要求2: 用split：遇到传参中的字符串，就切割一次，返回一个切割后的字符串数组
        String[] split = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < split.length; ++i) {
            System.out.println(split[i]);
        }

    }
}
