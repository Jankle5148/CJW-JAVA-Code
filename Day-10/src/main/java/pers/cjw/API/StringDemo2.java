package pers.cjw.API;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //基本数据类型的==：值是否相等。
        //引用数据类型的==：地址是否相等。
        //string有new，所以是是引用数据，那么new出来的字符串自然在堆内存里
        //但是：直接赋值的字符串：放在方法区中一块专门的StringTable字符串常量值，简称串池。

        //当直接创建字符串时，检测串池有没有该字符串。
        //没有，在串池开辟空间创建字符串，并返回地址
        //有，复用该字符串，即直接返回地址

        String name1 = "abc";//abc进串池
        String name2 = "abc";//串池已有abc，name2复用name1的地址
        System.out.println(name1 == name2);//比较地址，结果true

        String name3 = "abc";//串池已有abc，name3复用name1的地址，是一个串池地址
        String name4 = new String("abc");//在堆内存new一个abc，返回一个堆内存地址
        System.out.println(name3 == name4);//比较地址，结果false

        //那该怎么比较？
        //equals()方法：不管地址，只比较字符串是否完全一样，返回值是boolean
        System.out.println(name3.equals(name4));//比较字符串，true

        //equalsIgnoreCase()方法:忽略大小写的比较
        String name5 = new String("ABC");
        System.out.println(name3.equalsIgnoreCase(name5));//比较字符串，true

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String name6 = sc.next();//层层查看底层代码，最后得到键盘录入的字符串是new出来的，所以是在堆内存
        System.out.println(name1 == name6);//比较地址，false

        //所以，要比较字符串内容是否相同，必须写equals方法，不能用==，因为不知道地址到底在哪里！

    }
}
