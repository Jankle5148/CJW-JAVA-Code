package pers.cjw.collectionDemo;

import java.util.ArrayList;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {

        //增强for遍历：其内部原理是一个Iterator迭代器
        //实现 Iterable接口 的类，才可以使用 迭代器 和 增强for
        //数组、所有的单列结合才可以用增强for

        //增强for可以显著简化数组和Collection集合的遍历。
        //并且因为底层是迭代器，所以相比普通for，它可以无需索引。

        //1.定义集合，添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        //增强for遍历集合并打印：格式：小括号内：（类型 别名：集合或数组）
        for (String str : list) {
            System.out.println(str);
        }

        //增强for：集合或数组名.for
        //普通for：循环次数.fori

    }
}
