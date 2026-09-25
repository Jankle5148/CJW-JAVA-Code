package pers.cjw.genericsDemo.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        //需求：定义一个继承结构：
        //                        动物
        //                          |
        //              ---------------------------
        //             |                           |
        //             猫                          狗
        //             |                           |
        //          --------                    --------
        //          |      |                    |      |
        //       波斯猫   狸花猫                泰迪   哈士奇


        //属性：名字，年龄
        //行为：吃东西
        //波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
        //狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
        //泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
        //哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家

        //测试类中定义几个方法用于饲养动物,传参为动物的集合list
        //格式为：
        //public static void keepPet(ArrayList<???> list){
        //    //遍历集合，调用动物的eat方法
        //}

        //第1种方法能养所有的动物，但是不能传递其他类型.
        //第2种方法能养所有品种的狗，但是不能养猫。
        //第3种方法能养所有品种的猫，但是不能养狗。

        //四个动物集合。
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        //四个集合都可传入方法1
        keepPet1(list1);
        keepPet1(list2);
        keepPet1(list3);
        keepPet1(list4);

        //只有两个狗集合能传入方法2
        //keepPet2(list1);
        //keepPet2(list2);
        keepPet2(list3);
        keepPet2(list4);

        //只有两个猫集合能传入方法3
        keepPet3(list1);
        keepPet3(list2);
        //keepPet3(list3);
        //keepPet3(list4);
    }

    //第1种方法能养所有的动物，但是不能传递其他类型.
    //所以传参为ArrayList<? extends Animal>，即泛型为Animal和Animal的子类。
    public static void keepPet1(ArrayList<? extends Animal> list) {
        //遍历集合，调用动物的eat方法。
    }

    //第2种方法能养所有品种的狗，但是不能养猫。
    //所以传参为ArrayList<? extends Dog>，即泛型为Dog和Dog的子类。
    public static void keepPet2(ArrayList<? extends Dog> list) {
        //遍历集合，调用动物的eat方法。
    }

    //第3种方法能养所有品种的猫，但是不能养狗。
    //所以传参为ArrayList<? extends Cat>，即泛型为Cat和Cat的子类。
    public static void keepPet3(ArrayList<? extends Cat> list) {
        //遍历集合，调用动物的eat方法。
    }
}
