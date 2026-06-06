package pers.cjw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        //用集合存整数0-9，并以[0，1，2，3，4，5，6，7，8，9]的格式输出
        //使用包装类：byte-Byte，short-Short，char-Character，int-Integer，long-Long，float-Float，double-Double，boolean-Boolean

        ArrayList<Integer> list = new ArrayList<>();//存放整数的结合
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }

        //要么一个个遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); ++i) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
        System.out.println();

        //要么直接打印list
        System.out.println(list);
    }
}
