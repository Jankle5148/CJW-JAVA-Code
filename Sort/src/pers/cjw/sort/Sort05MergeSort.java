package pers.cjw.sort;

import java.util.Arrays;

public class Sort05MergeSort {
    //归并排序
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // 子数组 L 的大小
        int n1 = mid - left + 1;
        // 右子数组 R 的大小
        int n2 = right - mid;
        // 创建两个临时数组 L 和 R ，分别用来存储左子数组和右子数组的元素
        int[] L = new int[n1];
        int[] R = new int[n2];
        // 使用 for 循环将原始数组 arr 中的元素复制到临时数组 L 和 R 中，分别从 left 和 mid + 1 开始
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        // 初始化三个变量 i、j和k，分别指向数组 L 、R 和原始数组 arr 的起始位置
        int i = 0, j = 0, k = left;
        // 使用 while 循环，比较 L 和 R 的元素，并将较小的元素放回原始数组 arr 中
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // 当 L 或 R 中的元素用完时，将剩余的元素依次放回原始数组 arr 中
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        // merge 方法执行完毕后，两个子数组范围内的元素已经按照从小到大的顺序合并到了原始数组 arr 中
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        Sort05MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
