package pers.cjw.API;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //键盘录入字符串,判断该字符串是否对称，打印是或不是

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.next();

        //其实stringBuilder有专门反转里面内容的方法：stringBuilder下的reverse方法。返回值还是stringBuilder。
        //如果用链式编程，可以直接创建一个stringBuilder的对象，把Str存进去，然后调用Reverse方法将它逆序,再调用toString方法将它变成一个字符串，最后用一个字符串变量接收
        String result = new StringBuilder(str).reverse().toString();
        //就直接得到了逆序的字符串
        if (str.equals(result)) {
            System.out.println(str + "是对称字符串。");
        } else {
            System.out.println(str + "不是对称字符串。");
        }
    }
}
