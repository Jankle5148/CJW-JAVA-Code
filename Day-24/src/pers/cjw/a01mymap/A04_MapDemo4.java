package pers.cjw.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {

        //Map集合的第三种遍历方式：用一种特殊的 Consumer接口：BiConsumer 接口，来实现Lambda表达式遍历 键值对。

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素/键：人物的名字值：名人名言
        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色行事");

        //3.利用lambda表达式进行遍历，其中传参为实现了 BiConsumer 接口的匿名内部类对象。
        //底层：forEach其实就是利用 增强for 进行遍历，但在增强for代码中，还直接得到了每个键值对的键和值。
        //再将其传入accept方法，我们重写accept方法，将传进来的 key 和 value 进行打印。
        //先写匿名内部类。
        //map.forEach(new BiConsumer<String, String>() {
        //    @Override
        //    public void accept(String key, String value) {
        //        System.out.println(key + "=" + value);
        //    }
        //});

        //因为它是函数类接口，先将其简化为lambda表达式，然后再进行简化。
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        //相比于 A02_MapDemo2 和 A03_MapDemo3 的lambda表达式简单一些。


    }
}
