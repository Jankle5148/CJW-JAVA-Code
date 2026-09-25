package pers.cjw.arraydemo;

import java.util.Random;

public class ArrayDemo10 {
    public static void main(String[] args) {
        //定义一个长度为10的数组，数组元素均为1-100的随机数，将数组进行倒序处理
        int[] array5 = new int[10];
        int temp3;
        Random r2 = new Random();
        for (int i = 0; i < array5.length; ++i) {
            array5[i] = 1 + r2.nextInt(100);
            System.out.print(array5[i] + " ");
        }
        System.out.println(" ");

        int a = 0;
        int b = array5.length - 1;
        while (a < b) {
            temp3 = array5[a];
            array5[a] = array5[b];
            array5[b] = temp3;
            ++a;
            --b;
        }
        for (int i = 0; i < array5.length; ++i) {
            System.out.print(array5[i] + " ");
        }
    }
}
