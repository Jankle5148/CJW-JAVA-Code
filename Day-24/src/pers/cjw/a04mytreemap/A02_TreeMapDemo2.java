package pers.cjw.a04mytreemap;

import java.util.TreeMap;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {

        //TreeMap集合：基本应用
        //键：学生对象。值：籍贯
        //要求：按照学生 年龄 的升序排列，如果年龄一样，按照姓名的字母排列，如果同姓名，同年龄视为同一个人。

        //此次采用正常创建map，然后在类中重写“自然排序”来进行排序。
        //详见本包student类。

        //1.创建集合。
        TreeMap<Student, String> tm = new TreeMap<>();

        //2.创建三个学生对象。
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        //3.添加元素（键值对：学生/籍贯）。
        tm.put(s1, "江苏");
        tm.put(s2, "天津");
        tm.put(s3, "北京");

        //4.打印集合。
        System.out.println(tm);


    }
}
