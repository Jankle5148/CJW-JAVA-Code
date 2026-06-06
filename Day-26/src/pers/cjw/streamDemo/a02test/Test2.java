package pers.cjw.streamDemo.a02test;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        // 练习：创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        // "zhangSan,23"  "lisi,24"  "wangWu,25"
        // 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值

        //1.创建一个ArrayList集合,添加元素。
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangSan,23");
        list.add("lisi,24");
        list.add("wangWu,25");

        //2.保留年龄大于等于24岁的人
        //list.stream()
        //        .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)//过滤出年龄>=24的人
        //        .collect(Collectors.toMap(new Function<String, String>() {//将其收集到一个map集合里，键：名字string，值：年龄integer
        //            @Override
        //            public String apply(String s) {
        //                return s.split(",")[0];
        //            }
        //        }, new Function<String, Integer>() {
        //            @Override
        //            public Integer apply(String s) {
        //                return Integer.parseInt(s.split(",")[1]);
        //            }
        //        }));

        //转换成lambda表达式即可。
        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);

    }
}
