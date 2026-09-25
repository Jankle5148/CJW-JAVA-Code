package pers.cjw.a02mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {

        //在Collections中也提供了添加“一些元素”的方法：
        //boolean addAll(Collection<T> c, T... elements)        批量添加多个元素
        //void shuffle(List<?> list)                            打乱List集合元素的顺序

        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2.addAll  批量添加元素
        Collections.addAll(list, "abc", "bcd", "qwer", "df", "asdf", "zxcv", "1234", "qwer");
        System.out.println(list);

        //3.shuffle 打乱元素顺序。
        Collections.shuffle(list);
        System.out.println(list);

    }
}
