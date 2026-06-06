package pers.cjw.arraydemo;

public class ArrayTips {
    public static void main(String[] args) {
        //想要打印一个数组，可以用以下两种for循环
        int[] tip = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < tip.length; ++i) {
            System.out.print(tip[i] + " ");
        }

        System.out.println();

        for (int j : tip) {
            System.out.print(j + " ");
        }

        //这两个for循环是等效的
        //后面这个方法是一个快捷形式
    }
}
