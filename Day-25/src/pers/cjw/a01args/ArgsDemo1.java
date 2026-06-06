package pers.cjw.a01args;

public class ArgsDemo1 {
    public static void main(String[] args) {

        //假如需要定义一个方法求和，该方法可以灵活的完成如下需求：
        //计算2个数据的和
        //计算3个数据的和
        //计算4个数据的和
        //计算n个数据的和

        System.out.println(getSum(10, 20));
        System.out.println(getSum(10, 20, 30));
        System.out.println(getSum(10, 20, 30, 40));

    }

    //我们可以方法重载：同类同名不同参，返回类型无所谓。
    //方法可以同名，代表这些方法的功能都是一样的。
    //传参可以不同：类型、数量、顺序不同，重载方法代表可对不同数据进行相同地处理。

    //计算2个数据的和，两个传参
    public static int getSum(int a, int b) {
        return a + b;
    }

    //计算3个数据的和，两个传参
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    //计算4个数据的和，两个传参
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


}
