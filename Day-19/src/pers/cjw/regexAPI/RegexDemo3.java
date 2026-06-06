package pers.cjw.regexAPI;

public class RegexDemo3 {
    public static void main(String[] args) {

        String str = "had";

        //1.正则表达式regex：不是小写辅音字符a、e、i、o、u开头，并且后跟ad
        String regex = "[a-z&&[^aeiou]]ad";
        //判断str是否满足正则表达式regex
        System.out.println("1." + str.matches(regex));

        //2.要求字符串是a、e、i、o、u中的某个字符开头，并且后跟ad后跟ad
        regex = "[aeiou]ad";
        //判断str是否满足正则表达式regex
        System.out.println("2." + str.matches(regex));

        //==============================================================================================================

        //\表示转义字符
        //以字符串的形式，单独打印一个双引号。
        //\":前面的转义字符\，把后面的双引号"变成了一个普普通通的字符"。
        System.out.println("\"");
        //如果不转义：System.out.println(""");会报错

        //为什么通常打印路径时打上\\
        //两个\的理解方式：前面的转义字符\，改变了后面\原本的含义，把后面\变成一个普普通通的字符\
        System.out.println("c:Users\\moon\\IdeaProjects\\basic-code\\myapi\\src\\com\\itheima\\a08regexdemo\\RegexDemo1.java");
        //打印效果：c:Users\moon\IdeaProjects\basic-code\myapi\src\com\itheima\a08regexdemo\RegexDemo1.java

    }
}
