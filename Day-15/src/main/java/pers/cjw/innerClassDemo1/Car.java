package pers.cjw.innerClassDemo1;

public class Car {

    //车的五大属性：车名、车龄、车颜色、发动机名、发动机年龄

    //这五个成员变量可以直接定义
    //但是我们发现发动机本身也可以是一个类，并且我们不会脱离车去谈引擎。
    //所以可以把引擎类定义为车的内部类。在car类中定义engine类，并且在engine内定义engine的成员变量

    //车是外部类，引擎是内部类。
    //内部类可以访问外部类的成员，包括私有变量和私有方法。
    //外部类想要访问内部类的成员，必须创建内部类对象。

    String carName;
    int carAge;
    String carColor;


    public void show() {

        //外部类想要访问内部类的成员，必须创建内部类对象。
        //比如外部类car的show方法,想要调用内部类成员变量engineName,必须创建一个内部类engine对象
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    //内部类：引擎
    class Engine {
        String engineName = "v8";
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);

            //内部类可以访问外部类的成员，包括私有变量和私有方法。
            //比如这个内部类的方法show,可以调用外部类的成员变量carName
        }
    }
}
