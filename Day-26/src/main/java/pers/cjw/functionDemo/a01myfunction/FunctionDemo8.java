package pers.cjw.functionDemo.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDemo8 {
    public static void main(String[] args) {

        //需求：创建集合添加学生对象
        //学生对象属性：name，age

        //要求：
        //（1）获取姓名并放到数组当中
        //（2）使用“方法引用”完成

        //技巧：
        //1.判断现在是否有一个方法符合我当前的需求
        //2.如果有这样的方法，这个方法是否满足引用的规则。

        //静态   类名：：方法名
        //成员方法
        //构造方法  类名：：new


        //1.创建student集合
        ArrayList<Student> list = new ArrayList<>();

        //2.添加学生
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        //3.获取他们的姓名并放到数组当中
        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        //这里用了方法引用，因为本身student类就有返回名字的方法getName，所以引用即可，引用时遵循引用格式（类名：：方法名）


        //本身获取名字应该是这样的
        /* String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);*/

        //4.打印数组，发现打印的都是名字
        System.out.println(Arrays.toString(arr));


    }
}
