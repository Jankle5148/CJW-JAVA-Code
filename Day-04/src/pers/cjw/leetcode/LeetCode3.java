package pers.cjw.leetcode;

import java.util.Scanner;

public class LeetCode3 {
    public static void main(String[] args) {
        //力扣题：给定两个数，不使用乘法除法和%的情况下，得到两数相除的商和余数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int a = sc.nextInt();
        System.out.print("请输入除数：");
        int b = sc.nextInt();
        int count = 0;//使用一个计数器，看减了多少次，减的次数就是商，最后减剩的数就是余数
        while (a >= b) {
            a = a - b;
            ++count;
        }
        System.out.println("商为：" + count);
        System.out.println("余数为：" + a);
    }
    //只弄清原理即可，实际还要考虑代码健壮性
}
