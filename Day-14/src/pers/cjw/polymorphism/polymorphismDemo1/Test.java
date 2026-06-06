package pers.cjw.polymorphism.polymorphismDemo1;

public class Test {

    //多态：面向对象的三大特征之一。
    //比如有一个父类person，子类student和teacher
    //Student s = new Student();创建一个学生对象，赋值给Student类型变量s，证明这个真正的对象本质是学生，现在身份是“学生”
    //Person p = new Student();创建一个学生对象，赋值给Person类型变量p，证明这个真正的对象本质是学生，现在身份是“人类”
    //左边相当于对象被赋予的身份，右边相当于对象真实的身份。
    //所以多态就是，当一个类有父类时，它就有多种状态，它的身份既可以是他自己，也可以是他的父类。

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("cjw");
        s.setAge(24);
        register(s);//学生信息为：cjw,24

        Teacher t = new Teacher();
        t.setName("jsx");
        t.setAge(50);
        register(t);//老师的信息为：jsx,50

        Administrator a = new Administrator();
        a.setName("zxy");
        a.setAge(30);
        register(a);//管理员的信息为：zxy,30

        //s,t,a是三个不同的类对象，但他们都有共同的父类person，说明他们除了自己本身的身份外，还有共同的身份person。
        //又因为register的传参就是person，所以这三个都符合身份。
        //并且因为每个子类都重写了show，系统还会判断传进来对象的真实身份，来判断到底该用哪一个show。
        //所以多态就是，当一个类有父类时，它就有拥有多种状态，它的状态既可以是他自己，也可以是他的父类。

    }

    public static void register(Person p) {
        //想要这个方法能接受传参为老师、学生和管理员，而不是为他们一人写一个方法。
        //既然他们的父类是person，那么这三个类的对象天然带有person的身份，只要我把传参设置为person，这样这三个类的对象都能传进来了。
        p.show();
        //因为每个子类都重写了show，系统还会判断传进来对象的真实身份，来判断到底该用哪一个show。
    }
}
