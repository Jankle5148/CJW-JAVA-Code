package pers.cjw.innerClassDemo3;

public class Test2 {
    public static void main(String[] args) {

        // 使用匿名内部类：
        // 实现一个接口，要定义一个实现类，一旦接口一多，定义的类就多，而有些类可能就只使用个一两次。
        // 于是想到为了避免浪费，我们再用到的时候，定义一个实现了接口的“一次性”类就可以，这就是匿名内部类。

        //匿名内部类，类如其名，他没有名字，于是他会拿接口名“代称”自己。
        //比如下面的构造方法Swim(),因为Swim是接口，是没有构造方法的。
        //它其实是实现了Swim类的实现类的构造方法，只不过因为它没有名字，于是拿接口名Swim过来用，就成了Swim()。

        //new Swim(),就是new了一个实现了Swim接口的实现类对象，
        //但是你一定要重写方法，你才不是抽象类，才能创建对象，
        //于是在后面的大括号中，要重写接口的抽象方法swimming。
        //这个匿名内部类对象，于是具有了重写的swimming，可以进行调用。

        new Swim() {
            @Override
            public void swimming() {
                System.out.println("自由泳...");
            }
        }.swimming();


        //这个Swim s2也是一样。
        //这里的Swim s2的Swim不是Swim接口，而是实现了Swim接口的匿名内部类。
        //只不过因为匿名所以没有名字，所以直接用Swim表示

        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("蛙泳...");
            }
        };

        s2.swimming();
    }
}