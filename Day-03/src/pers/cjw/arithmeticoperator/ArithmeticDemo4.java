package pers.cjw.arithmeticoperator;

public class ArithmeticDemo4 {
    public static void main(String[] args) {
        //+号可以做数值之间的加法，也可以连接数、字符和字符串
        //从左往右进行运算

        // 1.运算数+字符串
        System.out.println(1 + "99" + "hhh");
        System.out.println(1 + 99 + "hhh");
        //输出结果是199hhh
        //输出结果是100hhh

        // 2.运算数+字符
        System.out.println(1 + 'a');
        //单引号为字符，双引号才是字符串，所以这里不是拼接，而是加上a的ascii码值97，输出结果为98

        // 3.字符+字符串
        System.out.println('a' + "bcd");
        //字符和字符串拼接
        //输出结果abcd
    }
}
