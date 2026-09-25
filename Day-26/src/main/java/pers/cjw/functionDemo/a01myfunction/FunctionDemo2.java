package pers.cjw.functionDemo.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        // 方法引用（引用静态方法）
        // 引用静态方法时，不需要通过对象，而是直接通过类名引用。
        // 格式：类名::类的某个静态方法名
        // 目的：引用某个类的某个静态方法。

        //--------------------------------------------------------------------------------------------------------------
        // 需求：集合中有以下数字"1","2","3","4","5"，要求把他们都变成int类型

        // 1.创建集合，添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 2.把他们都变成int类型，
        // 先写成匿名内部类,内部类重写方法，返回string 的 int 数据。
        // list.stream().map(new Function<String, Integer>() {
        //     @Override
        //     public Integer apply(String s) {
        //         int i = Integer.parseInt(s);
        //         return i;
        //     }
        // }).forEach(s -> System.out.println(s));

        // 先将匿名内部类变成lambda表达式，再使用方法引用。
        // 1.方法需要已经存在。
        // 2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致。
        // 3.方法的功能需要把形参的字符串转换成整数。

        // 我们来看重写的这个方法
        // public Integer apply (String s){
        //     int i = Integer.parseInt(s);
        //     return i;
        // }
        // 这个方法相当于进string出int，
        // 刚好Integer类里的parseInt方法就是干这个的，所以直接引用Integer类的parseInt方法即可。
        // 即Integer::parseInt

        //所以重写如下。
        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));


    }
}
