package pers.cjw.streamDemo.a01mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        //数组的流：
        // 使用Arrays工具类中的静态方法：stream(T[] array)获取。

        //1.创建两个数组。
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr2 = {"a", "b", "c"};

        //2.使用Arrays工具类中的静态方法：stream(T[] array)获取该数组的流，传参为该数组。
        // 分别获取stream流，然后打印。
        Arrays.stream(arr1).forEach(s -> System.out.println(s));
        Arrays.stream(arr2).forEach(s -> System.out.println(s));

    }
}
