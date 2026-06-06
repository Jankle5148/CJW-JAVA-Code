package pers.cjw.API.search;

public class A01_BasicSearchDemo {
    public static void main(String[] args) {
        //基本查找/顺序查找：从0索引开始挨个往后查找
        //顺序从零开始找，循环直到最末尾。

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数组和要查找的元素。
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        System.out.println(basicSearch(arr, 82));

    }

    //传入要查询的数组和元素，判断元素是否存在，返回值boolean:
    public static boolean basicSearch(int[] arr, int number) {

        //直接上循环，从第0个查到最后一个，中途找到了就返回true，查完了都没找到就返回false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}
