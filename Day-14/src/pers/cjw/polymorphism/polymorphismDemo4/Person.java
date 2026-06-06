package pers.cjw.polymorphism.polymorphismDemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void keepPet(Animal ani, String str) {
        if (ani instanceof Dog) {
            System.out.printf("年龄为%s的%s养了一只%s的%s岁的狗", age, name, ani.getColor(), ani.getAge());
            System.out.println();
            ani.eat(str);
        } else if (ani instanceof Cat) {
            System.out.printf("年龄为%s的%s养了一只%s的%s岁的猫", age, name, ani.getColor(), ani.getAge());
            System.out.println();
            ani.eat(str);
        } else {
            System.out.println("没有这种动物");
        }
    }
}
