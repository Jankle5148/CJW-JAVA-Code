package pers.cjw.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticDemo2 {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

        //运算数全是整数，则结果一定是整数
        //但凡运算数中有小数，结果可以是小数，也可以是整数，且可能不准确，如10.0/3

        System.out.println(10 % 4);
        System.out.println(199 % 2);
        //取模运算

        //取模运算，输出一个三位数的百位、十位、个位
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int number = sc.nextInt();
        System.out.println("百位：" + (number / 100) % 10);
        System.out.println("十位：" + (number / 10) % 10);
        System.out.println("个位：" + number % 10);

    }
}
