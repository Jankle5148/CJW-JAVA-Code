package pers.cjw.setDemo;

import java.util.Objects;

//实现类实现泛型接口之————直接指定泛型为Student
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    //compareTo就是轮流抓红黑树里的对象o进来做传参。
    //如果当前要添加的对象比已有的o小，排o左边，让返回值为负数，恰好this.getAge() - o.getAge()为负数
    //如果当前要添加的对象比已有的o大，排o右边，让返回值为正数，恰好this.getAge() - o.getAge()为正数
    //0 :一样大，舍弃。
    public int compareTo(Student o) {
        //按照年龄的升序进行排列，小在左，大在右
        return this.getAge() - o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
