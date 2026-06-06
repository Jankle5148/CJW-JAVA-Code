package pers.cjw.regexAPI;

public class RegexDemo13 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";

        //需求:把 重复的内容 替换为 单个的
        //学学 变成 学
        //编编编编 变成 编
        //程程程程程程 变成 程

        //  (.)：第一个字符看做一组
        //  \\1+表示第一组再次出现1次或多次
        //组合起来，就是(.)\1+，代表一个字符连续出现至少一次

        //  $1 同样是第一组的内容,但因为是在正则表达式之外引用，所以用一个dollar符号
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
