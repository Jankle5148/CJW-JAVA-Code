package pers.cjw.streamDemo.a01mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {

        // collect(Collector collector)收集方法：
        // 收集流中的数据，放到集合中 (List Set Map)
        // 注意：如果我们要收集到Map集合当中，键是不能重复的，否则会报错

        //1.定义集合，添加元素。元素为字符串，格式为姓名-性别-年龄
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");


        //需求1：把所有的男性收集到一个List集合中。
        List<String> newList1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))//过滤出男性的元素
                .collect(Collectors.toList());//收集到一个list集合里，然后用一个集合进行接收。
        System.out.println(newList1);


        //需求2：把所有的男性收集到一个Set集合中。
        Set<String> newList2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))//过滤出男性的元素
                .collect(Collectors.toSet());//收集到一个set集合里，然后用一个集合进行接收。
        System.out.println(newList2);


        //需求3：把所有的男性收集到Map集合当中（map必须有键 有值）
        //谁作为键，谁作为值？
        //键：姓名。 值：年龄.
        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))//过滤出男性的元素

                // toMap有两个传参：
                // 参数一：键的生成规则
                // 参数二：值的生成规则
                //------------------------------------------------------------------------------------------------------
                // 参数一：键的生成规则。
                // 需要传入Function的匿名内部类，其中要指定两个泛型
                //（1）泛型一：流中数据的类型
                //（2）泛型二：Map集合中，键 的数据类型

                // 重写apply方法。
                // 形参：流里面的每一个数据
                // 方法体：根据数据，生成键。
                // 返回值：生成好的键。
                //------------------------------------------------------------------------------------------------------
                // 参数二：值的生成规则。
                // 需要传入Function的匿名内部类，其中要指定两个泛型
                //（1）泛型一：流中数据的类型
                //（2）泛型二：Map集合中，值 的数据类型

                // 重写apply方法。
                // 形参：流里面的每一个数据
                // 方法体：根据数据，生成值。
                // 返回值：生成好的值。

                .collect(Collectors.toMap(new Function<String, String>() {//参数1
                                              @Override
                                              public String apply(String s) {
                                                  //张无忌-男-15
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {//参数2
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));


        //方便的话，将其转换成lambda表达式
        //Map<String, Integer> map2 = list.stream()
        //        .filter(s -> "男".equals(s.split("-")[1]))
        //        .collect(Collectors.toMap(
        //                s -> s.split("-")[0],
        //                s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(map);


    }
}
