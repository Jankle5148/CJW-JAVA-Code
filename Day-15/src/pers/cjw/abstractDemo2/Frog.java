package pers.cjw.abstractDemo2;

public class Frog extends Animal {

    public Frog() {
    }

    //    有参构造调用父类有参构造
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
