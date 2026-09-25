package pers.cjw.streamDemo.a01mystream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {

        // 创建集合添加元素，完成以下需求：
        // 1.把所有以“张”开头的元素存储到新集合中
        // 2.把其中“张”开头的，长度为3的元素再存储到新集合中。
        // 3.遍历打印最终结果。
        // 这样非常麻烦，如果说筛选条件一多，是不是要创建超多集合？

        //所以使用 流（stream）进行处理，将集合中的元素放在流上进行操作。
        //对流的操作，不会影响原集合，并且对流操作有非常多现成方法。

        //流就像一个工厂的流水线，需要对流水线上的产品进行非常多的操作，才会得到我们想要的东西。
        //其中包括中间方法（之后还可用其他方法）和终结方法（最后一个方法）。

        // 1.创建集合。
        ArrayList<String> list1 = new ArrayList<>();

        // 2.添加元素元素
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        // 首先使用.stream()方法，获取这个集合的流，（将集合中的元素放在流上，对流操作，不会影响原数组或集合）
        // 对这个流使用过滤方法.filter()，过滤出"张"姓，
        // 对这个流使用过滤方法.filter()，过滤出长度为3的名字，
        // 再使用.forEach将其遍历打印。
        // 使用链式编程。
        list1.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

    }
}
