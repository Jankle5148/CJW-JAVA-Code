package pers.cjw.whatisfinal;

public class Test {
    public static void main(String[] args) {
        //final关键字：
        //（1）final修饰方法：此方法为最终方法，不可被重写
        //（2）final修饰类：此类最终类，不可被继承
        //（3）final修饰变量：变为常量
        //注意final关键字与private、public等并不冲突，可以同时写
        //什么时候用final？
        //（1）此类就是最终子类。
        //（2）此方法为规则，他的子类都要遵循此规则
        //（3）此变量为不可修改的常量。
        Zi z1 = new Zi();
        z1.show();

        //final修饰变量：将其变为常量
        //比如PI的值不可随意更改，定为final
        // 小tips：常量的命名：
        //（1）单个单词：全大写
        //（2）多个单词：全大写+下划线

        //（1）基本类型常量:变量值为常量，不可更改
        final double PI = 3.14;
        System.out.println(PI);

        //（2）引用数据常量：变量存放的地址为常量，不可更改,
        final Zi Z2=new Zi("cjw",24);
        System.out.println(Z2);
        //但对象空间的成员变量是可以改变的
        Z2.setName("cht");
        Z2.setAge(15);
        System.out.println(Z2.getName()+" "+Z2.getAge());//cht 15

        //数组也是引用类型数据，因为有new
        //如果final，表示数组里的值不更改
        final int[] ARR={1,2,3,4,5};
        //ARR这个变量存放数组地址，不可改变
        //比如此时ARR=new int[10];就会报错
        //但数组元素可以改变
        ARR[0]=10;
        ARR[1]=20;
        for (int i = 0; i < ARR.length; ++i) {
            System.out.println(ARR[i]);
        }//发现输出结果是改变了的

        //字符串是不可变的，但字符串内容可变
        //字符串也是引用数据
        //事实上字符串的底层实现，是一个final的byte数组,名字叫value。
        //也就是String类有这么一个成员变量private final byte[] value;
        //比如string str="abc",实际上是value={97，98，99}
        //因为value的值是数组地址，并且是final，所以value存放的地址值是不可变的。
        //并且value是private，且String类并无value的set、get方法，所以外部是无法访问value中的地址的。
        //这两个原因都导致了value不可变。
        //但是字符串内容是可变的，因为数组内元素还是可变的，所以改变数组元素以改变字符串内容。

        //使用final对case操作改写为常量形式，详见StudentSystem
    }
}

