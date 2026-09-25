package pers.cjw.streamDemo.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        //单列集合，可以获取流。
        //如果不重写stream方法，则会默认使用Collection接口中的默认方法 default Stream<E> stream()

        //1.定义集合，批量添加元素。
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        //Stream<E> stream()判断出集合中的元素是字符串，于是将的泛型E指定为字符串。

        //2.单列集合获取Stream流，然后对每个元素进行打印
        list.stream().forEach(s -> System.out.println(s));

    }
}







