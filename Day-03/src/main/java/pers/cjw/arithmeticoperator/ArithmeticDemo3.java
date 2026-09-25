package pers.cjw.arithmeticoperator;

public class ArithmeticDemo3 {
    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 30;
        int result = num1 + num2;
        System.out.println(result);
        //byte、short、char在运算时，都会先升为int再进行运算，比如byte+byte是int，而不是byte+byte还是byte。这是非常反直觉的。

        //如果要让两个byte相加还是byte，要把运算结果int强制转换成byte
        byte result2 = (byte) (num1 + num2);
        System.out.println(result2);
        //大转小要注意取值范围，超出小的取值范围会报错。

        //char转int，会转成该字符的ascii码
        int c = 'a';
        System.out.println(c);
        //输出结果为97

        int num3 = 10;
        double num4 = 13.4;
        System.out.println(num3 + num4);
        //取值范围小的，和取值范围大的运算，小的会先转成大的，再和大的运算，结果是大的。
        //byte<short<int<long<float<double

        //int类型转字符串可以用string.valueOf(int数据)；

    }
}
