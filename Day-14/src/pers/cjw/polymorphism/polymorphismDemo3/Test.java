package pers.cjw.polymorphism.polymorphismDemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);

        //多态的优势：
        //以stringBuilder的append方法举例，发现他什么类型的参数都可以传进去。
        //是因为append的其中一个形参是 object，object是最顶级的父类，所有的类都直接或间接继承于object。
        //所以append什么对象都能传进去，这就是多态。
        //如果没有多态：每传一种类型的对象就要重写写一个方法。非常麻烦，无穷无尽。

        ArrayList<String> list = new ArrayList<>();
        list.add("000");
        //事实上集合的add方法，也是可以什么都可以添加，因为形参有object。
        //但是为了方便归类，我们才在后面指定泛型string，这样这个集合只能存string。


        //多态的弊端：无法调用子类特有的方法：

        Animal a = new Dog();
        a.eat();
        //调用方法：
        //编译看左边：animal有eat方法，编译成功。
        //运行看右边：运行右边dog的eat方法。
        //输出"dog在吃骨头"，没问题。

        //a.lookHome();
        //但是此时运行a.lookHome()会报错。
        //因为调用方法，编译看左边：animal类没有lookHome这个方法，编译失败。

        //怎么解决：把a的animal身份再变回dog的身份即可，类似于字面量的类型转换。
        //用一个新的Dog对象b，去接受转换过来的a。
        Dog b = (Dog) a;
        b.lookHome();
        //此时再调用b的lookHome，没问题。

        //但是类与类之间不能强制转换，比如狗就不能转成猫
        //所以需要做一个判断，例如要把猫转成狗。
        Animal w = new Cat();
        //首先定义一个猫w,对外展现的新身份是动物。
        //因为w对外展现的新身份是动物，现在就当我们不知道他到底是狗还是猫。

        if (w instanceof Dog) {//如果w的本来身份是dog
            Dog d = (Dog) w;//把w的身份转成dog，命名为d
        } else if (w instanceof Cat) {//如果w的本来身份是cat
            Cat d = (Cat) w;//把w的身份转成cat，命名为c
        } else {//如果均不是，则不强转
            System.out.println("无法转换");
        }

        //还有一种简易写法
        //if (w instanceof Dog d) {//如果w的本来身份是dog,强转成dog，命名为d
        //    ...
        //} else if (w instanceof Cat c) {//如果w的本来身份是cat，强转成cat，命名为c
        //    ...
        //} else {//如果均不是，则不强转
        //    System.out.println("无法转换");
        //}

    }
}

class Animal {
    public void eat() {
        System.out.println("animal在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog在吃骨头");
    }

    public void lookHome() {
        System.out.println("dog再看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat在吃鱼");
    }
}