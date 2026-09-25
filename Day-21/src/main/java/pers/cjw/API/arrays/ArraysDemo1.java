package pers.cjw.API.arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {

        //Arrays:对数组进行操作的工具类.

        // 1.toString: 将数组变成字符串
        System.out.println("----------------toString-------------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        // 2.binarySearch: 二分查找元素（数组必须升序）
        System.out.println("----------------binarySearch---------------");
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 20));//-11
        //元素不存在，返回-（插入点）-1
        //因为20不存在，所以我们假设把20放进数组里，他将插入在第10号位置，所以是-10-1=-11

        // 3.copyOf: 拷贝数组
        System.out.println("----------------copyOf---------------------");
        int[] newArr1 = Arrays.copyOf(arr, 20);
        int[] newArr2 = Arrays.copyOf(arr, 5);
        int[] newArr3 = Arrays.copyOf(arr, 10);
        //将arr拷贝进一个长度位20的新数组里，剩下的元素初始值为0
        //新数组长度>老数组长度：拷贝后，多出来的元素置0
        //新数组长度<老数组长度：旧数组以新数组长度，部分拷贝到新数组。
        //新数组长度=老数组长度：完全拷贝。
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        System.out.println(Arrays.toString(newArr3));

        // 4.copyOfRange: 拷贝数组（指定范围）
        System.out.println("----------------copyOfRange----------------");
        int[] newArr4 = Arrays.copyOfRange(arr, 0, 9);
        //包左不包右，将旧数组0-8位共9个元素，拷贝成一个新数组。
        System.out.println(Arrays.toString(newArr4));

        // 5.fill: 填充数组
        System.out.println("------------------fill---------------------");
        Arrays.fill(arr, 100);//不管arr初值，将arr全部填充为100
        System.out.println(Arrays.toString(arr));

        // 6.sort: 排序。默认情况下为快速升序排序。
        System.out.println("-------------------sort--------------------");
        int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }
}
