package pers.cjw.genericsDemo;


public class GenericsDemo3 {
    public static void main(String[] args) {

        //定义泛型为 Integer 的 MyArrayList 对象 list1
        MyArrayList1<Integer> list1 = new MyArrayList1<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1.toString());

        //定义泛型为 String 的 MyArrayList 对象 list2
        MyArrayList1<String> list2 = new MyArrayList1<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        System.out.println(list2.toString());

        //泛型非常好用。
        //如果有很多个结构、方法非常雷同的类，仅有一些成员变量和传参的类型不同。
        //就可以定义一个泛型类即可。等到创建对象的时候由用户自己确定类。

        //java自己的ArrayList就是这么做的。
        //它不需要做很多个针对各个类型的ArrayList类，因为大家结构、方法太相似了。
        //它只需要做一个泛型类，然后留个泛型给你，你自己决定泛型，就得到了你想要的ArrayList。
        //同理，其他的集合类型也是一样。


    }
}
