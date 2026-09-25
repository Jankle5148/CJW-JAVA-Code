package pers.cjw.streamDemo.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {

        //filter     过滤出（不是过滤掉）。
        //limit(n)   获取前n个元素。
        //skip(n)    跳过前n个元素。

        //注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程(方法一个接一个用）
        //注意2：修改 Stream流中 的数据，不会影响原来集合或者数组中的数据。

        //1.创建集合，添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //2.filter()过滤 : 传参为 Predicate函数接口 的匿名内部类。并且重写test方法。
        //如果test返回值为true，表示当前数据留下。如果test返回值为false，表示当前数据不要。
        //list.stream().filter(new Predicate<String>() {
        //    @Override
        //    public boolean test(String s) {
        //        return s.startsWith("张");
        //        //如果姓张，s.startsWith("张")为true，test方法返回true，于是此元素留下。
        //        //如果不姓张，s.startsWith("张")为false，test方法返回false，于是此元素不要。
        //    }
        //}).forEach(s -> System.out.println(s));//过滤后进行打印。

        //简化成lambda表达式。然后使用链式编程如法炮制，多次过滤。最后进行打印。
        list.stream()
                .filter(s -> s.startsWith("张"))//过滤出姓张的
                .filter(s -> s.length() == 3)//过滤出三个字的
                .forEach(s -> System.out.println(s));//打印

        //--------------------------------------------------------------------------------------------------------------

        //limit(n)   获取前n个元素。
        //skip(n)    跳过前n个元素。

        System.out.println(list);//"张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
        //（1）获得前3个元素，进行打印。
        list.stream().limit(3).forEach(s -> System.out.println(s));//"张无忌", "周芷若", "赵敏"。
        //（2）跳过前4个元素，进行打印。
        list.stream().skip(4).forEach(s -> System.out.println(s));//"张三丰", "张翠山", "张良", "王二麻子", "谢广坤"。

        //--------------------------------------------------------------------------------------------------------------
        //课堂练习：获取"张强", "张三丰", "张翠山"
        //第一种思路：
        //（1）先limit前面6个元素：得到"张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山",
        //（2）然后skip前面3个元素：得到"张强", "张三丰", "张翠山"。
        list.stream().limit(6).skip(3).forEach(s -> System.out.println(s));

        //第二种思路：
        //（1）先skip前面3个元素：得到"张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
        //（2）然后再limit前面3个元素：得到"张强", "张三丰", "张翠山"
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));

    }
}
