package pers.cjw.API.integer;

public class IntegerDemo1 {
    public static void main(String[] args) {

        // 基本类型与引用类型，使用基本类型在于效率。
        // 然而很多情况，会创建对象使用，因为对象可以做更多的功能。
        // 如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类。

        //jdk5以前，用下面两个过时方法创建包装类对象
        //public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        Integer i1 = new Integer(100);
        //public Integer(String s)：根据 String 值创建 Integer 对象(过时)
        Integer i2 = new Integer("100");
        //打印不会报错，但是会报红。

        //==============================================================================================================
        //jdk6以后，用静态方法获取对象

        //valueOf(int i)：返回表示指定的 i 值的 Integer 实例
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);
        //因为将int转为integer，系统觉得多此一举，所以甚至可以直接Integer i3 = 100;

        //public static Integer valueOf(String s)：返回保存指定String值的Integer对象
        Integer i4 = Integer.valueOf("200");//string转integer，要用valueOf
        System.out.println(i4);

        //==============================================================================================================
        //int转特定进制的字符串：

        //string toBinaryString(int i) 得到二进制字符串
        //string toOctalString(int i) 得到八进制字符串
        //string toHexString(int i) 得到十六进制字符串

        //1.int转二进制字符串
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);//1100100

        //2.int转八进制字符串
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);//144

        //3.int转十六进制字符串
        String str3 = Integer.toHexString(100);
        System.out.println(str3);//64

        //==============================================================================================================
        //int parseInt(string s) 将字符串类型的整数转成int类型的整数
        //强类型语言:如果一个语言中，不是同一种数据类型，无法直接计算的，就是强类型语言。

        int i = Integer.parseInt("123");//string转int
        System.out.println(i);
        System.out.println(i + 1);//124

        //string转int：Integer 的 parseInt 方法
        //string转Integer：Integer 的 valueOf 方法

        //==============================================================================================================

        //因为int是数字，所以在类型转换的时候，括号中的参数只能是数字不能是其他，否则代码会报错
        //8种包装类当中，除了Character都有对应的parseXXX的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);//string转boolean，得到b = true
        System.out.println(b);


    }
}
