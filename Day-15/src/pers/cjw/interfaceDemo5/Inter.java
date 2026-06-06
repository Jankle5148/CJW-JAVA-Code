package pers.cjw.interfaceDemo5;

public interface Inter {

    public abstract void method();
    //这个方法需要强制重写,加上abstract关键字


    public static void show() {
        System.out.println("Inter的静态方法show");
    }

    //这个方法不能被重写，是接口内的固有方法

}
