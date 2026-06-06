package pers.cjw.API.sort;

import java.util.Arrays;

public class A05_QuickSortDemo {
    public static void main(String[] args) {

        //快速排序：
        //第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
        //比基准数小的全部在左边，比基准数大的全部在右边。
        //后面以此类推。

        //课堂练习：
        //我们可以利用相同的办法去测试一下，选择排序，冒泡排序以及插入排序运行的效率
        //得到一个结论：快速排序真的非常快。

        int[] arr = {1, 1, 6, 2, 7, 9, 3, 4, 5, 1, 10, 8};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }


    //arr：待排数组，i：待排数组的起始索引，j：待排数组的结束索引
    public static void quickSort(int[] arr, int i, int j) {

        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        if (start > end) {
            //递归的出口：如果递归着，出现了这种情况，停。
            return;
        }

        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字
        while (start != end) {
            //利用end，从后往前开始找，找比基准数小的数字
            //int[] arr = {1, 6, 2, 7, 9, 3, 4, 5, 10, 8};
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            //利用start，从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }


            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr, i, start - 1);
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr, start + 1, j);

    }
}
