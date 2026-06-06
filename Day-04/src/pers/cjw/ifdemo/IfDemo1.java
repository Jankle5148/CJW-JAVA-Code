package pers.cjw.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //if else语句：酒量大于二两，则给出回应不错，不然回应不行啊。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("不错！");
        } else {
            System.out.println("不行啊！");
        }

        //if括号内可以直接放一个boolean变量，不用判断条件

        //多个判断条件，用else if（不然如果...)
        //循环输出：小于10输出red，10-20输出blue，大于20输出green
        while (true) {
            System.out.println("请输入数字：");
            int num = sc.nextInt();
            if (num < 10) {
                System.out.println("red");
            } else if (num >= 10 && num <= 20) {
                System.out.println("blue");
            } else {
                System.out.println("green");
            }
        }

    }
}
