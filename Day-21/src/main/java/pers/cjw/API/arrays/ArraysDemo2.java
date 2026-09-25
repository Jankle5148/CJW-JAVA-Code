package pers.cjw.API.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {

        //public static void sort(数组, 排序规则)    按照指定的规则排序

        //参数一: 要排序的数组
        //参数二: 排序的规则

        //细节:
        //- 只能给引用数据类型的数组进行排序
        //- 如果数组是基本数据类型的,需要变成其对应的包装类

        //一个Integer数组
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //底层原理:
        //利用插入排序 + 二分查找的方式进行排的。
        //默认把0索引的数据当做是有序的序列, 1索引到最后认为是无序的序列。
        //遍历无序的序列得到里面的每一个元素,假设当前遍历得到的元素是A元素
        //把A往有序序列中进行插入,在插入的时候,是利用二分查找确定A元素的插入点。
        //拿着A元素,跟插入点的元素进行比较,比较的规则就是compare方法的方法体
        //如果方法的返回值是负数,拿着A继续跟前面的数据进行比较
        //如果方法的返回值是正数,拿着A继续跟后面的数据进行比较
        //如果方法的返回值是0,也拿着A跟后面的数据进行比较
        //直到能确定A的最终位置为止。

        //compare方法有两个传参 o1 和 o2，他的特点是：
        //如果返回值为负，Comparator 会将 传参1 放 传参2 前面。
        //如果返回值为正，Comparator会将 传参1 放 传参2 前面。
        //所以我们可以重写方法，来定义 如何返回 可以让 两个传参按照我们的想法进行放置。

        //参数一 o1: 表示在无序序列中的每一个元素
        //参数二 o2: 有序序列中的元素。

        //我们发现：
        //如果o1比o2小，就要把o1放前面，于是返回值要为负，刚好因为o1小于o2，所以o1 - o2为负，可以使得o1在前。
        //如果o1比o2大，就要把o1放后面，于是返回值要为正，刚好因为o1大于o2，所以o1 - o2为正，可以使得o1在后。
        //于是我们选择将返回值，定为o1 - o2

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });



        System.out.println(Arrays.toString(arr));

    }
}
