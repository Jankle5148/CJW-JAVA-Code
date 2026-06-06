package pers.cjw.API.sort;

import java.util.Arrays;

public class A01_BubbleSortDemo {
    public static void main(String[] args) {

        //冒泡排序：每一轮最大值会像泡泡一样浮到最后。
        //每次比较左右数，最大推到最右边。
        //1，相邻的元素两两比较，大的放右边，小的放左边。
        //2，第一轮比较完毕之后，数组中最大值就已经归位，第二轮就可以找第二大值，且循环次数递减。
        //3，如果数组中有n个数据，总共我们只要执行 n-1轮 的代码就可以。

        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //2.利用冒泡排序将数组中的数据变成 1 2 3 4 5
        bubbleSort(arr);

        //3.打印数组
        System.out.println(Arrays.toString(arr));

    }

    //冒泡排序
    private static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {

            //每一轮，把数组中的最大值往后推,第i轮需要比较的此数为(n - 1) - i
            for (int j = 0; j < (n - 1) - i; ++j) {
                if (arr[j] > arr[j + 1]) {//如果左大于右，交换，否则不变
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //一轮过后，最大值已出。
        }

    }
}
