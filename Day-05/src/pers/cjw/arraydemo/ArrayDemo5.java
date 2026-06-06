package pers.cjw.arraydemo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //动态初始化，只定义数组长度，不初始化值，系统分配初始值
        String[] s = new String[50];
        s[0] = "hhhh";
        s[1] = "you";
        for (int i = 0; i < 50; ++i) {
            System.out.println(s[i]);
        }
        //后面的全为null，说明系统分配的初始值为null
        //但不是所有类型数组初始都是null
        //整数：默认0
        //小数：默认0.0
        //字符：默认'/u0000'即一个空格
        //布尔：默认false
        //引用数据类型（包括字符串）：默认null

        //动态初始化：只知道数组元素个数的时候可以用
        //静态初始化：知道数组元素值的时候可以用

        //当访问的下标（索引）越界了，就会报错，如s[50]就会异常，因为下标最大49
    }
}
