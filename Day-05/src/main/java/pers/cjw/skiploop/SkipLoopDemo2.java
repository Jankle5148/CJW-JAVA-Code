package pers.cjw.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //在某一时刻跳出循环，使用if{break;}
        //总共10个包子小老虎每吃一个包子，输出一次，吃到第8个包子，输出吃不动了
        for (int i = 1; i <= 10; ++i) {
            if (i == 8) {
                System.out.println("吃不下了");
                break;
            }
            System.out.println("小老虎吃了第" + i + "个包子");
        }

        //执行了break直接跳出循环
    }
}
