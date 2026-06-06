package pers.cjw.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {

        //Map集合的第一种遍历方式，只遍历 键 的单列集合,然后通过键来找值。
        //三个课堂练习：
        //练习一：利用键找值的方式遍历map集合，要求：对 键的单列集合 使用 增强for 的形式进行遍历，并打印键值对
        //练习二：利用键找值的方式遍历map集合，要求：对 键的单列集合 使用 迭代器 的形式进行遍历，并打印键值对
        //练习三：利用键找值的方式遍历map集合，要求：对 键的单列集合 使用 lambda表达式 的形式进行遍历，并打印键值对

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //3.通过 键 找 值：先得到键，再得到值，然后一起打印。
        //map 类的 keySet 方法，可以返回该 map的 键的单列集合
        Set<String> keys = map.keySet();
        //遍历这个单列集合，可以得到每一个键。

        //--------------------------------------------------------------------------------------------------------------
        //（1）使用增强for遍历 键的单列集合，再通过每个key打印每个键值对。
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //--------------------------------------------------------------------------------------------------------------
        //（2）使用迭代器，遍历键的单列集合，再通过每个key打印每个键值对。
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //--------------------------------------------------------------------------------------------------------------
        //（3）Lambda表达式：调用集合的forEach方法，其中传参为实现了Consumer接口的匿名内部类对象。
        //底层原理：forEach方法会用一个普通for来遍历集合，依次得到每一个元素。把得到的每一个元素，交给一个叫accept的方法。
        //因为我们得到的 键的类型 为string，所以将接口Consumer的泛型定为string，这样在方法的传参处也会替换为string类型传参。
        //之后我们重写accept方法体，使得 string类型参数key 传进 accept方法 后会，会计算值，然后一起打印。

        //先写匿名内部类
        //keys.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String key) {
        //        String value = map.get(key);
        //        System.out.println(key + " = " + value);
        //    }
        //});

        //因为它是函数类接口，先将其简化为lambda表达式，然后再进行简化。
        keys.forEach(key -> {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        });

    }
}
