package pers.cjw.looptest.random;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        //猜随机数，猜错输出大了还是小了，且继续猜。猜对就输出对并退出
        Random r = new Random();//创建一个随机数对象
        int num = 1 + r.nextInt(100);

        //调用r的nextInt函数，生成一个0-99的随机数赋值给num,循环100次并输出
        //这个函数一定从0开始，从0开始，从0开始，从0开始！到99为止，左闭右开
        //所以要其他范围的数，加上左边界即可
        //如范围为7-15，即7+r.nextInt(9)
        //所以猜1-100内的随机数，就是1+r.nextInt(100)

        Scanner sc = new Scanner(System.in);
        int num2;
        while (true) {
            System.out.println("请输入你猜的数字：");
            num2 = sc.nextInt();
            if (num2 > num) {
                System.out.println("猜大了！");
            } else if (num2 < num) {
                System.out.println("猜小了！");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
