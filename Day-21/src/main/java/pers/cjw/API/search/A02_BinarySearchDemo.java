package pers.cjw.API.search;

public class A02_BinarySearchDemo {
    public static void main(String[] args) {

        //二分查找/折半查找：每次将查询范围缩小一半
        //二分首尾俩指针，小中左，大中右（num小，让max在mid左，num大，让min在mid右）

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数组和要查找的元素。
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 150));

    }

    //传入要查询的数组和元素，判断元素是否存在，返回值为int，是元素在数组中的位置:
    public static int binarySearch(int[] arr, int number) {

        //1.定义首位两个指针
        int min = 0;
        int max = arr.length - 1;

        //2.利用循环不断的去找要查找的数据
        while (true) {

            //如果min已经移动到比max还高，说明已经查询完毕了
            if (min > max) {
                return -1;
            }

            //如果运行到这，说明还能查
            //从min和max的中间位置mid开始查找
            int mid = (min + max) / 2;

            //mid元素和查找元素进行比较
            if (number < arr[mid]) {
                //如果number在mid的左边，min不变，max到中间位置的左边，实现范围减半。
                max = mid - 1;
            } else if (number > arr[mid]) {
                //如果number在mid的右边，max不变，min到中间位置的右边，实现范围减半。
                min = mid + 1;
            } else {
                //剩下一种情况，number跟mid元素一样，直接就找到了，此时返回mid的位置。
                return mid;
            }

        }
    }
}
