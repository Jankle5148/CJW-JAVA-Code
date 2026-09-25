package pers.cjw.arraydemo;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //已知数组【33，5，22，44，55】，打印最大值
        int[] array = {33, 5, 22, 44, 55};
        int max = array[0];//
        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println("数组的最大值是：" + max);
    }
}
