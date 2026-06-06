package pers.cjw.skiploop;

public class SkipLoopDemo3 {
    public static void main(String[] args) {
        //逢7过，包含7或是7的倍数，跳过不输出，从1开始
        for (int i = 1; i <= 100; ++i) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {//7的倍数、个位为7、十位为7均跳过
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
