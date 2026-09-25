package pers.cjw.dowhiledemo;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        //dowhile和while的区别非常简单
        //dowhile：先做 后判断
        //while：先判断 后做

        int a = 0;
        do {
            ++a;
            System.out.println(a);
        } while (a < 10);//注意有分号

        //由此可见，不管怎样do while至少会执行一次，
        //如果执行完一次就无法通过while中条件，循环结束
    }
}
