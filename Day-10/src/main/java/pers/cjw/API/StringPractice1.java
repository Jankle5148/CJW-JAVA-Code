package pers.cjw.API;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        //键入一个字符串，长度小于等于9，全为数字，将数字变成罗马数字
        //思路：与替换敏感词类似，循环扫描替换
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个长度小于等于9的字符串：");
        String str = sc.next();
        converseStr(str);
    }

    public static void converseStr(String str) {
        boolean flag = checkStr(str);
        if (flag) {
            String[] romaNumber = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            for (int i = 0; i < romaNumber.length; ++i) {
                str = str.replace(String.valueOf(i), romaNumber[i] + " ");
            }
            System.out.println(str);
        } else {
            System.out.println("字符串输入有误，请重新输入");
        }
    }

    public static boolean checkStr(String string) {//检查字符串，健壮性
        if (string.length() > 9) {//长度不大于9
            return false;
        }

        for (int i = 0; i < string.length(); ++i) {//只能是数字
            char c = string.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
