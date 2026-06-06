package pers.cjw.API.search;

public class A03_InterpolationSearchDemo {
    public static void main(String[] args) {

        //插值查找：在二分查找的基础上，优化mid位的计算方式，从而降低查找次数。
        //插值二分本无异，计算插值放mid。

        //需求：定义一个方法利用插值查找，查询某个元素在数组中的索引
        //数组和要查找的元素。
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 150));

    }

    //传入要查询的数组和元素，判断元素是否存在，返回值为int，是元素在数组中的位置:
    public static int binarySearch(int[] arr, int number) {

        //1.两个指针
        int min = 0;
        int max = arr.length - 1;

        while (true) {

            if (min > max) {
                return -1;
            }

            //插值查找与二分查找的唯一区别，mid的计算方式。
            //二分：mid在min和max正中间。
            //插值：使mid更接近查找值。
            int mid = min + (number - arr[min]) / (arr[max] - arr[min]) * (max - min);

            if (number < arr[mid]) {
                max = mid - 1;
            } else if (number > arr[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }

        }
    }
}
