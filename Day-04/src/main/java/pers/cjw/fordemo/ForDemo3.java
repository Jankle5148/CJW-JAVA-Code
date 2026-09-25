package pers.cjw.fordemo;

public class ForDemo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        //快捷根据循环次数生成for循环：次数.fori
        //如循环100次：100.fori
    }
}
