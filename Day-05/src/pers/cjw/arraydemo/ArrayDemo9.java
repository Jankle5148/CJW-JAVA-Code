package pers.cjw.arraydemo;

import java.util.Random;

public class ArrayDemo9 {
    public static void main(String[] args) {
        //定义一个数组，数组元素均为1-100的随机数，将数组【0】和数组中最大的元素进行交换
        int[] array4 = new int[10];
        int max = 0;
        int num = 0;
        int temp2;
        Random r2 = new Random();
        for (int i = 0; i < array4.length; ++i) {
            array4[i] = 1 + r2.nextInt(100);
            if (array4[i] > max) {
                max = array4[i];
                num = i;
            }
            System.out.print(array4[i] + " ");
        }
        System.out.println(" ");

        temp2 = array4[0];
        array4[0] = max;
        array4[num] = temp2;

        for (int i = 0; i < array4.length; ++i) {
            System.out.print(array4[i] + " ");
        }

    }
}
