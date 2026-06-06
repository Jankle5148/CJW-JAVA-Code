package pers.cjw.skiploop;

import java.util.Scanner;

public class SkipLoopDemo4 {
    public static void main(String[] args) {

        //输入一个数，输出这个数的平方根，保留整数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于2的数：");
        int i = sc.nextInt();
        for (int a = 1; ; ++a) {
            if (a * a > i) {
                System.out.println("平方根是：" + (a - 1));
                break;
            } else if (a * a == i) {
                System.out.println("平方根是：" + a);
                break;
            }
        }
        //当a的平方小于i时，需要继续加a，
        //当a的平方大于i时，此时不要输出a，而是输出上一个a，跳出循环。
        //当a的平方等于i时，输出a,跳出循环。
    }
}
