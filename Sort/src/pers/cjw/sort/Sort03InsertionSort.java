package pers.cjw.sort;

import java.util.Arrays;

public class Sort03InsertionSort {

    // 3.插入排序，将一个记录插入到已经排好序的有序表中，从而得到一个新的、记录数增1的有序表。
    // 为方便，将首元素视为已排序部分，剩余元素视为未排序部分。
    // 对未排序部分，将元素依次插入已排序部分的合适位置。每一轮过后，已排序元素+1，未排序元素-1，直至未排序部分无元素。
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            // 将当前值 temp 和前面的值进行比较，
            // 如果前面的值 >temp 则将值往后移1位。
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 在不小当前值temp的位置，插入当前值temp
            arr[j + 1] = temp;
        }
    }
    // 平均时间复杂度：O(n^2)，在大型列表和实际应用中效率低下。但是简单，是向初学者教授排序的好算法。
    // 平均空间复杂度：O(1)
    // 稳定性：稳定。

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        Sort03InsertionSort.insertionSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
