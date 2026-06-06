package pers.cjw.genericsDemo;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {

        //  泛型Generics。
        //  是JDK5中引入的特性，把运行时期的问题提前到了编译期间,在编译阶段就约束了操作的数据类型。而不是运行时。
        //  泛型的定义格式：<数据类型>: 只能写引用数据类型，如果想写基本数据类型，需要写包装类
        //  泛型就是一个看门大爷。

        //约束集合操作的数据类型为string，所以只能增删改查string.
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        //如果不用泛型进行约束，会发现操作的数据类型是object，也就是什么类型都可以传。
        //传进去没问题，但会导致集合内非常混乱，充满了各种不同类型的元素。
        //不好实现统一操作（比如遍历），虽然都可以用object接收，但是后续无法调用各个子类的不同功能。

        //所以推出了泛型进行操作数据类型的约束。
        //把运行时期的问题提前到了编译期间,在编译阶段就约束了操作的数据类型。

        //==============================================================================================================
        //泛型底层原理:
        //但是java的泛型其实是伪泛型，也就是一个假保安。
        //他对进来的数据说：我放你进去没问题，但你在里面要以Object自居，等你出来再变回本来的身份。
        //比如string他会放进去，但进去后集合他们就是object身份，集合把他们当object处理他们。
        //等他们出来的时候，集合再将他们强转成原身份string。

        //于是我们会看到，在编写java文件的时候我们指定的泛型，当java文件编译成字节码文件后泛型就消失了，意味着底层统一当作Object处理。
        //java文件中：ArrayList<String> list = new ArrayList<>();
        //编译成class文件会看到class文件中：ArrayList list = new ArrayList();
        //这种现象叫做泛型擦除。

        //1.为什么不能写基本数据类型，因为基本数据类型不是类，不继承于Object，进去之后没办法变成Object类，只能写他们的包装类才可以。
        //2.多态：传参可以传泛型的子类，比如泛型为people，传子类student当然可以，因为student也是people。（但不要这么干，最好直接严格约束）
        //3.如果不用泛型进行约束，默认是object，也就是什么类型都可以传。

    }
}
