package pers.cjw.API.integer;

public class IntegerDemo2 {
    public static void main(String[] args) {

        //基本数据 转 包装类数据：称为”装箱“
        //包装类数据 转 基本数据：称为”拆箱“

        //简洁方便时用基本数据，拓展性强时用包装类数据，就会导致数据经常性的装箱和拆箱
        //所以从Java 5（JDK 1.5）开始，基本类型与包装类的装箱、拆箱动作可以自动完成。

        Integer i = 4;
        //自动装箱。相当于Integer i = Integer.valueOf(4);
        i = i + 5;
        //等号右边：先拆箱，然后+5，即 i.intValue() + 5;
        //运算结果再装箱，即 Integer.valueOf(i)
        //但i一直都是一个包装类对象。

        //这种写法简洁很多。基本int怎么运算，integer就可以怎么运算，基本等价。


    }
}
