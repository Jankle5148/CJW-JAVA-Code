package pers.cjw.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        Student s1 = new Student("123456", "cjw", 24, "coast");
        Student s2 = new Student("654321", "cht", 15, "coast");
        Student s3 = new Student("135790", "cjh", 11, "coast");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        loop:
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.print("请输入您的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---------------1.添加学生---------------");
                    addStudent(studentList);
                    break;
                case 2:
                    System.out.println("---------------2.删除学生---------------");
                    deleteStudentById(studentList);
                    break;
                case 3:
                    System.out.println("---------------3.修改学生---------------");
                    updateStudent(studentList);
                    break;
                case 4:
                    System.out.println("---------------4.查询学生---------------");
                    searchStudent(studentList);
                    break;
                case 5:
                    System.out.println("-----------------5.退出----------------");
                    System.out.println("再见，祝您生活愉快！");
                    break loop;
                default:
                    System.out.println("--------------没有此选项--------------");
            }
        }
        //为什么case5的退出要写成break loop？
        //首先while和switch都可以用break来跳出，且规定switch中的每个case必须写break。
        //这就导致了，如果case5只写break，那么只是跳出了switch，并没有跳出while循环。
        //没有跳出while循环，那么他还会接着询问你的操作，达不到“退出”的目的。
        //真正的退出是退出while循环，让它不再询问你的操作。
        //所以在while前面用一个标识符loop来指定这个while循环
        //然后在跳到case5时，写成break loop，意为直接跳出这个while循环，达成“退出”的目的。
    }


    //1.添加学生：要求：先查询id，确保id唯一，如果id唯一，添加其他信息，id不唯一，报错
    public static void addStudent(ArrayList<Student> list) {
        //因为要满足id唯一，所以添加前要先判断id
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id：");
        String id = sc.next();

        if (getIndex(list, id) == -1) {//getIndex为-1表示，表中无该id，于是可以添加，此时再输入其他信息
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入家庭住址：");
            String address = sc.next();
            Student s = new Student(id, name, age, address);
            list.add(s);
            System.out.println("添加成功！");
        } else {
            System.out.println("id重复，无法添加。");
        }
    }


    //2.删除学生：先查询id，表里有该id才能删除，没有就不能删
    public static void deleteStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id：");
        String id = sc.next();

        if (getIndex(list, id) == -1) {//indexInArray为-1，表示表中没有此id，删不了
            System.out.println("没有此学生，无法删除。");
        } else {
            list.remove(getIndex(list, id));
            System.out.println("删除成功！");
        }
    }


    //3.修改学生（更新学生信息）：先查询id，表里有该id才能录入其他信息，没有就不能修改
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id：");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index != -1) {//不等于-1，说明表中有该id，可以进行修改
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入家庭住址：");
            String address = sc.next();
            list.get(index).setName(name);//修改该索引位学生的姓名
            list.get(index).setAge(age);//修改该索引位学生的年龄
            list.get(index).setAddress(address);//修改该索引位学生的地址
        } else {
            System.out.println("没有此学生，无法修改。");
        }

    }

    //4.查询学生：表中没学生，提示添加后再查询。表中有学生，则打印表。
    public static void searchStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {//表为空
            System.out.println("当前无学生信息，请添加学生后在进行查询");
            return;
        }
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); ++i) {
            Student s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        //如果表中有id，返回索引位。没有id，则返回-1
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
