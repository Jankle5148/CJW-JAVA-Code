package pers.cjw.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {

        //Set集合概述和特点;
        //（1）无序：先存a后存b，也不知道ab在数组中的顺序。
        //（2）不重复：只能存1个a
        //（3）无索引：每个元素没有索引

        //利用Set系列的集合，添加字符串，并使用多种方式遍历。
        //1.迭代器
        //2.增强for
        //3.Lambda表达式

        //==============================================================================================================
        //1.创建一个Set集合的对象（HashSet是Set接口的实现类。创建一个HashSet对象，多态给普通set接口接收了）
        Set<String> s = new HashSet<>();

        //2,添加元素。
        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次添加，那么一定添加失败，返回false（因为不可重复）
        System.out.println(s.add("张三"));//true
        System.out.println(s.add("张三"));//false
        System.out.println(s.add("李四"));//true
        System.out.println(s.add("王五"));//true

        //3.打印集合
        //（1）直接打印：是无序打印
        System.out.println(s);//[李四, 张三, 王五]

        //（2）迭代器遍历：一个专门遍历string数据的迭代器，由string数据的iterator()方法得到
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //（3）增强for遍历，因为无索引
        for (String str : s) {
            System.out.println(str);
        }

        //（4）Lambda表达式：调用set集合的forEach方法，其中传参为实现了Consumer接口的匿名内部类对象。
        //底层原理：forEach方法会用一个 普通for 来遍历集合，依次得到每一个元素。把得到的每一个元素，交给一个叫accept的方法。
        //因为我们得到的元素为string，所以将接口Consumer的泛型定为string，这样在方法的传参处也会替换为string类型传参。
        //之后我们重写accept方法体，使得 string类型参数str 传进 accept方法 后会进行打印。

        //先写匿名内部类
        //s.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String str) {
        //        System.out.println(str);
        //    }
        //});

        //因为它是函数类接口，先将其简化为lambda表达式，然后再进行简化。
        s.forEach(str -> System.out.println(str));
    }
}
