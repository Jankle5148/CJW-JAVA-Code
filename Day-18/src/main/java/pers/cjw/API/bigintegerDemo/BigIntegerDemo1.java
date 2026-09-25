package pers.cjw.API.bigintegerDemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {

        //1.public BigInteger(int num, Random rnd)
        //获取随机大整数，范围：[0 ~ 2的num次方-1]
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4, r);//[0 ~ 2^4-1]
        System.out.println(bd1);


        //2.public BigInteger(String val)
        //将传参的整数字符串转换成大整数
        //细节:字符串中的数字必须是整数
        BigInteger bd2 = new BigInteger("99999999999999999999999999999999999");
        System.out.println(bd2);


        //3.public BigInteger(String val, int radix)
        //获取指定进制的大整数
        //细节:1.字符串中的数字必须是整数。2.字符串中的数字必须要跟进制吻合。
        //比如二进制中0和1，如果是2进制的123，一定报错。
        BigInteger bd4 = new BigInteger("100", 2);
        System.out.println(bd4);//bd4为2进制的100，即4

        //==============================================================================================================
        //下面这个不是构造，而是一个静态方法获取BigInteger对象。
        //简单来说就是把其他类型数据转成BigInteger类型。

        //4.public static BigInteger valueOf(long val)
        //long 数据转 BigInteger 对象
        //静态方法获取 BigInteger 的对象，并且内部有优化

        //细节:
        //1.能接收范围比较小，只能在 long 的取值范围 [-2^63,2^63-1] 之内，如果超出 long 的范围就不行了。
        //2.优化：在内部对常用的数字: -16 ~ 16 进行了优化。
        //提前把 -16~16 先创建好BigInteger的对象，如果多次获取不会重新创建新的,节省空间。

        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        //因为多次获取不会重新创建新的，所以 bd5 和 bd6 的地址相同
        System.out.println(bd5 == bd6);//true


        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        //17超出 -16~16 范围，所以多次获取需要重新创建。
        //所以 bd7 和 bd8 互为独立对象，地址不同，所以 false
        System.out.println(bd7 == bd8);//false

        //==============================================================================================================
        //5.对象一旦创建，内部的数据不能发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        //bd9内部的值就是1，不可改变
        BigInteger bd10 = BigInteger.valueOf(2);
        //bd10内部的值就是2不可改变


        BigInteger result = bd9.add(bd10);
        //add方法把 bd10 加到 bd9 上，不意味着 b9 变成3了，因为内部的数据不能发生改变。
        //所以我们要拿一个新的 BigInteger 对象 result，接收这个值
        System.out.println(result);//3
        //同理，每进行一次运算，就会产生一个新的BigInteger对象


    }
}
