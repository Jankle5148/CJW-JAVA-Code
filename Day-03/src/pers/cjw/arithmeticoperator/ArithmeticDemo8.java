package pers.cjw.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticDemo8 {
    public static void main(String[] args) {
        //三元运算符，与c++中正则表达式一样
        //计算关系表达式，true取前者，false取后者

        Scanner sc = new Scanner(System.in);
        System.out.print("输入a：");
        int a = sc.nextInt();
        System.out.print("输入b：");
        int b = sc.nextInt();
        int c = Math.max(a, b);//返回两数中较大的结果
        System.out.println(c);

        //使用三元运算符可以简化一些简单的if操作。

        //获取三个人中最高的身高
        System.out.print("输入第1个人身高：");
        int h1 = sc.nextInt();
        System.out.print("输入第2个人身高：");
        int h2 = sc.nextInt();
        System.out.print("输入第3个人身高：");
        int h3 = sc.nextInt();
        int hmax1 = Math.max(h1, h2);//h1和h2种较大的那个
        int hmax2 = hmax1 > h3 ? hmax1 : h3;//hmax1 和 h3比较，得到最大的
        System.out.println(hmax2);
        //这里其实是一个嵌套的三元运算符

        //其实找出两个数中的最大值，可以直接调用'Math.max()'
    }
}
