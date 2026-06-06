package pers.cjw.API.test;

public class Test2 {
    public static void main(String[] args) {

        //有一对兔子，从出生后第三个月起，每个月就会生一对兔子（出生时算第一个月），到第12个月会有多少对兔子。

        //第1个月：第1对
        //第2个月：第1对
        //第3个月：第1对生出第2对，共1，2对。
        //第4个月：第1对生出第3对，共1，2，3对。
        //第5个月：第1对生出第4对，第2队生出第5对，共1，2，3，4，5对。
        //第6个月：第1对生出第6对，第2队生出第7对，第3对生出第8对，共1，2，3，4，5，6，7，8对。

        //可以看到：就是斐波那契数列，从第三个数据开始，该数据等于前两个数据之和.

        //方法1；使用递归算法。
        System.out.println(FeiBo(12));

        //方法2：不用递归，使用动态规划：第三个月即数组从第2位开始，数组第i位 = 数组第i-1位 + 数组第i-2位
        int[] num = new int[12];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i < num.length; ++i) {
            num[i] = num[i - 1] + num[i - 2];
        }
        System.out.println(num[num.length-1]);//输出最后一位。

    }

    public static int FeiBo(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return FeiBo(i - 1) + FeiBo(i - 2);
    }
}
