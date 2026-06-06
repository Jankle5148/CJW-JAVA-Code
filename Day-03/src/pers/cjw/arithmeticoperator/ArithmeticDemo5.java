package pers.cjw.arithmeticoperator;

public class ArithmeticDemo5 {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        //前自增，先增后用。
        //a先加1等于11，b等于a等于11.
        //前自减同理

        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        //后自增，先用后增。
        //d先等于c等于10.c再加1等于11.
        //后自减同理

        //通常情况前自增自减，加号在前

        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //输出结果 12 10 12

    }
}
