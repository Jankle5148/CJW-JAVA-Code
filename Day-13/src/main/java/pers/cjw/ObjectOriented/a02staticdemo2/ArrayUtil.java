package pers.cjw.ObjectOriented.a02staticdemo2;

public class ArrayUtil {
    //方法用static，变为静态方法
    //工具类：这个工具类可以做一些事情，其中包含各种定制的方法。
    //特点：（1）类名见名知意（2）构造方法private私有化（3）方法用static修饰

    //现在定义一个数组工具类：ArrayUtil
    //提供一个方法printArr，返回整数数组内容,形如[1,2,3,4]
    //提供一个方法getAverage，返回浮点数组平均值

    private ArrayUtil() {
    }
    //构造方法私有，说明外界不可以通过new构造一个ArrayUtil工具类对象

    public static String printArr(int[] arr) {//传入一维整型数组
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; ++i) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
