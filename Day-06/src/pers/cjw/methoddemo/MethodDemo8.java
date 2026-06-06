package pers.cjw.methoddemo;

public class MethodDemo8 {
    public static void main(String[] args) {
        //定义一个方法，返回一个数组的最大值
        int[] array = {11, 22, 33, 44, 55};
        System.out.println(returnMax(array));
    }

    public static int returnMax(int[] array) {
        int max = array[0];//设最大值初始值为数组第1个元素
        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= max) {
                max = array[i];//如大于最大值，那就覆盖最大值
            }
        }
        return max;//返回最大值
    }
}
