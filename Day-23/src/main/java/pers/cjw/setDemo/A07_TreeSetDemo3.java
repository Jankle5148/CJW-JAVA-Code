package pers.cjw.setDemo;

import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    public static void main(String[] args) {

        // 第二种排序方式：比较器排序。

        // 要求：存入四个字符串， “c”, “qwer", “ab” ,“dfsfdw”。
        // 先按照长度排序，如果一样长则按照首字母排序

        // 1.创建集合TreeSet
        // o1：当前要添加的元素
        // o2：已经在红黑树存在的元素
        // 比较器抓一个红黑树的元素作为传参o2。
        // 如果o1比o2短，o1排左边，让返回值为负数，恰好o1.length() - o2.length()为负数
        // 如果o1比o2长，o1排右边，让返回值为正数，恰好o1.length() - o2.length()为正数

        // 定义TreeSet时，先写匿名内部类作为传参，然后化成lambda表达式。
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            // 先按照长度排序，得到i
            int i = o1.length() - o2.length();

            // 如果一样长，i会等于0。则让i为按照首字母排序的返回值。
            // 如果不一样长，i不变。
            i = i == 0 ? o1.compareTo(o2) : i;

            // 总之无论长短、首字母，到这里就能确定i，从而确定o1的位置。
            return i;
        });

        // 2.添加元素
        ts.add("c");
        ts.add("qwer");
        ts.add("ab");
        ts.add("dfsfdw");

        //3.打印集合
        System.out.println(ts);


    }
}
