package pers.cjw.interfaceDemo4;

public interface Inter2 {

    public default void show() {
        System.out.println("Inter2的默认方法体show");
    }
    //这个方法不强制重写,是默认方法,加上default关键字
}
