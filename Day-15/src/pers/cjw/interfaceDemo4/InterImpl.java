package pers.cjw.interfaceDemo4;

public class InterImpl implements Inter1 {
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法method");
    }
//        实现接口的类，只要把强制重写的方法重写了就行


    @Override
    public void show() {
        System.out.println("实现类重写的默认方法show");
    }

//    intel1接口的show不强制重写，但我还是将他重写了

//    但此时如果类同时实现啷个接口Inter1,Inter2,即implements Inter1,Inter2
//    而Inter1,Inter2都有自己默认的show方法,那么这个时候这个类必须重写show方法
//    如果不重写,系统不知道调用哪个接口里的默认show方法。

}
