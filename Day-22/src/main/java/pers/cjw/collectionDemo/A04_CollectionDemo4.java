package pers.cjw.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {

        //利用迭代器去删除集合中的特定元素：

        //1.定义集合，添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        //2..定义迭代器。
        Iterator<String> it = list.iterator();

        //3.如果当前位置有元素，先获取出来。
        //然后判断跟要删除的元素是否equal，如果equal，说明这就是要删的元素，利用迭代器进行删除。
        while (it.hasNext()) {
            String s = it.next();
            if ("b".equals(s)) {
                it.remove();
                //注意：在迭代器遍历的过程中，不能用集合的方法增删，只能用迭代器的方法增删
            }
        }

        //4.打印
        System.out.println(list);


    }
}
