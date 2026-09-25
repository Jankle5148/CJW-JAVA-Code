package pers.cjw.polymorphism.polymorphismDemo4;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String str) {
        System.out.printf("%s岁的%s的猫眯着眼睛侧着头吃%s", getAge(), getColor(), str);
        System.out.println();
    }

    public void catchMouse() {
        System.out.println("正在抓老鼠");
    }
}
