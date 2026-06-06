package pers.cjw.API.bigdecimalDemo;

import java.math.BigDecimal;

public class BigDecimalDemo4 {
    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(0.226);
        BigDecimal bd2 = BigDecimal.valueOf(123.226);
        BigDecimal bd3 = BigDecimal.valueOf(-1.5);

        //存储方式：存字符的ascii码，
        //0.226，拆分为字符0、.、2、2、6，ascii码分别为48、46、50、50、54
        //所以value=[48, 46, 50, 50, 54]
        //后面两个同理（负号也有ascii码）

        //理论上，BigDecimal能表示的最大数字也是非常大。
        //还没到某个数字，电脑的内存就会撑爆，所以一般认为BigInteger是无限的。


    }
}
