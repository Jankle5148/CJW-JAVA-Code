package pers.cjw.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class A07_CollectionDemo7 {
    public static void main(String[] args) {

        //lambda表达式遍历：调用集合的forEach(Consumer<? super T> action):
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.调用集合的forEach方法，其中传参为实现了Consumer接口的匿名内部类对象。
        //底层原理：forEach方法会用一个普通for来遍历集合，依次得到每一个元素。把得到的每一个元素，交给一个叫accept的方法。
        //因为我们得到的元素为string，所以将接口Consumer的泛型定为string，这样在方法的传参处也会替换为string类型传参。
        //我们重写accept方法，使得参数传进accept方法后会进行打印。

        //先写匿名内部类
        //coll.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //        System.out.println(s);
        //    }
        //});

        //因为它是函数类接口，先将其简化为lambda表达式，然后再进行简化。
        coll.forEach(s -> System.out.println(s));

    }
}
