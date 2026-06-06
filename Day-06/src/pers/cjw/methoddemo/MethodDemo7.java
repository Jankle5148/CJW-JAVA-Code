package pers.cjw.methoddemo;

public class MethodDemo7 {
    public static void main(String[] args) {
        //定义一个方法printArray，能够在一行内输出数组，
        //如[11,22,33,44,55]，包括中括号和逗号
        int[] array = {11, 22, 33, 44, 55};
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; ++i) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.print("]");
    }
}
