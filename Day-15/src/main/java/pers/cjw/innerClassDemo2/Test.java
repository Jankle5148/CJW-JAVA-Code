package pers.cjw.innerClassDemo2;

public class Test {
    public static void main(String[] args) {

//        两种构建内部类对象的方法

//        1.直接构建内部类对象，前提是内部类是public，外界可以看到
//        Outer.Inner oi = new Outer().new Inner();
//        System.out.println(oi.a);

//        2.内部类private，于是先创建外部类对象，然后调用方法返回一个内部类对象
//        类似javabean类成员变量私有，你要调用它得用get方法

        Outer o = new Outer();
        System.out.println(o.getInner());

    }
}

//编写成员内部类的注意点：

//1. 成员内部类可以被一些修饰符所修饰，比如： private，默认，protected，public，static等
//2. 在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
//3. 创建内部类对象时，对象中有一个隐含的Outer.this记录外部类对象的地址值。（请参见3.6节的内存图）
//
//详解：
//1.内部类被private修饰，外界无法直接获取内部类的对象，只能通过3.3节中的方式二获取内部类的对象
//2.被其他权限修饰符修饰的内部类一般用3.3节中的方式一直接获取内部类的对象
//3.内部类被static修饰是成员内部类中的特殊情况，叫做静态内部类下面单独学习。
//4.内部类如果想要访问外部类的成员变量，外部类的变量必须用final修饰，JDK8以前必须手动写final，JDK8之后不需要手动写，JDK默认加上。
