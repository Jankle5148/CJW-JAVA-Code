package pers.cjw.a01args;

public class ArgsDemo4 {
    public static void main(String[] args) {

        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    //可变参数的小细节：
    //1.在方法的形参中最多只能写一个可变参数：可变参数，可以理解为一个大胖子，来多少数据吃多少数据。但一个方法只能有一个大胖子。
    //2.在方法的形参当中，如果除了可变参数以外，还有其他的形参，那么可变参数要写在最后。比如下面的int a, int... args

    public static int getSum(int a, int... args) {
        int sum = a;
        //增强for循环遍历args中的每一个元素
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
