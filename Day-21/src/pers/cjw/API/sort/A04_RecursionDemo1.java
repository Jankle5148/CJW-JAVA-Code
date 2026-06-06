package pers.cjw.API.sort;

public class A04_RecursionDemo1 {
    public static void main(String[] args) {

        //需求：利用递归求1-100之间的和
        //100 + 99 + 98 + 97 + 96 + 95 .... + 2 + 1

        //s(100)=100+s(99)
        //s(99)=99+s(98)
        //s(98)=98+s(97)
        //...
        //s(2)=2+s(1)
        //s(1)=1

        //递归核心：
        //1.找出口2.找规律

        System.out.println(getSum(100));//5050

    }


    public static int getSum(int number) {//99
        if (number == 1) {
            return 1;
        }

        //如果number不是1
        return number + getSum(number - 1);

    }
}
