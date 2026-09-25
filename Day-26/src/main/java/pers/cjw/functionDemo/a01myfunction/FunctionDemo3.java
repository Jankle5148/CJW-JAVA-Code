package pers.cjw.functionDemo.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {

        // 方法引用（引用成员方法）
        // 成员方法并不是直接和类绑定，而是和类的对象绑定，所以必须要先有类的对象，才能通过这个对象调用此成员方法。
        // 引用格式：
        // （1）其他类：其他类的对象::方法名
        // （2）本类：this::方法名(引用处不能是静态方法，比如我们在main方法中引用这个方法，)
        // （3）父类：super::方法名(引用处不能是静态方法)

        // --------------------------------------------------------------------------------------------------------------
        // 需求：集合中有一些名字，按照要求过滤数据（只要以张开头，而且名字是3个字的）
        // 数据："张无忌","周芷若","赵敏","张强","张三丰"

        //1.创建集合，添加数据。
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        //2.过滤数据（只要以张开头，而且名字是3个字的）
        //list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));

        // 上面的过滤用了两次filter。如果想一次性过滤：
        // 则只用一个filter，然后传入一个Predicate匿名内部类，重写test方法即可，
        // 方法体中，根据条件返回是否留下该数据的boolean数据。
        // list.stream().filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String s) {
        //         return s.startsWith("张") && s.length() == 3;//如果符合要求，返回true留下，否则返回false过滤。
        //     }
        // }).forEach(s -> System.out.println(s));

        // 现在将其改为方法引用。
        // （1）如果调用的其他类方法，比如本包有个类 StringOperation ，它的 stringJudge 方，法跟上面的test方法一样。
        // 格式：其他类对象::方法名
        list.stream().filter(new StringOperation()::stringJudge)
                .forEach(s -> System.out.println(s));

        // （2）如果调用本类的 stringJudge 方法。静态方法中是没有this的。
        list.stream().filter(new FunctionDemo3()::stringJudge)
                .forEach(s -> System.out.println(s));

    }


    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
