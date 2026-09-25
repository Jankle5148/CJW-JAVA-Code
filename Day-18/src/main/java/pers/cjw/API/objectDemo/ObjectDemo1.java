package pers.cjw.API.objectDemo;

public class ObjectDemo1 {
    public static void main(String[] args) {

        //Object类：最大的父类，所有类都直接或间接继承于Object类

        //object类的tostring方法：
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);
        //java.lang.Object@4eec7777.
        //全类名+对象地址

        Student student = new Student();
        String str2 = student.toString();
        System.out.println(student);

        //打印对象，实际上是默认调用类的tostring方法。
        //System.out:out是system类中的一个静态成员变量，类型为打印流PrintStream，相当于一个“打印机”
        //这个“打印机”out，有各种各样的打印方法：比如println、printf等等
        //这些打印方法也涉及到的tostring方法，
        //向println传参一个对象时，就会调用这个对象的tostring方法，返回对象的全类名+地址。

        //如果我们不重写tostring方法，那么打印对象，永远是全类名+地址
        //所以我们会在类中重写tostring方法，这样打印对象，就会调用重写后的tostring方法，打印我们需要的东西


    }
}
