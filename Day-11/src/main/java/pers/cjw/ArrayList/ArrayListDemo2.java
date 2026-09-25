package pers.cjw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //集合的增删改查
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list2);

        //1.boolean add(数据):增加数据，返回Boolean值，是否成功
        boolean b1 = list2.add("aaa");
        System.out.println(b1);
        //事实上，不管添加什么，恒为true。所以拿一个boolean接收没有意义。
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");
        System.out.println(list2);//得到[aaa, bbb, ccc, ddd]

        //2.boolean remove（数据）：移除数据，返回Boolean值，是否成功
        boolean b2 = list2.remove("eee");
        boolean b3 = list2.remove("ccc");
        //当找不到删除的数据时，就会失败。
        //所以最好拿一个boolean接收，看到底是成功了还是失败了。
        System.out.println(b2);//失败
        System.out.println(b3);//成功
        System.out.println(list2);//得到[aaa, bbb, ddd]

        //3.E remove（第几位）：返回第几位数据，并且移除数据
        String s1 = list2.remove(1);//remove:先返回，再移除
        System.out.println(s1);
        System.out.println(list2);//得到[aaa, ddd]

        //4.E set（第几位，数据）：在第几位设置新数据，并返回原先的数据
        String s2 = list2.set(0, "ggg");//0位为aaa，重置为ggg
        System.out.println(s2);//返回旧数据aaa
        System.out.println(list2);//得到[ggg, ddd]

        //E get（第几位）：得到第几位数据。
        String s3 = list2.get(1);
        System.out.println(s3);//"ddd"

        //int size（）：集合长度。
        System.out.println(list2.size());//2
    }
}
