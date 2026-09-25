package pers.cjw.sort;

import java.util.Arrays;

public class Sort04ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // 初始化间隔（gap）的值，它决定了每次迭代中子数组的大小
        // 从数组长度的一半开始作为初始间隔值，gap就是分割的子数组数量
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 循环从间隔值开始，遍历数组直到数组的末尾；代表循环所有的子数组
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                // 将当前元素 arr[j] 的值替换为前一个元素 arr[j - gap] 的值。
                // 通过这个操作，将较大的元素向后移动，为当前元素腾出位置
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        Sort04ShellSort.shellSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
