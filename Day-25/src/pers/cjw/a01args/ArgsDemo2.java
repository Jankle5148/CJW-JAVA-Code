package pers.cjw.a01args;

public class ArgsDemo2 {
    public static void main(String[] args) {

        //但是一旦计算n个数据的和，不知道n是多少，难道要写n多种方法吗？
        //最简单的一种：只写一个传参为 数组 的方法，将n个数据放在数组里传入。
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getSum(arr);
        System.out.println(sum);

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }


}
