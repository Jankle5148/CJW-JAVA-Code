package pers.cjw.API;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        //给定2个字符串A和B，对a进行旋转操作：将A最左边字符挪到最右边
        //定义一个方法：如果对A进行若干次旋转之后可以得到B，则返回true，否则返回false
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串A:");
        String A = sc.next();
        System.out.println("请输入字符串B:");
        String B = sc.next();
        System.out.println(cmpStr(A, B));

    }

    public static boolean cmpStr(String str1, String str2) {//比较字符串
        for (int i = 0; i < str1.length(); ++i) {
            //为什么只用循环str1.length()次，因为循环到最后一次都变回原来字符串了，这还不行那就真的不行了
            if (rotate(str1).equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String string) {
        return (string + string.charAt(0)).substring(1);
        //旋转：先取第0位加到最后，再截取第1位到最后,得到所需字符串
    }
}
