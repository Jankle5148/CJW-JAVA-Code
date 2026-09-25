package pers.cjw.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        //跳过某一次循环，使用if{continue;}
        for (int i = 0; i < 10; ++i) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }//跳过3

        //当满足if条件执行continue时，就会直接跳到++i，即不执行循环内任何一条语句
    }
}
