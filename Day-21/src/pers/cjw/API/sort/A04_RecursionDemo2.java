package pers.cjw.API.sort;

public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        //需求：利用递归求5的阶乘
        //5！ = 5 * 4 * 3 * 2 * 1;

        //核心：
        //1.找出口 2.找规律

        //5！ = 5 * 4!;
        //4！ = 4 * 3!;
        //3！ = 3 * 2!;
        //2！ = 2 * 1!;
        //1！ = 1;

        System.out.println(getFactorialRecursion(5));//120


    }

    public static int getFactorialRecursion(int number) {//5 !
        if (number == 1) {
            return 1;
        }

        return number * getFactorialRecursion(number - 1);
    }


}
