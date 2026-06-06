package pers.cjw.API.bigintegerDemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {

        //BigInteger大整数

        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法、减法、乘法
        BigInteger bd3 = bd1.add(bd2);
        BigInteger bd4 = bd1.subtract(bd2);
        BigInteger bd5 = bd1.multiply(bd2);
        System.out.println(bd3);//15
        System.out.println(bd4);//5
        System.out.println(bd5);//50

        //3.除法：获取商、余数 （divide And Remainder）
        //divideAndRemainder 返回值是一个 BigInteger 数组，0号位是商，1号位是余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);//2
        System.out.println(arr[1]);//0

        //4.比较是否相同
        System.out.println(bd1.equals(bd2));//false

        //5.次幂
        BigInteger bd6 = bd1.pow(2);//bd1的2次方
        System.out.println(bd6);

        //6.max/min：返回较大值/较小值
        BigInteger bd7 = bd1.max(bd2);
        BigInteger bd8 = bd1.min(bd2);
        System.out.println(bd7);
        System.out.println(bd8);


        //7.long转为int类型整数，保存在BigInteger对象里
        //如果传参如果超出long范围[-2^63,2^63-1]，传参会错误
        BigInteger bd9 = BigInteger.valueOf(2147483647L);
        //获取bd9的int值，如果该值超出int范围[-2^31,2^31-1]，会保留低32位
        int i = bd9.intValue();
        //double的范围非常大，一般不会超出范围
        double v = bd9.doubleValue();

        System.out.println(i);//2147483647
        System.out.println(v);//2.147483647E9：2147483647的科学计数法


    }
}
