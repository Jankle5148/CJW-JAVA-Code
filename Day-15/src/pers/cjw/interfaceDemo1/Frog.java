package pers.cjw.interfaceDemo1;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    //    有参构造调用父类有参构造
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙会蛙泳");
    }
}
