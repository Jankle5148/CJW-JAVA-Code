package pers.cjw.polymorphism.polymorphismDemo4;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String str) {
        System.out.printf("%s岁的%s的狗两只前腿死死的抱住%s猛吃", getAge(), getColor(), str);
        System.out.println();
    }

    public void lookHome() {
        System.out.println("正在看家");
    }

}
