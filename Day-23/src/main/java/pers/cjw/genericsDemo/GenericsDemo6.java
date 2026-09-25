package pers.cjw.genericsDemo;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {

        //泛型不具备继承性，但是数据具备继承性

        //创建集合的对象。
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //调用method方法，会发现只有list1可以。
        //因为泛型不具备继承性。所以这里不存在继承和多态。
        //因为泛型的约束性，约束了这个传进来的list就是处理Ye数据的，不是其他数据。
        method1(list1);
        //method1(list2);
        //method1(list3);

        //但是数据具备继承性，比如new Fu()和new Zi()都是实打实的对象，且都直接或间接继承于Ye
        //而list1的add方法传参是Ye对象就可以，所以根据多态当然可以传进去。
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());

        //method2，三种都可以传进去。
        method2(list1);
        method2(list2);
        method2(list3);

    }

    //泛型不具备继承性。
    //因为约束性，确定了这个传进来的list就是处理Ye数据的，不是其他数据，所以这里不存在继承和多态。
    //所以ArrayList<Fu>和ArrayList<Zi>对象不会传进去
    public static void method1(ArrayList<Ye> list) {

    }

    //那该如如何解决呢，比如我就想传参为ArrayList<Ye>，ArrayList<Fu>，和ArrayList<Zi>都可以。
    //很简单，使用泛型的通配符？即可
    //? extends E: 即E和E的所有子类。
    //? super E: E和E的所有父类。
    //所以这样写就可以了。
    public static void method2(ArrayList<? extends Ye> list) {

    }




}

//三个类依次继承
class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}