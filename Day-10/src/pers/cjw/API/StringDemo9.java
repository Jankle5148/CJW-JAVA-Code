package pers.cjw.API;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //身份证7-14位：出生日期，第17位性别：男奇数女偶数
        //根据身份证：打印这个人的出生日期和性别。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String id = sc.next();
        System.out.println(getBirth(id));
        System.out.println(getGender(id));

    }

    public static String getBirth(String id) {
        return "出生日期：" + id.substring(6, 10) + "年" + id.substring(10, 12) + "月" + id.substring(12, 14) + "日";
    }

    public static String getGender(String id) {
        char gender = id.charAt(16);//id的第16位，实际第17位
        if ((int) gender % 2 == 0) {
            return "性别：女";
        } else {
            return "性别：男";
        }
    }
}
