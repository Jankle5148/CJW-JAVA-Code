package pers.cjw.innerClassDemo1;

public class Test {
    public static void main(String[] args) {

//      内部类的访问特点:
//      内部类可以直接访问外部类的成员，包括私有
//      外部类要访问内部类的成员，必须创建对象


        Car c = new Car();

        //因为成员变量默认public，可以直接赋值
        c.carName = "宾利";
        c.carAge = 1;
        c.carColor = "粉色";

        c.show();
    }
}
