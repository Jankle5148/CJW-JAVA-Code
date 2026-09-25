package pers.cjw.polymorphism.polymorphismDemo2;

public class Test {
    public static void main(String[] args) {
        //调用变量时：编译看左边，运行也看左边。
        //调用方法时：编译看左边，运行看右边。
        //什么意思？如下：

        Animal a1 = new Dog();
        //创建一个狗，但赋予成动物的状态。

        System.out.println(a1.name);
        //调用变量name时：
        //（1）编译：看左边父类animal类是否有name这个变量，如果有，程序才会编译成功。
        //（2）运行：调用左边父类animal的name，即“动物”的name。
        //结果：编译成功，运行结果为“动物”的name。

        a1.show();
        //调用方法show时：
        //（1）编译：看左边父类animal类是否有show这个方法，如果有，程序才会编译成功。
        //（2）运行：看右边子类dog是否有show方法，如果子类没有show方法，就再调用父类的show方法（父类一定有，不然上面编译不会通过）

        //为什么变量调用看左边？
        //之前学过：父类子类各有同名变量，子类的同名变量不会覆盖父类的同名变量，而且调用时遵循 “就近原则”。
        //普通创建对象时：子类对象就是子类，且对象空间中拥有父类和子类的同名变量，调用时会先去子类的地方找（就近原则）。
        //多态创建对象时：相当于将子类对象指定为父类的状态，那么这时候就先去父类的地方找（指定为谁的状态，就先去谁那里找）。

        //为什么方法调用看右边？
        //前面学过子类对方法的重写，是将自己虚方法表里从父类传下来的方法进行重写，相当于一个 “覆盖”。
        //调用时，先在自己的虚方法表里找，找到的就是自己重写的，如果自己没有重写，那么这个方法还是从父类传下来的，则运行父类的。
        //画一画内存图。
    }
}

class Animal {
    String name = "动物";
    public void show() {
        System.out.println("animal的show方法");
    }
}

class Dog extends Animal {
    String name = "狗";
    @Override
    public void show() {
        System.out.println("dog的show方法");
    }
}

class Cat extends Animal {
    String name = "猫";
    @Override
    public void show() {
        System.out.println("cat的show方法");
    }
}