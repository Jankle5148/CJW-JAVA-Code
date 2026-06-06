package pers.cjw.fordemo;

import java.util.Scanner;

public class ForDemo4 {
    public static void main(String[] args) {

        //键盘录入一个范围a到b，输出其中既能被三整除又能被5整除的数,其中要求代码健壮性，即a不能大于b
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, sum = 0;
        boolean flag = true;
        System.out.println("请输入a和b：");
        while (flag) {
            System.out.print("输入a：");
            a = sc.nextInt();
            System.out.print("输入b：");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("范围错误，请重新输入！");
            } else {
                flag = false;
            }
        }
        for (int i = a; i <= b; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                ++sum;
            }
        }
        System.out.println("共" + sum + "个");
    }
}
