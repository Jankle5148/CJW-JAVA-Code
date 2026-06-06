package pers.cjw.listDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A02_ListDemo2 {
    public static void main(String[] args) {

        //List集合的五种遍历方式：
        //1. 迭代器：遍历过程要删元素用。
        //2. 列表迭代器：遍历过程要加元素用。
        //3. 增强for：仅遍历时用。
        //4. Lambda表达式：仅遍历时用。
        //5. 普通for循环：遍历时想操作索引时用。

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        //Iterator<String> it = list.iterator();
        //while (it.hasNext()) {
        //    String str = it.next();
        //    System.out.println(str);
        //}

        //2..列表迭代器ListIterator接口：Iterator的子接口
        //调用list集合的获取一个列表迭代器ListIterator的对象，里面的指针也是默认指向0索引。
        //遍历与不同迭代器遍历几乎无差别。
        //ListIterator<String> it = list.listIterator();
        //while (it.hasNext()) {
        //    String str = it.next();
        //    System.out.println(str);
        //}

        //3.增强for
        //for (String s : list) {
        //    System.out.println(s);
        //}

        //4.Lambda表达式
        //list.forEach(s->System.out.println(s));

        //5.普通for循环
        //for (int i = 0; i < list.size(); i++) {
        //    String s = list.get(i);
        //    System.out.println(s);
        //}

        //拓展一下：
        //普通的迭代器：删除元素只能用迭代器删。完全不能加元素。
        //列表迭代器：加元素只能用列表迭代器删，删元素只能用集合删。

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            if ("bbb".equals(str)) {
                it.add("qqq");
                list.remove("aaa");
            }
        }
        System.out.println(list);//[bbb, qqq, ccc]

    }

}
