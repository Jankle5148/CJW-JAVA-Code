package pers.cjw.API.objectDemo;

public class ObjectDemo3 {
    public static void main(String[] args) {


        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));
        //这个 equals 是s中的方法，即字符串的 equals 方法，
        //string 的 equals 方法会判断传参 sb 是否为字符串，如果是字符串，再判断值是否相等
        //sb 首先当然不是字符串，所以直接 false 了。

        System.out.println(sb.equals(s));
        //查看 StringBuilder 类源码，没有自己的 equals() 方法。
        //所以他会默认继承 object 的 equals() ，并且 StringBuilder 没有重写这个 equals 方法。
        //object 的 equals() 方法比较的是地址，如果地址相同true，反之false.


    }
}
