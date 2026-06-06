package pers.cjw.genericsDemo;

import java.util.Arrays;

public class MyArrayList1<E> {

    //成员变量为一个Object数组，所以理论上这个数组什么都能装
    Object[] obj = new Object[10];

    //当前数组已有元素个数，同时新元素来临时的插入位置
    int size;

    //插入元素，只有当真正使用时确定了E，才知道传进来的是什么数据
    public boolean add(E e) {
        //在插入位置上，插入元素
        obj[size] = e;

        //插入位置后移
        ++size;

        //插入成功返回true；
        return true;
    }


    public E get(int index) {
        return (E) obj[index];//因为是object数组，而返回值类型是E，所以进行强转
        //那些已有的很成熟的泛型类底层都是这样写的：将数组定义为object，传进来的数据因为多态可以存，返回的时候又将其强转回原类型。
    }

    //重写tostring方法（右键）
    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + Arrays.toString(obj) +
                ", size=" + size +
                '}';
    }
}
