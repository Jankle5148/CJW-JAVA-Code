package pers.cjw.API;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //已知正确用户名和密码，模拟登录
        //给三次机会，正确与否给出相应提示
        String correctID = "陈俊文";
        String correctPWD = "123456";

        Scanner sc = new Scanner(System.in);
        int count = 0;//计数器，记录当前已使用几次机会
        while (count < 3) {
            System.out.print("请输入用户名：");
            String id = sc.next();
            System.out.print("请输入密码：");
            String pwd = sc.next();

            if (id.equals(correctID) && pwd.equals(correctPWD)) {
                System.out.println("输入正确。");
                break;
            } else {
                ++count;
                if (count == 3) {
                    System.out.println("3次机会已经用完。");
                    break;
                } else {
                    if (!id.equals(correctID)) {
                        if (!pwd.equals(correctPWD)) {
                            System.out.println("用户名、密码错误，您还剩" + (3 - count) + "次机会，请重新输入：");
                        } else {
                            System.out.println("用户名错误，您还剩" + (3 - count) + "次机会请重新输入：");
                        }
                    } else {
                        System.out.println("密码错误，您还剩" + (3 - count) + "次机会请重新输入：");
                    }
                }
            }
        }
    }
}
