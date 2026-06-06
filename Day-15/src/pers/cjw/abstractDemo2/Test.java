package pers.cjw.abstractDemo2;

public class Test {
    public static void main(String[] args) {


        Frog f = new Frog("小绿", 1);
        System.out.println(f.getName() + "今年" + f.getAge()+"岁");

        f.drink();
//        青蛙的喝水，即动物的喝水
        f.eat();
//        青蛙的吃，为青蛙自己重写的eat，即青蛙吃虫子

    }
}
