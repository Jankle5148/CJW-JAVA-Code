package pers.cjw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //集合ArrayList：长度可变的容器
        //存进一个数据后，容器自动扩容，长度+1
        //数组和集合的区别:
        //数组：既可以存基本数据类型，也可以存引用数据类型，但一旦定义就无法扩容。
        //集合：只能存引用数据类型，但是可以扩容。
        //要存基本数据类型，也有办法，但要存他们原有的包装类，类有属于引用数据类型，所以可以存。

        //定义一个集合，首先要确定集合内的数据类型，用<>写上
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//结果是[]，ArrayList打印时会拿[]进行包装

    }
}
