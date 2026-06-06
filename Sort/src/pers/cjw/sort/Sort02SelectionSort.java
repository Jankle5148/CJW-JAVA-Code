package pers.cjw.sort;

import java.util.Arrays;

public class Sort02SelectionSort {

    // 2.选择排序：每一轮从待排序的元素中选出最小一个元素，记录元素位置，与当前轮的队首元素交换。
    // 本应进行n轮，但其实第n轮剩下的元素就是最小的，所以第n轮可以忽略，只进行n-1轮。
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {//同理，进行n-1次排序
            //找出当前轮最小的元素，记录其位置minIndex
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 将该元素 arr[minIndex] 与队首元素 arr[i] 交换
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    // 平均时间复杂度：O(n^2)，在大型列表和实际应用中效率低下。但是简单，是向初学者教授排序的好算法。
    // 平均空间复杂度：O(1)
    // 稳定性：不稳定，主要是相同元素排序后的相对次序会和原相对次序不同。
    // 简单地说就是所有相等的数经过某种排序方法后，仍能保持它们在排序之前的相对次序，我们就说这种排序方法是稳定的。反之，就是非稳定的。

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        Sort02SelectionSort.selectionSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
