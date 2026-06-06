package pers.cjw.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //一个数组存储1-100,并统计数组中有多少个可被3整除的数字

        int[] n = new int[100];
        int count = 0;//计数器
        for (int i = 0; i < 100; ++i) {
            n[i] = i + 1;
            if (n[i] % 3 == 0) {
                ++count;
            }
        }
        System.out.println("数组中能被3整除的数字有：" + count + "个");
    }
}
