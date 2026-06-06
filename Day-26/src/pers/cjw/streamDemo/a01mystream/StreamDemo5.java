package pers.cjw.streamDemo.a01mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

        //另一种获取流的方法：Stream 接口中静态方法 of 方法。

        //所以现在有两种方法获取 数组 的流：
        //（1）使用工具类 Arrays 的 stream()方法 获取数组的流。
        //（2）向 Stream接口 的静态方法 of() 传参一个数组来获取此数组的流。
        //数组无法像集合一样，直接调用集合的stream()方法获取流。

        //of()方法的传参是一个可变参数。既可以传递零散数据，也可以传递数组。
        //传递零散数据，可以是一堆基本数据，也可以是一堆引用数据。
        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));
        Stream.of("a", "b", "c", "d", "e").forEach(s -> System.out.println(s));

        //用英文就很好理解了：stream of...(...的流)
        //--------------------------------------------------------------------------------------------------------------
        //但是如果of()方法要传递数组，必须是 引用数据类型 。
        //如果是基本数据类型，of()方法会把整个数组当做一个元素，放到Stream流当中。

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream.of(arr1).forEach(s -> System.out.println(s));
        //比如这个arr1是int数组，于是当成一个“元素”传入。
        //打印的是这个“元素”，但因为这个元素是个数组，无法打印，所以打印地址。

    }
}
