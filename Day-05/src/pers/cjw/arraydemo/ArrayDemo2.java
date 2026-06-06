package pers.cjw.arraydemo;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //初始化一个数组并输出，最后求和
        Scanner sc = new Scanner(System.in);
        int[] m = new int[10];//动态定义长度为10的int数组
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            System.out.print("请输入第" + (i + 1) + "个元素的值：");
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; ++i) {
            System.out.println(m[i]);
            sum = sum + m[i];//累加求和
        }
        System.out.println(sum);
    }
}
