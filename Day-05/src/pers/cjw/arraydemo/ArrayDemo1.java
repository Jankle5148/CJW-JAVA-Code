package pers.cjw.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //定义数组格式：
        // 1.数据类型[] 数组名 = new 数组类型[num]；
        // 2.数据类型 数组名[] = new 数组类型[num]；
        // 3.最完整格式：数据类型[] 数组名 = new 数组类型[num]{......}；
        //最好用1和3，和c++区别开。
        int[] a = {11, 22, 33};
        double[] b = {11.1, 22.2, 33.3};
        String[] c = {"hhh", "hello", "world"};
        for (int i = 0; i < 3; ++i) {
            System.out.println(a[i]);
        }

        //输出数组地址的方法：直接sout数组名
        System.out.println("数组a的地址为：" + a);
        //这里三条语句分别输出了三个数组的地址
        //如数组a的地址：[I@3b07d329
        //[：这是一个数组
        //I：数组类型为int
        //@：分隔符
        //3b07d329：16进制数组地址

        //a.length数组长度
        System.out.println("数组a的长度为：" + a.length);
    }
}
