package pers.cjw.collectionDemo;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        //数组和集合的区别
        //相同点:都是容器,可以存储多个数据。
        //不同点:
        //(1)数组的长度不可变的,集合的长度是可变
        //(2)数组可以存基本数据类型和引用数据类型，集合只能存引用数据类型,如果要存基本数据类型,需要存对应的包装类。

        //集合有多种类型，但整体可分为两类：Collection（单列结合） 和 Map（双列集合）
        //Collection是单列集合的 顶层接口，他的实现类有：
        //List系列：ArrayList、LinkedList、Vector（这个几乎不用，已经过时）等
        //Set系列：HashSet（包含LinkedHashSet）、TreeSet等。

        //List：
        //（1）有序：先存a后存b，那么数组中a一定在b前面.
        //（2）可重复：可以存多个a
        //（3）有索引：每个元素有自己的索引

        // Set：
        //（1）无序：先存a后存b，也不知道ab在数组中的顺序。
        //（2）不重复：只能存1个a
        //（3）无索引：每个元素没有索引

        //List“秩序井然”，Set“杂乱无章”

    }
}
