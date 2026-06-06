package pers.cjw.leetcode;

import java.util.Scanner;

public class LeetCode1 {
    public static void main(String[] args) {

        //力扣题：输入一个数判断是否是回文数，即此数正序逆序相同
        //思路1，将该数个各位存入数据，数组首尾比较，直到比较到中间那位，均相同。说明是回文数。
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("请输入一个数num：");
            int num = sc.nextInt();

            //获得num的位数digitCount
            int digitCount = countDigits(num);

            //创建一个长度为digitCount的数组，存放各位
            int[] digits = new int[digitCount];
            for (int i = 0; i < digitCount; ++i) {
                digits[i] = num % 10;
                num /= 10;
            }

            int a = 0;//第0位
            int b = digitCount - 1;//最后一位

            while (a < b) {//逐位对比

                //如果两位相等，a指针后移，b指针前移
                if (digits[a] == digits[b]) {
                    ++a;
                    --b;
                } else {
                    //一旦不相等，则不是回文数，直接退出循环
                    System.out.println("不是回文数");
                    break;
                }
            }

            //a，b交汇于最中间的数了，仍没退出循环，说明是回文数
            if (a >= b) {
                System.out.println("是回文数");
            }

        }
    }


    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
