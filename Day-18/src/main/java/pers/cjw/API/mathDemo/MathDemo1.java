package pers.cjw.API.mathDemo;

public class MathDemo1 {
    public static void main(String[] args) {

        //Math类：包含许多数学方法，可以直接调用。

        // （1）int abs(int a) ：返回参数绝对值
        System.out.println("-2的绝对值为：" + java.lang.Math.abs(-2));//2
        System.out.println("2的绝对值为：" + java.lang.Math.abs(2));//2

        //绝对值：absolute value.

        //========================================================================

        // （2）double ceil(double a) ：返回大于或等于参数的最小整数
        System.out.println("大于或等于23.45的最小整数位：" + java.lang.Math.ceil(23.45));//24.0
        System.out.println("大于或等于-23.45的最小整数位：" + java.lang.Math.ceil(-23.45));//-23.0
        // （3）double floor(double a)：返回小于或等于参数的最大整数
        System.out.println("小于或等于23.45的最大整数位：" + java.lang.Math.floor(23.45));//23.0
        System.out.println("小于或等于-23.45的最大整数位：" + java.lang.Math.floor(-23.45));//-24.0

        //理解：ceiling天花板，floor地板

        //========================================================================

        // （4）int round(float a) ：四舍五入
        System.out.println("23.45四舍五入的结果为：" + java.lang.Math.round(23.45));//23
        System.out.println("23.55四舍五入的结果为：" + java.lang.Math.round(23.55));//24

        //========================================================================

        // （5） int max(int a,int b) ：返回两个int值中的较大值
        System.out.println("23和45的最大值为: " + java.lang.Math.max(23, 45));//45

        // （6） int min(int a,int b) ：返回两个int值中的较小值
        System.out.println("12和34的最小值为: " + java.lang.Math.min(12, 34));//12

        //========================================================================

        // （7） double pow (double a,double b)： 返回a的b次幂
        System.out.println("2的3次幂计算结果为: " + java.lang.Math.pow(2, 3));//8.0
        //b为0-1时，为开根号，比如b = 0.5，那么结果为根号a
        System.out.println("16的开根号计算结果为: " + java.lang.Math.pow(16, 0.5));//4.0
        //b<0时，为次方分之一，比如b = -2，那么结果为a方分之一
        System.out.println("10的-2次幂计算结果为: " + java.lang.Math.pow(10, -2));//0.01

        //========================================================================

        // （8） double random()：返回值为在[0.0 , 1.0)的随机double数
        System.out.println("获取到的0-1之间的随机数为: " + java.lang.Math.random());//[0.0 , 1.0)的随机double数
    }
}