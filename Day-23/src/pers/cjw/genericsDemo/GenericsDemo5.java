package pers.cjw.genericsDemo;

public class GenericsDemo5 {
    public static void main(String[] args) {

        //有泛型类，就有泛型接口。在接口名后面加上一个<E>
        //泛型接口的两种使用方式，
        //1.接口的实现类给出具体的类型，于是实现类确定下来。
        //2.接口的实现类再创建对象的时候才确定类型，此时实现类才确定。

        //第1种实现方式：详见MyArrayList2类
        //因为MyArrayList2在声明时就确定了类型，于是这里创建对象不需要尖括号确定类型。
        MyArrayList2 list1 = new MyArrayList2();
        System.out.println(list1);

        //第2种实现方式：详见MyArrayList3类
        //因为MyArrayList2在声明时没有确定类型，在创建对象是才用尖括号确定类型。
        MyArrayList3<Integer> list2 = new MyArrayList3<>();
        System.out.println(list2);

    }
}
