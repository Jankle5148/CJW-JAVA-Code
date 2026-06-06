package pers.cjw.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {

        //方法重载，很重要。是将功能相同的一系列方法命名为相同名字。
        //判断方法重载：同类同名不同参，返回类型无所谓。
        //方法可以同名，代表这些方法的功能都是一样的。
        //传参可以不同：类型、数量、顺序不同，重载方法代表可对不同数据进行相同地处理。
        int a = sum(2, 3);
        int b = sum(3, 4, 5, 6);
        int c = sum(9, 50, 24);
        System.out.println(a);//输出结果为5
        System.out.println(b);//输出结果为18
        System.out.println(c);//输出结果为83
        //简单来说，同名方法功能相同，根据传入参数类型、数量、顺序的不同，jvm会在这些同名方法中选择最适合的那一个。

    }

    //以下是三个同名为sum的求和方法。但传参不同。
    //传两个参数，jvm就用第一个
    //传三个参数，jvm就用第二个
    //传四个参数，jvm就用第三个
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
