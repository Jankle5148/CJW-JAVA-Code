package pers.cjw.interfaceDemo1;

public class Dog extends Animal implements Swim {

    public Dog() {
    }

    //    有参构造调用父类有参构造
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗会狗刨");
    }
}