package pers.cjw.abstractDemo2;

public class Sheep extends Animal {

    public Sheep() {
    }

    //    有参构造调用父类有参构造
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("山羊在吃草");
    }
}
