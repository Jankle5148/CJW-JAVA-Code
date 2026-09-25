package pers.cjw.arrayListDemo;

public class ArrayListDemo {

    //ArrayList底层原理：
    //（1）初始创建：使用无参构造方法创建 ArrayList 时，底层会初始化一个长度为 0 的数组。
    //（2）添加第一个元素：当第一个元素被添加时，底层会创建一个新的数组，长度为 10。
    //（3）扩容机制：当 ArrayList 存满时（即达到当前数组的容量），会进行扩容，容量增加到原来的 1.5 倍。

    //当一次添加多个元素，比如直接将一个list1添加到一个新的list2时，新的list2长度以实际长度为准。
    //如list1有100个元素。无list2。
    //（1）ArrayList<String> list2=new ArrayList<>();此时初始化一个list2，为长度为0的数组。
    //（2）list2.add(list1);//创建新数组，大小以实际情况为准，也就是100个，新的地址值赋给list2，然后list1元素全部加进去，共100个。

    // 如list1有100个元素。list2有10个元素。
    //list2.add(list1);//创建新数组，大小以实际情况为准，也就是110个，新的地址值赋给list2，然后list1元素全部加进去，共110个。

    //具体实现看源码笔记，多，但是不难。

}
