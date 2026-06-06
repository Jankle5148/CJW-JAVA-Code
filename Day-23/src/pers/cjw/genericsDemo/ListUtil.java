package pers.cjw.genericsDemo;

import java.util.ArrayList;

public class ListUtil {

    //泛型方法的声明：
    //（1）先在返回值类型前，标识符后，写上一个E，表示这是一个泛型方法
    //（2）再将方法中你所有用到泛型的的地方用E表示。
    public static <E> void addAll(ArrayList<E> list, E e1, E e2, E e3) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }


}
