package pers.cjw.API.objectsDemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {

        //Objects类是Object的工具类，类似于integer是int的工具类
        //Objects类所在包是在java.util，因此在使用的时候会自动导包。

        //三个学生对象
        Student s1 = new Student("ZhangSan", 23);
        Student s2 = new Student("ZhangSan", 23);
        Student s3 = null;

        //可以发现：s3根本没有new，而是一个null，说明根本没有这个对象，这个s3只是个名字
        //此时拿一个不存在的东西去调用equals，会报错

        //所以为了代码健壮性，在比较前，我们要判断这个对象是不是空，如果他不是空，才去调用它的equals和别的对象比较
        if (s1 != null) {
            boolean result = s1.equals(s2);
            System.out.println(result);
        } else {
            System.out.println("调用者为空");
        }

        //这样做很麻烦。
        //于是Objects类作为Object的工具类，它的equals的方法，就是简化了上面的流程
        //源码：
        //return (a == b) || (a != null && a.equals(b));
        //如果a不是null，调用a的equals方法。相同返回true，不相同返回false
        //如果a是null，看b是不是null，b是null返回true，不是null返回false

        boolean result = Objects.equals(s1, s3);
        System.out.println(result);

        //==============================================================================================================
        //如果只想判断对象是否为null呢？

        //public static boolean isNull(Object obj)
        //判断对象是否为null，是null返回true，不是null返回false

        //public static boolean nonNull(Object obj)
        //判断对象是否不为null，不是null返回true，是null返回false

        // 创建一个学生对象
        Student s4 = new Student("ZhangSan", 23);

        // 调用Objects类中的isNull方法和nonNull方法
        boolean result2 = Objects.isNull(s4);
        boolean result3 = Objects.nonNull(s4);

        // 输出结果
        System.out.println(result2);
        System.out.println(result3);


    }

}
