package pers.cjw.fordemo;

public class ForDemo2 {
    public static void main(String[] args) {
        //输出1-100的和
        int sum = 0;
        for (int i = 1; i <= 100; ++i) {
            sum += i;
        }
        //for循环中的变量i，在循环结束后就会释放，下一循环又定义，循环结束又释放，如此往复
        System.out.println(sum);
    }
}
