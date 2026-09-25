package pers.cjw.API;

import java.util.Scanner;

public class StringDemo4 {
    //string的一些方法
    //charAt(i):返回字符串的第i位字符
    //length()：字符串长度

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String str1 = sc.next();

        //遍历字符串
        for (int i = 0; i < str1.length(); ++i) {
            char c = str1.charAt(i);//charAt(i):返回字符串的第i位字符
            System.out.println(c);
        }

        //统计大写字符、小写字符、数字个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str1.length(); ++i) {
            char c = str1.charAt(i);//charAt(i):返回字符串的第i位字符
            if (c >= 'A' && c <= 'Z') {
                ++bigCount;
            } else if (c >= 'a' && c <= 'z') {
                ++smallCount;
            } else if (c >= '0' && c <= '9') {
                ++numberCount;
            }
        }
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("数字有" + numberCount + "个");
    }
}

