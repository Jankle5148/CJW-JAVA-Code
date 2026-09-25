package pers.cjw.ObjectOriented.inheritanceDemo2;

public class Animal {
    //现在有四种动物：布偶猫、中国梨花猫、哈士奇、泰迪。设计一套清晰的继承体系。
    //布偶猫：吃饭，喝水，抓老鼠。
    //中国狸花猫：吃饭，喝水，抓老鼠。
    //哈士奇：吃饭，喝水，看家，拆家。
    //泰迪：吃饭，喝水，看家，蹭一蹭。

    //动物类：包含猫类和狗类
    //猫类：包含布偶猫类和中国狸花猫类
    //狗类：包含哈士奇类和泰迪类


    //注意：子类可以继承父类中所有变量，只能访问父类中非私有的成员变量

    public void eat() {
        System.out.println("正在吃饭");
    }

    public void drink() {
        System.out.println("正在喝水");
    }
}
