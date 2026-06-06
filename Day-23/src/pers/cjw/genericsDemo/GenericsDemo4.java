package pers.cjw.genericsDemo;

import java.util.ArrayList;

public class GenericsDemo4 {
    public static void main(String[] args) {

        //泛型类：一般这个类中出现了非常多处会用泛型的地方，于是干脆直接将这个类设置为泛型类，然后将类中所有用到泛型的地方进行标识。
        //适用于：一些容器类，容器类、包装类等数据结构类，这些类中，很多成员变量，很多方法都用到此泛型，牵一发而动全身。

        //泛型方法:一般一个类中只有一个方法或少数方法会用到泛型，这个时候可以单独只将这个方法定义为泛型方法，然后将此方法中用到泛型的地方进行标识。、
        //适用于：一些自己编写的工具类中的方法，并且这个方法一般是一个可以对不同数据通用处理的方法。

        //1.定义一个Integer类的list
        ArrayList<Integer> list1 = new ArrayList<>();

        //2.调用泛型方法
        ListUtil.addAll(list1, 1, 2, 3);

        //详见ListUtil的addAll方法，声明为：
        //<E> void addAll(ArrayList<E> list, E e1, E e2, E e3)
        //调用的泛型方法的时候，传入的 list 为 ArrayList<Integer> 类.
        //Java 编译器会自动根据传入的参数类型推断泛型类型 <E> 的具体类型是 Integer。
        //于是他会把所有出现 E 的地方都换成 Integer，所以这个方法就变成了：
        //void addAll(ArrayList<Integer> list, Integer e1, Integer e2, Integer e3)
        //那么这时候ListUtil.addAll(list,1,2,3);就不会有任何问题。

        //3.打印list，没问题。
        System.out.println(list1);

        //==============================================================================================================
        //同理，再传入一个string的arraylist，同样可以。
        ArrayList<String> list2 = new ArrayList<>();
        ListUtil.addAll(list2, "1", "2", "3");
        System.out.println(list2);
    }
}
