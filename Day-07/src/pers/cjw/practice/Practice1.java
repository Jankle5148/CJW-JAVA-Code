package pers.cjw.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //卖飞机票
        //季节：旺季（5-10月）淡季（11月-来年4月）
        //舱位：头等舱、经济舱
        //折扣：旺季头等舱9折，经济舱8.5折。淡季头等舱7折，经济舱6.5折
        //输入机票原价、月份、舱位、来计算最终票价。
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票原价：");
        int price = sc.nextInt();
        System.out.print("请输入当前月份：");
        int month = sc.nextInt();
        System.out.print("1为头等舱，2为经济舱，请输入舱位：");
        int seat = sc.nextInt();
        double finalPrice = getPrice(price, month, seat);
        System.out.println("您最终的票价是："+finalPrice);
    }

    public static double getPrice(int price, int month, int seat) {
        double discount1 = 0;//头等舱折扣
        double discount2 = 0;//经济舱折扣
        if (month >= 5 && month <= 10) {
            discount1 = 0.9;
            discount2 = 0.85;
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            discount1 = 0.7;
            discount2 = 0.65;
        }
        if (seat == 1) {
            return discount1 * price;
        } else if (seat == 2) {
            return discount2 * price;
        } else {
            return 0;
        }
    }
}
