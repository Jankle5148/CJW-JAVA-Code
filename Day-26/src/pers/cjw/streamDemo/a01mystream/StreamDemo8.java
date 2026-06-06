package pers.cjw.streamDemo.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {

        //map(): 转换流中的数据类型。

        //1.定义集合，添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");
        //需求：只获取里面的年龄并进行打印，其中要将String->int

        //获取集合的流，然后进行操作。
        //map 方法传参为 Function 接口的匿名内部类。
        //Function接口有两个泛型，我们指定为 原类型String 和 新类型Integer。
        //重写apply方法。方法返回值为表示转换之后的数据，返回值类型为新数据类型。

        //list.stream().map(new Function<String, Integer>() {
        //    @Override
        //    public Integer apply(String s) {//apply的形参s：流里面的每一个元素（此处为list中的每一个字符串）
        //        String[] arr = s.split("-");//（1）以"-"对字符串进行分割，得到数组保存多段字符串。
        //        String ageString = arr[1];//（2）取数组第2个元素：年龄的字符串
        //        int age = Integer.parseInt(ageString);//（3）将其转换成整数并返回。
        //        return age;
        //    }
        //}).forEach(s -> System.out.println(s));//此时得到一个全是年龄整数的流，然后对这个流进行打印


        //简化为lambda表达式，并使用链式编程进行简化。
        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));

    }
}
