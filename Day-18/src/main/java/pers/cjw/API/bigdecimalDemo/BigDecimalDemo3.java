package pers.cjw.API.bigdecimalDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {

        //四则运算
        BigDecimal b1 = new BigDecimal("0.3");
        BigDecimal b2 = new BigDecimal("4");
        BigDecimal b3 = new BigDecimal("1");
        BigDecimal b4 = new BigDecimal("-1");
        BigDecimal b5 = new BigDecimal("3");

        System.out.println(b1.add(b2));         // 进行加法运算
        System.out.println(b1.subtract(b2));    // 进行减法运算
        System.out.println(b1.multiply(b2));    // 进行乘法运算
        //加减乘运算：不会产生精度问题。

        //除法不一样：
        //如果除法的结果是一个无限循环小数，比如1/3=0.333333333333333333
        //System.out.println(b3.divide(b4));
        //控制台会报错，此时换用另一个带“取舍模式”的divide方法。

        //scale：精确位数（保留几位小数）。
        //取舍模式被封装到了RoundingMode这个枚举类中
        //最常见的取舍方式有如下几个：
        //HALF_UP(正常四舍五入)
        //UP(远离0方向取舍)   DOWN(向0方向取舍)
        //CEILING(向正无穷方向取舍)    FLOOR(向负无穷方向取舍)

        //HALF_UP(4舍五入)：正常四舍五入
        System.out.println(b3.divide(b5, 2, RoundingMode.HALF_UP));//0.33
        System.out.println(b4.divide(b5, 2, RoundingMode.HALF_UP));//-0.33

        //RoundingMode.UP：远离零方向取舍
        System.out.println(b3.divide(b5, 2, RoundingMode.UP));//0.34
        System.out.println(b4.divide(b5, 2, RoundingMode.UP));//-0.34

        // RoundingMode.UP：向零方向取舍
        System.out.println(b3.divide(b5, 2, RoundingMode.DOWN));//0.33
        System.out.println(b4.divide(b5, 2, RoundingMode.DOWN));//-0.33

        //RoundingMode.FLOOR：向正无穷方向取舍
        System.out.println(b3.divide(b5, 2, RoundingMode.CEILING));//0.33
        System.out.println(b4.divide(b5, 2, RoundingMode.CEILING));//-0.34

        //RoundingMode.FLOOR：向负无穷方向取舍
        System.out.println(b3.divide(b5, 2, RoundingMode.FLOOR));//0.33
        System.out.println(b4.divide(b5, 2, RoundingMode.FLOOR));//-0.34



    }
}
