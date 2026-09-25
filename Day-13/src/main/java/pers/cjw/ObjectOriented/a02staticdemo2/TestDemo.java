package pers.cjw.ObjectOriented.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试类，一般测试类就是测试javabean类和工具类是否有问题的，所以TestDemo要写main方法
        //现在测试ArrayUtil的两个方法是否正确

        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {2.3, 5.1, 4.7, 235.8};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);

        //工具类其实根本不需要创建对象，这也是为什么工具类把构造函数私有化。
        //因为就算工具类创造了工具1、工具2、工具3，这些工具都是一模一样的，方法完全一样。
        //不像javabean类，成员变量有差异。
        //所以创建工具类对象无实际意义，直接类名+方法即可。
        //又因为一个类必须要有一个构造函数，所以只好把构造函数私有化，让大家不要创建对象，直接用类即可。
        //并且工具类写好一次，在哪里都可以随时随地用，只需要import一下即可。
    }


}
