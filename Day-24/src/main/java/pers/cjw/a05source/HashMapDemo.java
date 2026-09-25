package pers.cjw.a05source;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap的底层原理（面试题）
        HashMap<String, Integer> hashMap = new HashMap<>();

        //底层原理：哈希表：数组（顺序表）+链表+红黑树

        hashMap.put("aaa", 111);
        hashMap.put("bbb", 222);
        hashMap.put("ccc", 333);
        hashMap.put("ddd", 444);
        hashMap.put("eee", 555);

        System.out.println(hashMap);


    }
}
