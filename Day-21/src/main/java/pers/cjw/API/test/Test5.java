package pers.cjw.API.test;

public class Test5 {
    public static void main(String[] args) {

        //爬楼梯，每次可以爬1阶、2阶、3阶
        //计算爬到20阶有多少种爬法。

        //f(1)：1种
        //f(2)：从0阶爬上来 或 从1阶爬上来，1+f(1)=2种
        //f(3)：从0阶爬上来 或 从1阶爬上来 或 从2阶爬上来 1+f(1)+f(2)=4种
        //f(3)：从1阶爬上来 或 从2阶爬上来 或 从3阶爬上来 f(1)+f(2)+f(3)

        //变形斐波那契。
        //方法1；使用递归算法。
        System.out.println(FeiBo(20));

        //方法2：不用递归，使用动态规划：第三个月即数组从第2位开始，数组第i位 = 数组第i-1位 + 数组第i-2位
        int[] num = new int[20];
        num[0] = 1;
        num[1] = 2;
        num[2] = 4;
        for (int i = 3; i < num.length; ++i) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
        }
        System.out.println(num[num.length - 1]);//输出最后一位。

    }

    public static int FeiBo(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        return FeiBo(i - 1) + FeiBo(i - 2) + FeiBo(i - 3);
    }

}
