package pers.cjw.setDemo;

import java.util.TreeSet;

public class A06_TreeSetDemo2 {
    public static void main(String[] args) {

        //第一种排序：自然排序。

        //需求：创建TreeSet集合，并添加3个学生对象
        //学生对象属性：姓名，年龄。
        //要求：
        //（1）首先按照学生的年龄进行排序。
        //（2）如果同年龄 ，按照 姓名字母排列
        //（3）如果同姓名又同年龄，认为是同一个人，不加入。

        //1.TreeSet以TreeSet()定义：
        TreeSet<Student> ts = new TreeSet<>();
        //然后我们在类中重写student类的自然排序方法：年龄升序。详见student类

        //2.创建4个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);

        //3.添加元素，不按顺序，随意添加。
        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        ts.add(s4);

        //4.打印集合，会发现按照类的 自然排序 进行了打印。
        System.out.println(ts);


    }
}