package pers.cjw.API;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //StringJoiner类，也可以看作容器，内容可变
        //当前市场很少有人用，但是他很简洁
        int[] arr = {1, 2, 3};
        StringJoiner sj = new StringJoiner(",", "[", "]");
        //指定容器内容之间的间隔符号delimiter,开始符号prefix，结束符号suffix，比如上面打出来的字符串就是【 ， ， ， ， ，】
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        sj.add("ddd").add("eee").add("fff");//也可以链式编程

        // 但是目前这个类的add方法只适合拼接字符串，不适合拼接int进去，像拼接StringBuilderDemo4中的数组就不行，得先转成字符或字符串
        for (int i = 0; i < arr.length; ++i) {
            sj.add(String.valueOf(arr[i]));//String.valueOf(arr[i]) int类型转成字符串
        }
        System.out.println(sj);//输出sj
        System.out.println(sj.length());//输出sj长度
        System.out.println(sj.toString());//输出真正的字符串
    }
}
