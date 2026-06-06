package pers.cjw.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticDemo7 {
    public static void main(String[] args) {
        //关系运算符相等、不相等、大于、小于等
        //关系运算符的结果都是bool类型，要么true要么false

        // 逻辑运算符：注意或和与。
        // 或：c++中是两竖，java是一竖
        // 与：c++中是两&，java是一&
        // 异或：^ 相同为0，不同为1
        // 取反：！

        //短路或逻辑运算符|| 和 或| 的区别：
        //a|b：两边都要计算，再进行或运算，但效率低，因为只要a为true，结果必为true，不需要再看b
        //a||b：先看左边是否为true，是true，结果必为true，不再看右边。不是true，再计算右边。提高效率

        //短路与逻辑运算符&& 和 与& 的区别：
        //a&b：两边都要计算，再进行与运算，但效率低，因为只要a为false，结果必为false，不需要再看b
        //a||b：先看左边是否为false，是false，结果必为false，不再看右边。不是false，再计算右边。提高效率。
        int a = 10;
        int b = 20;
        boolean result1 = ++a > 5 && ++b < 5;
        System.out.println(result1);
        System.out.println(a);
        System.out.println(b);
        //要点：++a先加后用，&&中前者为false，已经有结果，不必计算后面的++b，b不变

        //建议使用&&和||,不仅效率更高，而且与c++习惯保持一致，适合有c++基础的人

        //练习，输入两个数，若其中一个为6，输出true，若和为6的倍数，也输出true,其余输出false
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第1个数");
        int num1 = sc.nextInt();
        System.out.println("输入第2个数");
        int num2 = sc.nextInt();
        boolean result2 = num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0;
        System.out.println(result2);
    }
}
