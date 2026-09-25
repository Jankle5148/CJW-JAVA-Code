package pers.cjw.ObjectOriented.inheritanceDemo1;

public class Person {
    //继承：类与类之间存在共性，就可以抽象出共性的部分，封装成父类，让这些类去继承父类，提高代码复用性
    //人类，父类，有两个派生类：学生类和老师类
    //学生类和老师类都是人类，因此可以继承人类的变量和方法
    //与此同时，他们还有自己的方法。

    //java只支持单继承：父类可有多个子类，但子类只有一个父类
    //但支持多层继承：子类继承父类，父类又继承别的父类，那么别的父类是子类的间接父类，

    private String name;
    private int age;
    private String gender;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sleep() {
        System.out.println("正在睡觉");
    }

    public void eat() {
        System.out.println("正在吃饭");
    }
}
