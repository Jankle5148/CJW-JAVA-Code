package pers.cjw.API.lambda;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {

        //Lambda表达式完整格式可以继续简化，变成Lambda表达式的简写格式。
        //1.传参类型可省略。
        //2.如果传参只有一个，传参小括号可省略。
        //3.如果方法体只有一行，大括号、分号、return可省略，且必须同时省略。

        //==============================================================================================================
        //例题：将字符串数组以 字符串长度 升序进行排序（从小到大）
        String[] arr = {"a", "aaaa", "aaa", "aa"};

        //字符串短的长度小，字符串大的长度大，于是定义规则：
        //返回两字符串长度差值。
        //如果o1短，返回值为负，o1排前面。
        //如果o1长，返回值为正，o1排后面。

        //Arrays.sort(arr, new Comparator<String>() {
        //    @Override
        //    public int compare(String o1, String o2) {
        //        return o1.length() - o2.length();
        //    }
        //});

        //查看Comparator源码，发现接口前面有一个注解：@FunctionalInterface
        //说明他是函数式接口，所以接下来可以转化为 Lambda表达式的完整格式

        //Arrays.sort(arr, (String o1, String o2) -> {
        //            return o1.length() - o2.length();
        //        }
        //);

        //然后还可以继续简化，变成Lambda表达式的简写格式。
        //从Lambda表达式变成更简洁的Lambda表达式的简写格式：
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
