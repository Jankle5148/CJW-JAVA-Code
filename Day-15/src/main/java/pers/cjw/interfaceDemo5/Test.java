package pers.cjw.interfaceDemo5;

public class Test {
    public static void main(String[] args) {

//        jdk8开始，也可以在接口中定义静态方法。要用static修饰符修饰。

        InterImpl ii = new InterImpl();
        ii.method();

//        接口内的静态方法可以直接通过接口调用
//        Inter接口中已有一个show方法，实现Inter接口的InterImpl类也有自己的show方法

//        如果调用Inter接口中的show方法：接口名.方法名
//        如果调用InterImpl类中的show方法：对象.方法名
        Inter.show();
        ii.show();

//        如果把类自己的show方法做成static的，甚至可以直接通过类调用
        InterImpl.show();

    }
}
