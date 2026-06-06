package pers.cjw.functionDemo.a01myfunction;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {

        //例子：创建一个数组，并进行倒序排列
        Integer[] arr = {3, 5, 4, 1, 6, 2};

        //常见思路：使用arrays的sort方法，然后传入一个Comparator匿名内部类，重写compare方法来规定排序为倒序。
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //再简化为lambda表达式
        //Arrays.sort(arr, (o1, o2)->o2 - o1 );

        //--------------------------------------------------------------------------------------------------------------

        // 什么是方法引用？
        // 把已经有的方法拿过来用，当作函数式接口中抽象方法的方法体。

        // 满足四个条件：
        // 1.引用的地方，需要是一个函数式 接口，比如说sort方法的第二个参数是一个Comparator函数式接口，我们要在这引用一个方法。
        // 2.被引用的方法需要已经存在（定义），比如我们在此类定义这个要引用的方法subtraction，或者是java已有的方法。
        // 3.被引用方法的形参和返回值，需要跟抽象方法的形参和返回值保持一致（格式一致），比如subtraction和compare方法形参和返回值保持一致。
        // 4.被引用方法的功能需要满足当前的要求，比如我就要返回两个数的差值（后-前），subtraction刚好可以满足。

        // 引用FunctionDemo1类里面的subtraction方法，写做FunctionDemo1::subtraction
        // 把这个方法当做抽象方法的方法体。
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
        //这相当于lambda表达式的再一步简化。

    }

    //可以是Java已经写好的，也可以是一些第三方的工具类。
    //这个的好处是，如果一个匿名内部类的lambda表达式是如下格式，则这个方法可以多次复用。
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }

}
