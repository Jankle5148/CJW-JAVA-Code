package pers.cjw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("aaa");
        list3.add("bbb");
        list3.add("ccc");
        list3.add("ddd");

        //遍历:get获取元素，而不像数组直接用索引下标
        System.out.print("[");
        for (int i = 0; i < list3.size(); ++i) {
            if (i == list3.size() - 1) {
                System.out.print(list3.get(i));
            } else {
                System.out.print(list3.get(i) + ",");
            }
        }
        System.out.print("]");
        //当然这个结果和直接sout（list）是同一结果
    }
}
