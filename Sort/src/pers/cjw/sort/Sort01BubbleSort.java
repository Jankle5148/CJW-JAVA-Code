package pers.cjw.sort;

import java.util.Arrays;

public class Sort01BubbleSort {

    // 1.冒泡排序：每一轮将剩余元素的最大值“像泡泡一样”“浮”到最后，
    // 本应进行n轮冒泡，但其实第n轮剩下的元素就是最小的，所以第n轮可以忽略，只进行n-1轮冒泡。
    // 每一轮冒泡操作，从第一个元素开始向后比较，将大的交换到后面，使其“上浮”。
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {// 总共n-1轮冒泡
            for (int j = 0; j < n - i - 1; ++j) {// 每一轮要比较的元素依次-1
                if (arr[j] > arr[j + 1]) {// 如果arr[j] > arr[j + 1]
                    // 交换 arr[j]和 arr[j+1]，使arr[j]“上浮”
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // 平均时间复杂度：O(n^2)，在大型列表和实际应用中效率低下。但是简单，是向初学者教授排序的好算法。
    // 平均空间复杂度：O(1)
    // 稳定性：稳定

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        Sort01BubbleSort.bubbleSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
