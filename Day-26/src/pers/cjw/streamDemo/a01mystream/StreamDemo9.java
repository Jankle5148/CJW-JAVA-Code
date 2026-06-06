package pers.cjw.streamDemo.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {

        // void forEach(Consumer action)    遍历
        // long count()                     统计
        // toArray()                        收集流中的数据，放到数组中

        // 1.定义集合，添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");


        // 2.使用forEach(Consumer action)  遍历，原理已经很熟悉了。详见A02_MapDemo2类。
        //list.stream().forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //        System.out.println(s);
        //    }
        //});
        // 写成lambda表达式
        list.stream().forEach(s -> System.out.println(s));


        // 3.使用count() 进行流中元素个数的统计
        long count = list.stream().count();
        System.out.println(count);


        // 4.使用toArray()  收集流中的数据，放到数组中。
        //（1）如果采用默认的 toArray() 方法，用object数组接收。
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));

        //（2）如果要让流中的数据 用 同类型的数组 接收。
        // 那么在toArray方法传入IntFunction匿名内部类，并指定其泛型为 具体类型的数组。
        // apply()的形参: 流中数据的个数。
        // apply()的返回值：返回一个该类型的，长度=个数 的数组

        // 接下来toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到这个数组当中。
        // toArray方法的返回值：是一个装着流里面所有数据的数组，且 数组类型 和 元素类型 一样。
        String[] arr2 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        // 如果方便，再将其转换为写成lambda表达式。
        //String[] arr = list.stream().toArray(value -> new String[value]);

        System.out.println(Arrays.toString(arr2));

    }
}
