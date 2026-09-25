package pers.cjw.setDemo;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo {
    public static void main(String[] args) {

        // LinkedHashSet：一种特殊的HashSet。
        // 特点：有序、不重复、无索引。

        // 为什么LinkedHashSet就可以有序？
        // 底层原理：依然由哈希表实现，只是多了一个双链表机制。
        // 第一个元素存进去后，会有一个头指针指向第一个元素，表示如果要遍历，从这里开始。
        // 第二个元素存进去后，会和第一个元素互相保存地址值（互相有指针），从而和第一个元素形成一个双链表。
        // 第三个元素存进去后，会和第二个元素互相保存地址值（互相有指针），从而和第二个元素、第一个元素形成一个双链表。
        // 依次类推。当遍历的时候，从头指针指向的元素（第一个元素）进行遍历，然后顺着双向链表的指针一路遍历下去即可。

        // 有个疑问就是，如果是上面的实现方法，是不是只要单链表即可，即每一个元素指向下一个元素即可，为什么要双链表。
        // 因为双链表查询效率高：如果查询一个靠后的元素，需要从头查询很久。而双链表可以从后往前查。

        // 但查询效率仍比普通HashSet低。
        // HashSet仅使用哈希表，因此查询、插入、删除的时间复杂度在理想情况下都是O(1)。
        // LinkedHashSet 尽管其查询时间复杂度在理想情况下也是O(1)，但由于需要额外的双链表维护，其查询效率略低于HashSet。
        // 所以LinkedHashSet相比HashSet的唯一优点：就是能有序
        // 如果要数据去重：LinkedHashSet还是普通HashSet？
        // 如果只要去重：首选HashSet。如果既要去重又要有序：首选LinkedHashSet。

        //------------------------------------------------------------------------------------------------------------
        //1.创建4个学生对象
        Student s1 = new Student("zhangSan", 23);
        Student s2 = new Student("liSi", 24);
        Student s3 = new Student("wangWu", 25);
        Student s4 = new Student("zhangSan", 23);

        //2.创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3.添加元素，顺序为s1 s2 s3 s4
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //4.打印集合，可以发现顺序和存储顺序一样！！！！！！！！！！
        System.out.println(lhs);


    }
}
