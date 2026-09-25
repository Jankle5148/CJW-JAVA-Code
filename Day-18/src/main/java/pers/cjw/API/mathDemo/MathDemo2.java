package pers.cjw.API.mathDemo;

public class MathDemo2 {
    public static void main(String[] args) {

        //判断100 ~ 999有多少水仙花数: 每位的3次方之和为该数
        //举例1：1^3 + 5^3 + 3^3 = 153
        narcissusCount();

        //判断1000 ~ 9999有多少四叶玫瑰数: 每位的4次方之和为该数
        //举例2：四位数  1^4 + 6^4 + 3^4 + 4^3 = 1634
        roseCount();
    }


    private static void narcissusCount() {

        //计数器
        int count = 0;

        //对每一个三位数进行计算
        for (int i = 100; i <= 999; i++) {

            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //计算每一位的三次方之和 跟本身 进行比较，如果相同计数器+1。
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
            }
        }

        //输出数量
        System.out.println("100 ~ 999的水仙花数有"+count+"个。");
    }


    private static void roseCount() {

        int count = 0;

        //对每一个三位数进行计算
        for (int i = 1000; i <= 9999; i++) {

            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            //计算每一位的三次方之和 跟本身 进行比较，如果相同计数器+1。
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                ++count;
            }
        }

        //输出数量
        System.out.println("1000 ~ 9999的四叶玫瑰数有" + count + "个。");
    }
}
