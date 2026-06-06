package pers.cjw.API;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //手机号屏蔽中间四位
        //截取字符:
        //substring(a,b)：返回字符串的a到b-1位，包头不包尾，包左不包右
        //substring(a):从第a位截取到末尾

        //手机号屏蔽中间四位
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入电话号码：");
        String number = sc.next();
        System.out.println(blockNumber(number));

    }

    public static String blockNumber(String number) {
        String str1 = number.substring(0, 3);//第0位到第2位，事实上的1-3位
        String str2 = number.substring(7);//第7位到末尾，事实上的第8位到末尾
        return str1 + "****" + str2;
    }
}
