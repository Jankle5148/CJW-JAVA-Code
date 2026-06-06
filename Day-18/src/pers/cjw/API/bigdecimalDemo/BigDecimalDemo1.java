package pers.cjw.API.bigdecimalDemo;

public class BigDecimalDemo1 {
    public static void main(String[] args) {

        System.out.println(0.09 + 0.01);
        //本应该输出0.1，实际输出0.09999999999999999
        //因为丢失精度

        //float、double数据进行数学运算的时候，很有可能产生精度丢失。
        //计算机会将程序中十进制数据转换成二进制数据进行运算，运算的结果再转换成十进制数据展示。

        //如果使用整数类型数据进行计算，那么在 十转二 不会存在精度问题；
        //如果使用浮点类型的数据，计算机有时将其转换成一个无限的趋近于这个十进数的二进制数；
        //使用一个不太准确的数据进行运算的时候，最终就会造成精度丢失。

        //为了提高精度，Java就给我们提供了 BigDecimal 类 供我们进行数据运算。
        //BigDecimal：巨大的小数。



    }
}
