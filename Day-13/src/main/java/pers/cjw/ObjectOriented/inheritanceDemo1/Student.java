package pers.cjw.ObjectOriented.inheritanceDemo1;

public class Student extends Person {
    //extends Person：继承了Person类中所有变量和方法，
    //student类是person 的子类，也叫派生类。
    //这样类里面只需要写独属于student的变量和方法即可
    public void study() {
        System.out.println("正在学习");
    }
}
