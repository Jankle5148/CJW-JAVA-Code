package pers.cjw.setDemo;

import java.util.TreeSet;

public class A08_TreeSetDemo4 {
    public static void main(String[] args) {

        //需求：创建5个学生对象，类名为student2
        //属性：(姓名,年龄，语文成绩,数学成绩,英语成绩),
        //1.按照总分从高到低输出到控制台。
        //2.如果总分一样，按照语文成绩排。
        //3.如果语文一样，按照数学成绩排。
        //4.如果数学成绩一样，按照英语成绩排。
        //5.如果英文成绩一样，按照年龄排。
        //6.如果年龄一样，按照姓名的字母顺序排。
        //7.如果都一样，认为是同一个学生，不存。

        //第一种：自然排序
        //第二种：比较器排序
        //我们采用第一种排序方式：在student2类中实现Comparable<Student2>接口，并重写compareTo方法。

        //1.创建学生对象，传入名字、年龄、语文、数学、英语。
        Student2 s1 = new Student2("zhangsan", 23, 90, 99, 50);
        Student2 s2 = new Student2("lisi", 24, 90, 98, 50);
        Student2 s3 = new Student2("wangwu", 25, 95, 100, 30);
        Student2 s4 = new Student2("zhaoliu", 26, 60, 99, 70);
        Student2 s5 = new Student2("qianqi", 26, 70, 80, 70);

        //2.创建TreeSet集合。
        TreeSet<Student2> ts = new TreeSet<>();

        //3.添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //4.打印集合,并打印每个学生的总分。
        for (Student2 t : ts) {
            System.out.println(t);
            System.out.println("总分为:" + t.getSum());
        }

    }
}
