package pers.cjw.streamDemo.a02test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        //现在有两个ArrayList集合，分别存储 6名男演员的名字和年龄 以及 6名女演员的名字和年龄。
        //姓名和年龄中间用逗号隔开。比如：张三,23
        //完成如下的操作：
        //1，要：男演员，名字为3个字的前两人。
        //2，要：女演员，姓杨的，不要第一个。
        //3，把过滤后的男演员姓名和女演员信息合并到一起.
        //4，将上一步的演员信息封装成Actor对象。
        //5，将所有的演员对象都保存到List集合中。
        //备注：演员类Actor，属性有：name，age

        //1.创建两个ArrayList集合，一男一女，添加数据
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();
        Collections.addAll(manList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womenList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");


        //2.要：男演员，名字为3个字的前两人。
        Stream<String> stream1 = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        //3.要：女演员，姓杨的，不要第一个。
        Stream<String> stream2 = womenList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);


        //4.把过滤后的男演员姓名和女演员信息合并到一起：使用concat方法，将stream1和stream2合并。
        //然后演员信息封装成Actor对象：使用map方法，将 String -> Actor对象 （类型转换）
        //重写apply方法，然后 concat方法 和 map方法 使用链式编程。

        //(1)合并信息，使用concat方法
        //Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
        //    @Override
        //    public Actor apply(String s) {
        //        String name = s.split(",")[0];//（1）以"-"对字符串进行分割得到数组，取数组第1个元素就是名字。
        //        int age = Integer.parseInt(s.split(",")[1]);//（2）取数组第2个元素就是年龄，转换成int。
        //        return new Actor(name, age);//（3）根据name和age有参构造与1个actor对象返回到流里。
        //    }
        //}).forEach(s -> System.out.println(s));

        //（2）转换成lambda表达式后，使用map方法，将 String -> Actor对象 （类型转换），最后装进一个新list里面。
        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
