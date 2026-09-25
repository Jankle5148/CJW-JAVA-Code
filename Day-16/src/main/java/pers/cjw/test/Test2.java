package pers.cjw.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

//        把0-15打乱顺序，并以4个一组添加到二维数组里

        int[] disorder = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};//定义一个数组

        int temp;//交换时的中间变量
        Random r = new Random();//随机器

        for (int i = 0; i < disorder.length; ++i) {//让当前的第i个元素和一个随机的元素进行交换
            //随机产生一个int整数
            int randomIndex = r.nextInt(disorder.length);

            //交换两元素
            temp = disorder[i];
            disorder[i] = disorder[randomIndex];
            disorder[randomIndex] = temp;
        }

        //将打乱的数组四个一组放入二维数组。
        //第二种方法：第i排第j个，索引为4i+j
        int[][] data = new int[4][4];

        for (int i = 0; i < data.length; ++i) {
            for (int j = 0; j < data[i].length; ++j) {
                data[i][j] = disorder[4 * i + j];
            }
        }

        for (int i = 0; i < data.length; ++i) {
            for (int j = 0; j < data[i].length; ++j) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}
