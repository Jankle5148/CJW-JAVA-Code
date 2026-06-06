package pers.cjw.streamDemo.a01mystream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {

        // 双列集合：因为它不是单列集合，无法直接获取stream流。
        // 如果是双列集合想要使用流，
        // （1）要么只获取它的单列集合的流
        // （2）要么将其“视为”键值对的单列集合才能使用流。

        //1.创建双列集合，添加数据。
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);

        //2.第一种获取stream流：只获取 键 的单列集合的流，依次打印每一个键。
        //hm.keySet().stream().forEach(s -> System.out.println(s));

        //2.第二种获取stream流：获取 键值对 的单列集合的流，依次打印每一个键值对。
        hm.entrySet().stream().forEach(s -> System.out.println(s));

    }
}
