package pers.cjw.ArrayListClass.student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent2 {
    public static void main(String[] args) {
        //定义一个集合，添加学生对象，对象数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list2 = new ArrayList<>();

        //假设添加3个学生
        for (int i = 0; i < 3; ++i) {
            Student s = new Student();
            System.out.print("请输入学生姓名：");
            s.setName(sc.next());
            System.out.print("请输入学生年龄：");
            s.setAge(sc.nextInt());
            list2.add(s);
        }
        for (int i = 0; i < list2.size(); ++i) {
            System.out.println("第" + (i + 1)
                    + "个学生的姓名是" + list2.get(i).getName()
                    + "，年龄是" + list2.get(i).getAge() + "岁");
        }
    }
}
