package pers.cjw.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {

        //迭代器的细节注意点：
        //1.报错NoSuchElementException
        //2.迭代器遍历完毕，指针不会复位
        //3.循环中只能用一次next方法
        //4.迭代器遍历时，不能用集合的方法进行增加或者删除

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //当上面循环结束之后，迭代器的指针事实上已经指向了最后没有元素的虚空位置。
        //此时调用it.next()返回元素，是会报错的NoSuchElementException（没有此元素异常）
        //System.out.println(it.next());

        //迭代器遍历完毕后，指针不会想循环队列那样又回到0索引。
        //指针指向虚空位置，it.hasNext()就是看虚空位置有无元素，很显然没有，于是返回false。
        System.out.println(it.hasNext());//返回false

        //如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }

    }
}
