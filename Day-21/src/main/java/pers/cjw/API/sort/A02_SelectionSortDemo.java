package pers.cjw.API.sort;

import java.util.Arrays;

public class A02_SelectionSortDemo {
    public static void main(String[] args) {

        //选择排序：
        //1，从0号位开始，跟后面的1到n-1号元素一一比较。
        //2，碰到一个比0号位小的，将其交换到0号位，继续遍历，再碰到一个比0号位小的，再将其交换到0号位。
        //3，第一次循环结束后，可以确定后面最小的元素已经交换到0号位。
        //4，第二次循环从1索引开始，获得第二小的元素在1号位。以此类推。

        //与冒泡排序的区别：（以最小值为例）
        //冒泡：一次次交换，最终浮到最前。
        //选择：每当见到小的，就把他挑到前面去。

        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //2.进行选择排序。
        selectSort(arr);

        //3.打印数组
        System.out.println(Arrays.toString(arr));

    }

    private static void selectSort(int[] arr) {

        int n = arr.length;

        //总共只需要n-1轮，因为第n-1轮后只剩下一个元素，一定是最大值，所以不需要第n轮
        for (int i = 0; i < n - 1; i++) {

            //从i=0号元素开始，将其与后面j号元素，即 i+1 到 n-1号 元素进行比较
            for (int j = i + 1; j < n; j++) {

                //每当见到一个j号元素 比 i号位 小的，将其交换到i号位上来。
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

}
