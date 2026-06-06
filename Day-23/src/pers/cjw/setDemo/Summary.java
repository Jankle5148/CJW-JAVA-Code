package pers.cjw.setDemo;

public class Summary {
    public static void main(String[] args) {

        //ArrayList：
        // 当需要集合中的元素 可以重复 且 频繁进行查找操作 时，选择ArrayList。
        // 它基于数组（顺序表）结构，支持快速的随机访问，是最常用的集合之一。

        //LinkedList：
        // 当需要集合中的元素 可以重复 ，并且操作中 增删操作明显多于查询操作 时，选择LinkedList。
        // LinkedList基于链表结构，插入和删除操作效率较高。

        //HashSet：
        // 当需要集合中的元素 去重 且 不需要元素的顺序 时，选择HashSet。
        // HashSet基于哈希表结构，是最常用的去重集合，查找和插入效率高。

        //LinkedHashSet：
        // 当需要集合中的元素 去重 ，同时需要 保证元素的存取顺序（插入顺序） 时，选择LinkedHashSet。
        // LinkedHashSet基于哈希表和双链表，能保留元素的插入顺序，但相较于HashSet效率稍低。
    }
}
