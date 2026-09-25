package pers.cjw.setDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {

        //TreeSet集合：
        //不重复、无索引、可将存入元素按规则进行排序。

        //怎么排序：
        //第一种：TreeSet以TreeSet()定义：
        //然后我们在类中重写该元素的自然排序方法，TreeSet就会根据其元素的自然排序进行排序。
        //为什么重写了还叫“自然方法”：因为他是重写在类中的的排序方法，就是默认在类里的自己的排序规则。student对象一进TreeSet就能自然排好。

        //第二种：TreeSet以TreeSet(Comparator comparator)定义 ：
        //然后我们使用匿名内部类或lambda表达式传入一个重写了比较器比较方法的对象。TreeSet就会根据传入的比较器对元素进行排序。
        //类不需要重写排序方法，而是引入外部力量比较器，强行将student对象排好。

        //自然排序相当于 自律 ，比较器排序相当于 他律 。
        //TreeSet相当于班级，元素相当于学生，comparator相当于整队老师。
        //到底是让学生自觉整队，还是让老师来整队，视情况而定。
        //但是如果两种排序同时存在，以谁为准？还是以第比较器为准，毕竟学生还是要听老师的嘛。

        //java一些数据类型已经写好了自然排序方法：
        //integer：数字大小升序
        //double：数字大小升序
        //string：ascii码数字排序。

        //==============================================================================================================
        //需求：利用TreeSet存储整数并进行排序

        //1.创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素
        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        //3.直接打印：treeSet将传入的元素进行自然排序，所以打印是有序的
        System.out.println(ts);

        //4.遍历集合，set的三种方法都可以用。
        //（1）使用迭代器
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }

        //--------------------------------------------------------------------------------------------------------------
        //（2）增强for
        for (int t : ts) {
            System.out.println(t);
        }

        //--------------------------------------------------------------------------------------------------------------
        //（3）Lambda表达式：调用treeSet集合的forEach方法，其中传参为实现了Consumer接口的匿名内部类对象。
        //底层原理：forEach方法会用一个 普通for 来遍历集合，依次得到每一个元素。把得到的每一个元素，交给一个叫accept的方法。
        //因为我们得到的元素为string，所以将接口Consumer的泛型定为string，这样在方法的传参处也会替换为string类型传参。
        //之后我们重写accept方法体，使得string类型参数str传进accept方法后会进行打印。

        //(1)先写匿名内部类
        //ts.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String str) {
        //        System.out.println(str);
        //    }
        //});

        //（2）因为它是函数类接口，先将匿名内部类简化为lambda表达式，然后再进行简化。
        ts.forEach(str -> System.out.println(str));

    }
}
