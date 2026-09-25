package pers.cjw.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //格式:switch括号内的表达式或变量等于其中一个case后面的值，那么执行该case后面的语句。
        Scanner sc = new Scanner(System.in);
        String noodle = "兰州拉面";
        switch (noodle) {
            case "兰州拉面":
                System.out.println("真好吃");
                break;
            case "炸酱面":
                System.out.println("真难吃");
                break;
            default:
                System.out.println("没有这个面");
                break;
        }//与c++一模一样

        //这里输入然后改成炸酱面
        noodle = sc.next();//next(String patt  ern)键入字符串
        switch (noodle) {
            case "兰州拉面":
                System.out.println("真好吃");
                break;
            case "炸酱面":
                System.out.println("真难吃");
                break;
            default:
                System.out.println("没有这个面");
                break;
        }

    }

}
