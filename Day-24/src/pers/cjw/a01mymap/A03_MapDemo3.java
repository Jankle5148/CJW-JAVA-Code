package pers.cjw.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {

        //Map集合的第二种遍历方式：通过 键值对对象 进行遍历（也就是直接以键值对为单位，看成一个键值对的单列集合）
        //键值对类：Map.Entry<K , V>
        //三个课堂练习：
        //练习一：通过 键值对对象 进行遍历map集合，要求：对 键值对对象的单列集合 使用增强for的形式进行遍历和打印。
        //练习二：通过 键值对对象 进行遍历map集合，要求：对 键值对对象的单列集合 使用迭代器的形式进行遍历和打印。
        //练习三：通过 键值对对象 进行遍历map集合，要求：对 键值对对象的单列集合 使用lambda的形式进行遍历和打印。

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素：键：人物的外号。值：人物的名字
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");

        //3.Map集合的第二种遍历方式：通过 键值对对象 进行遍历
        //map 的 entrySet 方法，得到所有键值对对象，返回在一个 Set集合 entries 里面。
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //--------------------------------------------------------------------------------------------------------------
        //（1）增强 for 遍历 entries 这个集合，得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //entry 键值对对象的 getKey 方法，可以返回这个键值对的 键
            String key = entry.getKey();
            //entry 键值对对象的 getValue 方法，可以返回这个键值对的 值
            String value = entry.getValue();
            //打印即可
            System.out.println(key + "=" + value);
        }

        //--------------------------------------------------------------------------------------------------------------
        //（2）使用迭代器,得到 键值对集合 的迭代器，然后一个一个遍历。
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        //--------------------------------------------------------------------------------------------------------------
        //（3）Lambda表达式：调用集合的forEach方法，其中传参为实现了Consumer接口的匿名内部类对象。
        //底层原理：forEach方法会用一个普通for来遍历集合，依次得到每一个元素。把得到的每一个元素，交给一个叫accept的方法。
        //因为我们得到的 键值对的类型 为 Map.Entry<String, String> ，所以将接口Consumer的泛型定为 Map.Entry<String, String>。
        //这样在方法的传参处也会替换为Map.Entry<String, String>类型传参。
        //之后我们重写accept方法体，使得 Map.Entry<String, String>类型参数 entry 传进 accept方法 后，会得到键和值，然后一起打印。

        //先写匿名内部类
        //entries.forEach(new Consumer<Map.Entry<String, String>>() {
        //    @Override
        //    public void accept(Map.Entry<String, String> entry) {
        //        String key = entry.getKey();
        //        String value = entry.getValue();
        //        System.out.println(key + "=" + value);
        //    }
        //});

        //因为它是函数类接口，先将其简化为lambda表达式，然后再进行简化。
        entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        });

    }
}