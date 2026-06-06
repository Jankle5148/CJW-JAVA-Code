package pers.cjw.looptest.zhishu;

import java.util.Scanner;

public class ZhiShu2 {
    public static void main(String[] args) {

        //优化算法：
        //先对该数开方得到它的根，向下取整得到整数num2。只计算2-num2中，是否能整除即可。

        //为什么，因为只要能整除，要么这两个数都等于num2，要么一个大于num2，一个小于num2。
        //如果在2-num2之间都找不到，那么num2之后的数还会不会有呢？不会。
        //假设num2之后有，那么另外一个数一定是一个小于num2的整数。
        //但是刚刚并没有在2~num2中遍历出这么一个数，矛盾，故没有。
        //所以只需遍历2~num2(包括num2)是否有即可。减少了非常大的计算量。

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于2的数：");
        int num = sc.nextInt();

        isPrime(num);

    }

    public static void isPrime(int num) {

        //得到num的开方，类型转换为int，double转int去掉小数部分，即默认向下取整
        int num2 = (int) Math.sqrt(num);

        for (int i = 2; i <= num2; ++i) {

            //如果num能被i整除，则是合数，打印并退出循环。
            if (num % i == 0) {
                System.out.println(num + "是合数且两个数分别为：" + i + "和" + (num / i));
                break;
            }

            //能运行到这，说明此时的i不是因子。
            //如果i还在2~num2之间，不用操作，循环自动++i，说不定下一个就成了。
            //如果i已经增加到num2了，并且不是因子，那么最后一个数num2也没希望了，那num一定是质数。
            if (i == num2) {
                System.out.println(num + "是质数");
            }

        }
    }
}
