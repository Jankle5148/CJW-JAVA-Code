package pers.cjw.regexAPI;

public class RegexDemo14 {
    public static void main(String[] args) {

        //(?i) ：表示忽略后面数据的大小写

        //忽略abc的大小写
        String regex = "(?i)abc";

        //a需要一模一样，忽略bc的大小写
        regex = "a(?i)bc";

        //ac需要一模一样，忽略b的大小写
        regex = "a((?i)b)c";
    }
}
