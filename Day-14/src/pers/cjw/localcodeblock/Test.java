package pers.cjw.localcodeblock;

public class Test {
    public static void main(String[] args) {
        //局部代码块：非常好理解的，把代码用一段大括号括起，代码块执行完，块中定义的变量都会从内存释放。
        //这个技术现在基本不用，因为现在的计算机内存都不小，不必要节省那几字节。

        //构造代码块：每个类有自己的构造方法：最简单的有无参构造和全参构造
        //有时会往构造函数中加一些内容，当一个类中的每个构造方法中都有一段重复的代码时，
        //可以把这段代码块抽取到类中，作为类中的一个“成员”，就自动视为构造代码块.

        Student s1 = new Student();
        //输出“开始创建对象了”
        Student s2 = new Student("cjw", 24);
        //输出“开始创建对象了”
    }
}

class Student {
    private String name;
    private int age;

    //下面这个大括号就是构造代码块，就像是类中的一个成员。但他没有类型，他是此类每个构造函数的共有内容
    {
        System.out.println("开始创建对象了");
    }
    //调用构造方法时，先执行构造代码块，再执行构造方法

    public Student() {
        //这里虽然什么都没写，但事实上有上述代码块
    }

    public Student(String name, int age) {
        //这里虽然没写，但事实上有上述代码块
        this.name = name;
        this.age = age;
    }
}