package pers.cjw.API;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        //金额转换方法:数字转换为中文大写数字
        //如2135转换为：零佰零拾零万贰仟壹佰叁拾伍元
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要转换的金额：");
        int amount = sc.nextInt();
        System.out.println("转换之后的金额是：" + converseAmount(amount));
    }

    public static String converseAmount(int amount) {
        char[] chineseNumber = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};//字符表
        char[] chars = {'零', '佰', '零', '拾', '零', '万', '零', '千', '零', '佰', '零', '拾', '零', '元'};
        int[] num = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < num.length; ++i) {
            num[i] = (int) (amount / Math.pow(10, 6 - i)) % 10;
            chars[2 * i] = chineseNumber[num[i]];
        }
        return new String(chars);
    }
}
