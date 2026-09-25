package pers.cjw.ArrayListClass.student;

import java.util.ArrayList;

public class ArrayListStudent1 {
    public static void main(String[] args) {
        //往集合里存学生对象，学生的属性有姓名，年龄。
        ArrayList<Student> student = new ArrayList<>();
        Student student1 = new Student("cjw", 24);
        Student student2 = new Student("cht", 15);
        Student student3 = new Student("cjh", 11);

        student.add(student1);
        student.add(student2);
        student.add(student3);

        //如果直接打印集合会怎样，因为结合里都是对象，所以打印出来都是对象的地址值
        //要得到具体信息，还是一个一个遍历。
        for (int i = 0; i < student.size(); ++i) {
            System.out.println("第" + (i + 1) + "个学生的姓名是" + student.get(i).getName() + "，年龄是" + student.get(i).getAge() + "岁");
        }
    }
}
