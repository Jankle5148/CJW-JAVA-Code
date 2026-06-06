package pers.cjw.streamDemo.a02test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        //定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
        //过滤奇数，只留下偶数。并将结果保存起来。

        //1. 定义一个集合。添加一些整数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //2.过滤奇数，只留下偶数
        // 思路：filter中的test方法要让偶数返回true，奇数返回false，于是使用取余即可。
        //list.stream().filter(new Predicate<Integer>() {
        //    @Override
        //    public boolean test(Integer n) {
        //        return n % 2 == 0;
        //        //如果n是奇数，返回false，不要。
        //        //如果n是偶数，返回true，要。
        //    }
        //}).forEach(s -> System.out.println(s));

        //转换成lambda表达式，并打印集合
        List<Integer> newList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}