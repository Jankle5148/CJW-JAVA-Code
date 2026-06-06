package pers.cjw.whiledemo;

public class WhileDemo1 {
    public static void main(String[] args) {
        //珠穆朗玛峰8844.43米=8844430毫米.
        //一张足够大的0.1毫米的纸，折多少次可以达到珠穆朗玛峰的高度。
        double a = 0.1;
        double height = 8844300;
        int sum = 0;//次数计数器
        while (a < height) {
            a *= 2;//折一次，a翻倍
            ++sum;//计数器加一
        }
        System.out.println("总共需要" + sum + "次");
    }
}
