package pers.cjw.API;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //字符串的拼接，很重要！涉及到内存！结合stringDemo2看
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";

        String str1 = "aaa" + "bbb" + "ccc";
        //如果拼接是上面这种直接用多个可见的字符串拼接，那么拼接的过程发生在java文件编译成字节码文件class的过程中
        //相当于：在java文件中，此句为String str1="aaa"+"bbb"+"ccc";
        //在class文件中
        String str2 = s1 + s2 + s3;
        System.out.println(str2);
        //回顾字符串拼接，首先字符串不能修改，然后此时串池里有s1、s2、s3
        //1.s1和s2拼接成一个s1s2，此时串池里有s1、s2、s3、内容为s1s2的字符串，共4个
        //2.s1s2和s3拼接成一个s1s2s3，此时串池里有s1、s2、s3、内容为s1s2的字符串、内容为s1s2s3的字符串，共5个
        //这个拼接最后只需要那一个内容为s1s2s3的字符串赋值给str，其他无关字符串都非常冗余。
        //可以看到，如果要拼接的字符串非常非常多时，会造成非常多的内存浪费。

        //所以使用stringBuilder
        //stringBuilder类创建出来的对象可以看作一个“容器”。容器中的内容可变
        StringBuilder sb = new StringBuilder("陈俊文");
        //一开始只能无参或只传一个参。后面有拼接的时候，再用他的append方法加到里面去
        sb.append(6);//拼接整数
        sb.append('a');//拼接字符
        sb.append("哈哈哈");//拼接字符串
        //还有很多可以添加，详见append方法

        System.out.println(sb);
        System.out.println(sb.getClass());//class java.lang.StringBuilder
        //可以直接打印sb，不是地址值，而是sb里面的值。但不建议直接打印stringBuilder对象

        String str3 = sb.toString();
        System.out.println(str3);
        System.out.println(str3.getClass());//class java.lang.String
        //先转成拼接好的字符串，在打印。

        //虽然打印的结果一样，但是类型不同！！
    }
}
