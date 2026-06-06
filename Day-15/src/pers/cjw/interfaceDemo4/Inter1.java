package pers.cjw.interfaceDemo4;

public interface Inter1 {

    public abstract void method();
    //这个方法强制重写,加上abstract关键字

    public default void show() {
        System.out.println("Inter1的默认方法体show");
    }
    //这个方法不强制重写,是默认方法,加上default关键字
}
