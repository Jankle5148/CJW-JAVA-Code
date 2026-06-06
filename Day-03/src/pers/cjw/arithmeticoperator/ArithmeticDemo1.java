package pers.cjw.arithmeticoperator;

public class ArithmeticDemo1 {
    public static void main(String[] args) {
        System.out.println(3 + 2);
        System.out.println(3.3 + 5.5);
        System.out.println(3.3 * 712);
        System.out.println(8 - 55.2);

        System.out.println(1.1 + 1.101);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 2.34);

        System.out.println(10 % 4);
        System.out.println(199 % 2);

        //运算数全是整数，则结果一定是整数
        //但凡运算数中有小数，结果可以是小数，也可以是整数，且结果可能不准确
    }
}
