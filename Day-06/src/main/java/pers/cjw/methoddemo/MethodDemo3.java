package pers.cjw.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        //输入长方形的长宽，输出长方形的周长。
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长方形的长：");
        int len = sc.nextInt();
        System.out.print("请输入长方形的宽：");
        int width = sc.nextInt();
        getLength(len, width);
    }

    public static void getLength(int len, int width) {
        int result = 2 * (len + width);
        System.out.println("长方形的周长是：" + result);
    }
}
