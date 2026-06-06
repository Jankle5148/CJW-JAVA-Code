package pers.cjw.API.test;

public class Test3 {
    public static void main(String[] args) {

        //有一堆桃子，猴子第一天吃了其中一半，并多吃了一个！
        //以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        //第10天的时候（还没吃），发现只剩下一个桃子了。请问，最初总共多少个桃子？

        //day10:  1
        //day9:   (day10 + 1) * 2  = 4
        //day8:   (day9 + 1) * 2   = 10

        //1.出口：day== 10  剩下1
        //2.规律：前一天的桃子数量 是后一天数量 加1再乘以2

        //方法1：递归
        System.out.println(method(1));

        //方法2：动态规划。数组从第三位开始，数组第i位 = 数组第i-1位 + 数组第i-2位
        int[] num = new int[10];
        num[9] = 1;
        for (int i = 8; i >= 0; --i) {
            num[i] = (num[i + 1] + 1) * 2;
        }
        System.out.println(num[0]);//输出最后一位。


    }

    public static int method(int i) {

        //健壮性
        if (i <= 0 || i >= 11) {
            System.out.println("当前时间错误");
            return -1;
        }

        if (i == 10) {
            return 1;
        }

        return (method(i + 1) + 1) * 2;
    }
}
