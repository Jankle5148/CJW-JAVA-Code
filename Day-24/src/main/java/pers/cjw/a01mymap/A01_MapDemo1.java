package pers.cjw.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {

        // Map集合接口概述：interface Map<K,V>是一个泛型接口。
        // K和V为两个泛型。K：键的类型；V：值的类型
        // Map是一个接口，就意味着他有各种各样的实现类。比如 HashMap 和 TreeMap。

        // Map集合的特点：
        // （1）双列集合,一个键对应一个值
        // （2）键不可以重复,值可以重复（键是这个键值对的唯一标识）

        // map可以看作一个双列集合，也就是键是一列集合，值是一列集合。
        // 也可以把 键值对 看成整体，那么map就是 键值对 的 单列集合。

        //--------------------------------------------------------------------------------------------------------------
        //1.创建Map集合，键为string类型，值也为string类型
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("尹志平", "小龙女");

        //添加元素：使用 put 方法添加/覆盖，而不是 list 的 add 方法。
        //在添加数据的时候，如果键不存在，意味着可以加入。那么直接把键值对对象添加到map集合当中,方法返回null。
        //在添加数据的时候，如果键是存在的，意味着会覆盖那个键值对。那么会把原有的键值对对象覆盖，把被覆盖的值进行返回。
        String value2 = map.put("韦小宝", "双儿");
        System.out.println(value2);//因为"韦小宝"这个键已存在，所以添加新键值对 会覆盖 旧键值对，于是返回旧键值对的值“沐剑屏”

        //删除元素
        String result = map.remove("郭靖");//删除键为："郭靖"的键值对。
        System.out.println(result);//如果删除成功，则返回该键值对的值：“黄蓉”。

        //清空元素
        //map.clear();

        //判断map是否包含该键
        boolean keyResult = map.containsKey("郭靖");//是否存在一个键是"郭靖"
        System.out.println(keyResult);//因为刚刚已删除，所以集合中没有该键，所以返回false。

        //判断map是否包含该值
        boolean valueResult = map.containsValue("小龙女2");//是否存在一个值是"小龙女2"。
        System.out.println(valueResult);//没有，返回false。

        //判断map是否为空。
        boolean emptyResult = map.isEmpty();
        System.out.println(emptyResult);//不为空，返回false

        //返回map长度（键值对个数）
        int size = map.size();
        System.out.println(size);

        //3.打印集合
        System.out.println(map);

    }
}