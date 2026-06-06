package pers.cjw.a04mytreemap;

import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {

        // TreeMap集合特点：不重复、无索引、可将存入元素按规则进行排序 的 双列集合（键值对集合）。
        //底层通过红黑树实现排序。

        // 键：整数，表示id。值：字符串，表示商品名称。
        // 要求1：按照id的升序排列（这个其实不用写比较器，因为integer的自然排序就是按照升序排序）
        // 要求2：按照id的降序排列（可以写比较器）

        //--------------------------------------------------------------------------------------------------------------
        // 1.创建TreeMap集合对象，并使用比较器 根据键大小 进行排序。
        // 因为我们比较的 键的类型 为 Integer，所以将接口 Comparator 的泛型定为 Integer。
        // 这样在方法的传参处也会替换为 Integer 类型传参。

        // o1: 当前要添加的元素    o2：从红黑树抓来的元素
        // 如果o1比o2小，o1排左边，让返回值为负数，恰好o1 - o2为负数
        // 如果o1比o2大，o1排右边，让返回值为正数，恰好o1 - o2为正数
        // 升序：返回o1 - o2      降序：返回o2 - o1

        // 以要求2：降序为例：
        // 先写匿名内部类。
        // TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o1 - o2;
        //     }
        // });

        // 再将其简化成lambda表达式
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> {
            return o2 - o1;
        });

        //2.添加元素。
        tm.put(5, "可恰可乐");
        tm.put(4, "雷碧");
        tm.put(3, "九个核桃");
        tm.put(2, "康帅傅");
        tm.put(1, "粤利粤");

        //3.打印集合，会发现按照id升序排序了。
        System.out.println(tm);

    }
}
