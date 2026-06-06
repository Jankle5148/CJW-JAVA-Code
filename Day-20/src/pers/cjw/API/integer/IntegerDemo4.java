package pers.cjw.API.integer;

public class IntegerDemo4 {
    public static void main(String[] args) {

        //利用构造方法获取Integer的对象(JDK5以前的方式)
        //Integer i1 = new Integer(1);
        //Integer i2 = new Integer("1");
        // 建议：获取Integer对象的时候不要自己new，而是采取 直接赋值 或者 静态方法valueOf 的方式
        // 因为实际开发中，-128~127用的比较多。如果每次都new对象，浪费内存。所以用静态方法即可。
        // 并且开发前可以提前把这个范围之内的每一个数据都创建好对象，如果要用到了不会创建新的，而是返回已经创建好的对象。

        //利用静态方法获取Integer的对象(JDK5以后的方式)
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);//radix：进制

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        //==============================================================================================================
        //这两种方式获取对象的区别(掌握)
        //因为在实际开发中，-128~127之间的数据，用的比较多。如果每次使用都是new对象，那么太浪费内存了
        //所以，提前把这个范围之内的每一个数据都创建好对象。如果要用到了不会创建新的，而是返回已经创建好的对象。
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);//true，因为127已经提前创建好

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);//false，因为128不常用，需要重新创建

        //不建议用new：在Java中，每一次new都是创建了一个新的对象
        //所以下面的两个对象都是new出来，值一样，但是地址不一样，比较是比较的是地址。
        //Integer i10 = new Integer(127);
        //Integer i11 = new Integer(127);
        //System.out.println(i10 == i11);//false

        //Integer i12 = new Integer(128);
        //Integer i13 = new Integer(128);
        //System.out.println(i12 == i13);//false

    }
}
