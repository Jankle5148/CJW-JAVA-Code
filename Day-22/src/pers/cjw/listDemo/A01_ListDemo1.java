package pers.cjw.listDemo;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {

        //List：
        //（1）有序：先存a后存b，那么list中a一定在b前面.
        //（2）可重复：可以存多个a
        //（3）有索引：每个元素有自己的索引

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        method1(list);
        method2(list);
        method3(list);
        method4(list);

    }

    private static void method4(List<String> list) {
        //get(int index):返回索引index处的元素
        String s = list.get(0);
        System.out.println(s);
    }

    private static void method3(List<String> list) {
        //set(int index,E element)：修改指定索引处的元素，并返回被修改的元素
        String result = list.set(0, "qqq");
        System.out.println(result);
        System.out.println(list);
    }

    private static void method2(List<String> list) {
        //remove(int index)：删除指定索引处的元素，返回被删除的元素
        //在List集合中有两个删除的方法
        //第一个 删除指定的元素,返回值表示当前元素是否删除成功。
        //第二个 删除指定索引的元素,返回值表示实际删除的元素。
        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }

    private static void method1(List<String> list) {
        //add(int index,E element)	在此集合中的指定位置插入指定的元素，之后的元素依次后挪。
        list.add(0, "qqq");
        System.out.println(list);
    }
}
