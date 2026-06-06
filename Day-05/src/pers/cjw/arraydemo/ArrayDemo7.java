package pers.cjw.arraydemo;

import java.util.Random;

public class ArrayDemo7 {
    public static void main(String[] args) {
        //一个长度为10的数组，数组元素均为1-100的随机数，求数组的和、平均值、小于平均值的元素个数
        int[] array2 = new int[10];
        int sum = 0;//求和
        int num = 0;//计数器
        Random r2 = new Random();
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = 1 + r2.nextInt(100);
            System.out.println(array2[i]);
            sum += array2[i];
        }
        System.out.println("数组的和是：" + sum);
        System.out.println("数组的平均值是：" + sum / array2.length);
        for (int i = 0; i < array2.length; ++i) {
            if (array2[i] < sum / array2.length) {
                ++num;
            }
        }
        System.out.println("小于平均值的元素个数是：" + num);

    }
}
