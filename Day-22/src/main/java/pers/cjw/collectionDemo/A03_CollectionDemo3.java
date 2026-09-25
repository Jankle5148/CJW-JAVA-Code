package pers.cjw.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {

        //Collection集合的遍历方式：
        //（1）使用迭代器Iterator进行遍历
        //（2）增强for遍历
        //（3）Lambda表达式

        //1.创建集合对象
        Collection<String> c = new ArrayList<>();

        //2.添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaee");

        //3.通过集合的iterator()方法，返回一个可以遍历此集合中元素的迭代器。迭代器就是一个“遍历器”。
        //迭代器不依赖索引！！于是无索引的集合也可以用iterator遍历。
        Iterator<String> it = c.iterator();

        //4.用while循环改进元素的判断和获取。
        // hasNext名字有迷惑性：它并不判断有无下一个元素，而是判断当前位置有无元素
        //（1）如果集合有索引：
        //得到迭代器后，指针其实指向0号索引，第一次it.hasNext()判断集合0索引有无元素。
        //有，next方法会返回此元素，并将指针移到下一个索引（即便可能是个虚拟位置）。
        //（2）如果集合无索引：
        //得到迭代器后，指针其实指向任意一个有元素的位置，第一次it.hasNext()判断这个位置是否有未访问的元素。
        //有，next方法会返回此元素，并将指针移到下一个位置（即便可能是个虚拟位置）。

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        //最后一次时，指针已经指向一个虚空位置。it.hasNext()发现这个位置没有元素，于是不会进入循环，遍历结束。
        //但是指针不会复位，我们没有办法让他回到第一个索引，也就是0索引，相当于这个迭代器就是一次性的，作废了。
        //如果想再遍历一次这个集合，只能再定义一个新的迭代器去进行遍历。

    }
}
