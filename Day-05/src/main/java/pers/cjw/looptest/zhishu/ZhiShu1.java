package pers.cjw.looptest.zhishu;

import java.util.Scanner;

public class ZhiShu1 {
    public static void main(String[] args) {

        //判断一个数是质数还是合数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于2的数：");
        int num = sc.nextInt();

        isPrime(num);
    }

    public static void isPrime(int num) {
        for (int i = 2; i <= num; ++i) {

            if (i == num) {
                //此时i已经累加到和num一样了，说明在2到num之间已经没有任何一个数可以整除，所以num必是质数，退出循环。
                System.out.println(num + "是质数");
                break;

            } else {
                //此时i还在2到num之间，那么进行判断，若能整除，说明是合数，退出循环。若不能整除，不做操作，循环会自动++i。
                if (num % i == 0) {
                    System.out.println(num + "是合数");
                    break;
                }
            }

        }
    }


}
