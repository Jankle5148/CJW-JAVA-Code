package pers.cjw.API.bigdecimalDemo;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {

        //1.创建BigDecimal对象
        //（1）构造方法：直接new，传参可以是float、double，也可以它们的字符串。（建议使用字符串，较为精确。）
        //（2）静态方法：BigDecimal的valueOf方法，将float、double转换为BigDecimal。
        BigDecimal b1 = new BigDecimal("0.3");
        BigDecimal b2 = new BigDecimal("4");
        BigDecimal b3 = new BigDecimal("1");
        BigDecimal b4 = new BigDecimal("-1");
        BigDecimal b5 = new BigDecimal("3");
        //tips：如果数字没超出double范围，用静态方法创建。超出，用构造方法创建。


    }
}
