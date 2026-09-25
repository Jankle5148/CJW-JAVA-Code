package pers.cjw.API.lambda;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {

        //函数式接口：接口内有且仅有一个抽象方法。
        //比如：Comparator就是一个函数式接口。compare()是Comparator接口中唯一的抽象方法。

        //之前学匿名内部类：
        //如果传参是接口的实现类对象，我们会使用匿名内部类，对吧。
        //现在，如果这个接口是一个函数式接口，也就是这个接口内只有一个抽象方法（函数）。
        //我们甚至可以更加简化，直接连匿名内部类那层皮都不写了，直接传入一个“匿名函数”，也就是Lambda表达式就行。

        //这是函数式编程的一种思想。
        //面向对象编程：先找个对象，再让对象去实现，重在有对象。（匿名内部类，要new一个匿名内部类对象，然后再重写方法）
        //函数式编程：不管是哪个对象，有人实现就行，重在实现。（Lambda表达式直接重写方法传入）
        //函数式编程，忽略面向对象编程的复杂语法，强调实现，而不是谁实现。

        //Lambda表达式格式：
        //( 方法传参 ) -> { 方法体 }

        //所以对于函数式接口Comparator的匿名内部类来说：
        //new Comparator<Integer>() {
        //    @Override
        //    public int compare(Integer o1, Integer o2) {
        //        return o1 - o2;
        //    }
        //}
        //可以简化为“直接实现接口内的函数”（有人实现就行）
        //(Integer o1, Integer o2) -> {return o1 - o2;}
        //这个函数没有名字。所以类比匿名内部类，它就像个“匿名函数”。


        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );
        System.out.println(Arrays.toString(arr));

        //书写过程：匿名内部类->Lambda表达式.

    }
}
