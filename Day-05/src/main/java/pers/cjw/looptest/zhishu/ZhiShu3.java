package pers.cjw.looptest.zhishu;

public class ZhiShu3 {
    public static void main(String[] args) {

        //循环输出从2开始的每一个数是质数还是合数
        int num = 2;//第一个除数从2开始

        while (num < 100000000) {

            if (num <= 10) {//当输入的数小于等于10时，用ZhiShu1的方法即可
                ZhiShu1.isPrime(num);

            } else {//当输入的数大于等于10时，用ZhiShu2的方法减少计算量
                ZhiShu2.isPrime(num);
            }

            //进行下一个数的判断
            ++num;

        }
    }
}
