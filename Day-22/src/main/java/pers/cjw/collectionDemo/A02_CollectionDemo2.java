package pers.cjw.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {

        //| boolean add(E e)           | 添加元素                           |
        //| boolean remove(Object o)   | 从集合中移除指定的元素             |
        //| boolean removeIf(Object o) | 根据条件进行移除                   |
        //| void   clear()             | 清空集合中的元素                   |
        //| boolean contains(Object o) | 判断集合中是否存在指定的元素       |
        //| boolean isEmpty()          | 判断集合是否为空                   |
        //| int   size()               | 集合的长度，也就是集合中元素的个数 |

        Collection<String> coll = new ArrayList<>();

        //1.add：添加元素，返回值为是否成功
        coll.add("hello");//添加成功返回true（一般添加都不会失败，因为允许元素重复，且集合不限大小）
        coll.add("cjw");
        coll.add("world");
        System.out.println(coll);

        //2.remove：移除元素，返回值为是否成功.
        System.out.println(coll.remove("hello"));
        System.out.println(coll);

        //3.contains:是否包含元素,返回值为Boolean
        System.out.println(coll.contains("world"));
        //事实上：contains在底层是调用 传参 的 equals方法，去和集合元素一个个比较是否相等。有些基础类型如string不需要我们管。
        //但如果这个集合装的是自定义对象，你传入一个自定义对象，看集合中是否包含，那么一定要重写这个类的equals方法：判断其中所有属性是否对应相等。
        //为什么？如果不重写，该类的 equals 仍是 Object 的 equals 方法，去比较地址值，两个独立对象的地址值不一样，自然容易返回false。
        //重写很简单，右键点点点即可。

        //4.isEmpty：判断集合是否为空
        System.out.println(coll.isEmpty());

        //5.size：集合长度
        System.out.println(coll.size());
        //几种长度：
        //数组长度：length
        //字符串长度：length()
        //集合长度：size()

        //6.清空元素
        coll.clear();
        System.out.println(coll);

    }
}
