package pers.cjw.arraydemo;

import java.util.Scanner;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //输入两个数组索引，交换这两个数组元素。
        int[] array3 = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入要交换的元素的索引：");
        int index1 = sc.nextInt();
        System.out.print(" ");
        int index2 = sc.nextInt();

        int temp = 0;
        temp = array3[index1];
        array3[index1] = array3[index2];
        array3[index2] = temp;
        for (int i = 0; i < array3.length; ++i) {
            System.out.print(array3[i] + " ");
        }

    }
}
