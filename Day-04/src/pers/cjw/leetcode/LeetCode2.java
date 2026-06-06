package pers.cjw.leetcode;

import java.util.Scanner;

public class LeetCode2 {
    public static void main(String[] args) {

        //回文数思路二，将原数倒过来，在与原数进行比较，相等即回文
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入一个数：");
            int i = sc.nextInt();
            int newnum = 0;
            int x = i;

            while (x != 0) {
                int ge = x % 10;
                x = x / 10;
                newnum = newnum * 10 + ge;
            }//好办法：得到逆序的数

            if (newnum == i) {
                System.out.println("是回文数");
            } else {
                System.out.println("不是回文数");
            }
        }
    }
}
