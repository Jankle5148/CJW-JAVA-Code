package pers.cjw.interfaceDemo1;

public class Test {
    public static void main(String[] args) {

        //创建青蛙
        Frog f = new Frog("小绿", 1);
        System.out.println(f.getName() + "今年" + f.getAge()+"岁");
        f.eat();
        f.swim();

        //创建狗
        Dog d = new Dog("小黄", 1);
        System.out.println(d.getName() + "今年" + d.getAge()+"岁");
        d.eat();
        d.swim();

        //创建兔子
        Rabbit r = new Rabbit("小白", 1);
        System.out.println(r.getName() + "今年" + r.getAge()+"岁");
        r.eat();


//        可以看到，三个类都继承了animal类，并且重写了animal中的抽象方法eat，因此三个动物的eat并不相同
//        同时，frog类和dog类都实现了Swim接口，并且重写了接口中的抽象方法swim，因此这两种动物的swim并不相同

    }
}
