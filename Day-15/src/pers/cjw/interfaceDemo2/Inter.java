package pers.cjw.interfaceDemo2;

public interface Inter {

    //接口的成员：

    //（1）接口的成员变量：
    //接口的成员变量必须是常量，即默认修饰符public static final,无法更改。
    //因为多个子类的共有成员变量都抽取到父类里去了，不会抽取到接口里。
    //public表示外部类可调用此常量。static方便外部类调用，调用时直接写“接口名.常量名”即可。final不可更改

    int a = 10;

    //在test中打印Inter.a，打印结果为10，证明修饰符为static
    //并且test中无法修改a，证明修饰符为final。
    //所以修饰符默认public static final


    //（2）接口的构造方法：没有构造方法，
    // 因为接口不需要创建对象，而且实现接口的类自己有构造方法，不需要调用接口的构造方法。

    //（3）接口的成员方法：
    //jdk7以前，成员方法只能是抽象方法，没有具体方法体，并且要用abstract修饰。如果类要实现接口，必须重写方法。

    void method();

}
