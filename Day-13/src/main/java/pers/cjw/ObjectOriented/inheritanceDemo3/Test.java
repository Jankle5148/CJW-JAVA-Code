package pers.cjw.ObjectOriented.inheritanceDemo3;

public class Test {
    public static void main(String[] args) {
        //子类到底能继承父类的什么东西：
        //首先一个类中：我们先分为构造方法、成员变量、成员方法
        //1.构造方法：无论如何不能继承。
        //2.成员变量:都可以继承，但是是否能直接调用是另外一回事。
            //非私有：可继承、可直接调用
            //私有：可继承，但不可直接调用，要额外写上get、set方法
        //3.成员方法:
            //非私有：可继承
            //私有：不可继承

        //成员方法的继承有一个机制：
        //比如a继承了b，b继承了c，c继了承d，那么a也是继承了d的成员方法
        //现在要调用a中的一个继承于d的方法
        //但找寻的过程，是先在a里找，找不到，于是找它的父类b，b里也找不到，找b的父类c，c里也找不到，找c的父类d，才在d里找到。
        //对于简单的继承关系来说，没问题，但一旦继承关系的层数增加，调用方法的时间开销会变得非常大。

        //有一个机制：虚方法表，每一个类有一个虚方法表。
        //虚方法：非private、非static、非final的方法。
        //类似传家宝，从最顶层的父类开始，它的虚方法最少，只有它自己所有的虚方法。然后传给下一代
        //每个子类再加上自己的虚方法，构成自己的虚方法表，并传给下一代。
        //因此最“年轻”的子类的虚方法表最丰富，相当于是所有祖辈流传下来的“结晶”。
        //比如a继承了b，b继承了c，c继承了d。
        //那么a的虚方法表中，就有a、b、c、d所有的虚方法，如果调用一个来自d的方法，直接从a的虚方法表里调用即可。
        //因为每个类各有一个虚方法表，会占用一定空间，但是调用方法是时间会减少，所以相当于“空间换时间”了。

        //自己画一画接下来代码内存图：栈内存、堆内存、方法区
        Zi z = new Zi();
        System.out.println(z);
        z.name = "cjw";
        z.age = 24;
        z.game = "原神";
        System.out.println(z.name + "," + z.age + "," + z.game);
        z.ziShow();
        z.fuShow1();
        //此时如果还要z.fuShow2();会报错，因为这是父类的private方法
    }
}

class Fu {
    String name;
    int age;

    public void fuShow1() {
        System.out.println("fuShow1");
    }

    private void fuShow2() {
        System.out.println("fuShow2");
    }
}

class Zi extends Fu {
    String game;//玩的游戏

    public void ziShow() {
        System.out.println("ziShow");
    }
}