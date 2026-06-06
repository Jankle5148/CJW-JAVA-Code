package pers.cjw.arithmeticoperator;

public class ArithmeticDemo6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        a += b;
        System.out.println(a);
        System.out.println(b);
        //等价于a=a+b
        //左加右赋给左，但是底层都有一个隐藏的强制类型转换，会把结果强制转换成左边的类型，以免报错

        int c = 10;
        double d = 13.9;
        c += d;
        System.out.println(c);
        System.out.println(d);
        //c+=d等价于c=c+d
        //1.隐藏转换,先确保两个运算数类型一样，于是把c转换成double类型和d相加
        //2.得到的double结果23.9
        //3.又结果c为int类型，由底层强制转换成int类型变成23
        //运行时提示：复合赋值中从 'double' 到 'int' 的隐式转换可能是有损的

        //+=、-=、*=、\=、%=同理
    }
}
