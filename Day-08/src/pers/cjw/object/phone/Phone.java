package pers.cjw.object.phone;

public class Phone {
    String brand;
    double price;

    public void call() {
        System.out.println("打电话");
    }

    public void playGame() {
        System.out.println("打游戏");
    }
    //定义一个“事物”类，专业叫做javabean类：不需要main函数。只需要定义它的成员变量和方法即可。
    //定义一个测试类：需要写main函数，其中可以使用javabean类定义对象，以完成一些事情。
    //一个java文件其实可以有多个类，但是只能有一个类是public的，而且这个类名就是java文件的名。
    //但一个java文件多个类无实际意义，所以还是一个文件一个类吧。
    //一般定义成员变量不需要赋值，因为类本身就是抽象的，不是具体的，具体的对象的成员变量在外部赋值。
    //所以成员变量有初始值：
    //byte、short、int、long=0；
    //float、double=0.0
    //boolean=false
    //引用数据类型=null
}
