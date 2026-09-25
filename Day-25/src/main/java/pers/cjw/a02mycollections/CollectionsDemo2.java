package pers.cjw.a02mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {

        //void sort(List<T> list)                       排序
        //void sort(List<T> list, Comparator<T> c)      根据指定的 Comparator的规则 进行排序
        //int binarySearch (List<T> list,  T key)       二分查找元素
        //void copy(List<T> dest, List<T> src)          拷贝集合中的元素
        //int fill (List<T> list,  T obj)               使用指定的元素填充集合
        //void max/min(Collection<T> coll)              根据默认的自然排序获取最大/小值
        //void swap(List<?> list, int i, int j)         交换集合中指定位置的元素


        System.out.println("--------------------sort默认规则--------------------------");
        //需要在类中重写Comparable接口compareTo方法。
        //Integer：默认规则，按照从小打大的顺序排列
        //如果是自定义对象，需要自己在类中指定”自然排序“规则
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 10, 1, 2, 4, 8, 5, 9, 6, 7, 3);
        Collections.sort(list1);
        System.out.println(list1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("------------------sort自己指定规则规则---------------------");
        //不需要在类中指定”自然排序“，但要传入一个比较器Comparator。
        //先写匿名内部类，比如逆序排列。
        //Collections.sort(list1, new Comparator<Integer>() {
        //    @Override
        //    public int compare(Integer o1, Integer o2) {
        //        return o2 - o1;
        //    }
        //});
        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);//[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]


        System.out.println("-------------------binarySearch-------------------------");
        //首先需要确保元素有序，然后通过二分查找元素，返回元素索引，如果不存在返回值为-11（之前讲过为什么）
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.binarySearch(list2, 9));//8
        System.out.println(Collections.binarySearch(list2, 1));//0
        System.out.println(Collections.binarySearch(list2, 20));//-11


        System.out.println("-----------------------copy-----------------------------");
        //把list3中的元素拷贝到list4中。会覆盖原来的元素
        //如果list3的长度 > list4的长度，方法会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);//长度为10
        Collections.addAll(list4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);//长度为15
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println(list4);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0]


        System.out.println("-----------------------fill-----------------------------");
        //把集合中现有的所有数据，都fill填充为指定数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);//首先加入10个数
        Collections.fill(list5, 100);//将其填充成全是100
        System.out.println(list5);//[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]


        System.out.println("---------------------max/min----------------------------");
        // 求最大值或者最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));//10
        System.out.println(Collections.min(list6));//1


        System.out.println("-------------------max/min并且指定规则--------------------");
        // max和min不一定是数值的 最大 和 最小，他们可以在指定规则下返回“最大”的元素和“最小”的元素
        // 比如String自然排序：按照字母的顺序进行排列。现在要求最长的字符串，默认的规则无法满足，于是写比较器Comparator，自己指定规则。
        // Collections.max的传参1为该集合，传参2为比较规则，返回值为该规则排序后，集合的最后一个元素（最“大”的元素）。
        // Collections.min的传参1为该集合，传参2为比较规则，返回值为该规则排序后，集合的第一个元素（最“小”的元素）。
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "a", "aa", "aaa", "aaaa");

        //获得该规则下最大的元素（即最长的元素）
        String max = Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        //获得该规则下最小的元素（即最短的元素）
        String min = Collections.min(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(max);
        System.out.println(min);


        System.out.println("------------------------swap----------------------------");
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8, 1, 2, 3);
        Collections.swap(list8, 0, 2);//交换0号元素和2号元素
        System.out.println(list8);


    }
}
