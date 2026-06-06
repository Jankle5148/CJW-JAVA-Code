package pers.cjw.practice;

import java.util.Random;

public class Practice6 {
    public static void main(String[] args) {
        //六个评委0-100随机打分，去掉一个最高分，一个最低分，求平均分，多用方法，后面会经常用到
        int[] score = new int[6];
        getRandomScore(score, 0, 100);//数组，分数下界，分数上界,
        printArray(score);

        int maxScore = getMax(score);
        int minScore = getMin(score);
        int totalScore = getSum(score);

        System.out.println();
        System.out.println("最高分为：" + maxScore);
        System.out.println("最低分为：" + minScore);
        int avgScore = (totalScore - maxScore - minScore) / (score.length - 2);
        System.out.println("平均分为：" + avgScore);

    }

    public static void getRandomScore(int[] arr, int lower, int upper) {
        for (int i = 0; i < arr.length; ++i) {
            Random r = new Random();
            arr[i] = lower + r.nextInt(upper + 1);
        }
    }//给数组赋随机值，给定上界和下界

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }//找到数组最大值

    public static int getMin(int[] arr) {
        int min = 100;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }//找到数组最小值

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }//求数组和

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }//打印数组，间隔一个空格

}
