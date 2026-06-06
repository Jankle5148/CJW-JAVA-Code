package pers.cjw.interfaceDemo1;

public class Rabbit extends Animal {

    public Rabbit() {
    }

    //    有参构造调用父类有参构造
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}
