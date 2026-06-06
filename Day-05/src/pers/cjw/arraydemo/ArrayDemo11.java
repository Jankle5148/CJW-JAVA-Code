package pers.cjw.arraydemo;

import java.util.Random;

public class ArrayDemo11 {
    public static void main(String[] args) {
        //让一个数组的元素值混乱无序。
        //混乱无序有很多种方法，可以让数组元素随意交换，有让数组元素得到一个唯一的不重复的索引，然后将元素存入索引所在位置等等等等。
        //总之就一个字：乱。下面一个思路，多次交换数组元素即可。

        int[] disorder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//定义一个数组

        int temp4;//交换时的中间变量
        Random r3 = new Random();//一个随机器

        for (int i = 0; i < disorder.length; ++i) {//让当前的第i个元素和一个随机的元素进行交换
            //随机产生一个int整数
            int randomIndex = r3.nextInt(disorder.length);

            //交换两元素
            temp4 = disorder[i];
            disorder[i] = disorder[randomIndex];
            disorder[randomIndex] = temp4;
        }

        for (int j : disorder) {
            System.out.print(j + " ");
        }

    }
}
