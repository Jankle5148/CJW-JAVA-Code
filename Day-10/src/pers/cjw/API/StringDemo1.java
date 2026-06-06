package pers.cjw.API;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //java.lang.String就是一个常见的类，不需要导包
        //字符串可以比较、替换、截取、查找、切割、检索、加密、翻转等等。
        //要学习String StringBuilder StringBuffer Pattern Matcher等，就可以应对上面的操作了

        String name1 = "陈俊文";
        String name2 = "是帅b";
        System.out.println(name1 + name2);//拼接

        //注意上面的操作中，没有修改字符串其中的某一个字符，因为创建的字符串对象的内容是不能发生改变的。
        //所以改变旧的值，无法直接修改，只能用新的值去覆盖他。
        //可以直接覆盖旧值吗？
        name1 = "陈俊豪";
        System.out.println(name1);
        //不是的，虽然最后name1确实等于陈俊豪，但在底层，不是直接拿新值覆盖旧值，
        //而是根据新值创建了一个字符串，再将新字符串的值覆盖原字符串的旧值。

        //创建字符串的几种方法
        //1.直接构造
        String name3 = "ckh";
        System.out.println(name3);

        //2.无参构造 空字符串
        String name4 = new String();
        System.out.println(name4);

        //3.有参构造
        String name5 = new String("wzs");
        System.out.println(name5);

        //4.传参一个字符数组，将字符连起来形成字符串
        char[] c = {'a', 'b', 'c', 'd'};
        String name6 = new String(c);
        System.out.println(name6);

        //5传参一个字节数组，将字符连起来形成字符串
        byte[] b = {'1', '2', '3', '4', '5'};
        String name7 = new String(b);
        System.out.println(name7);

        //最常见的还是第一种
        //前面说过字符串不能直接修改其中的单个字符，但是数组传参可以，直接修改数组元素即可
        //所以修改字符串：字符串变数组，修改数组，变回字符串
        //并且网络中传输的大多是字节，此时可以用到第五种
    }
}