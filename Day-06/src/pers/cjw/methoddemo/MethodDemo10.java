package pers.cjw.methoddemo;

public class MethodDemo10 {
    public static void main(String[] args) {
        //定义一个方法copyOfRange，输入索引一from，输入索引二to，
        //将数组索引为from到to（包含from,不包含to）的元素放入新数组，返回新数组
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};//原始数组
        int[] newArray = copyOfRange(array, 3, 5);
        for (int i : newArray) {
            System.out.print(i + " ");
        }//增强for，输出新的数组
    }

    public static int[] copyOfRange(int[] array, int from, int to) {
        int[] newArray = new int[to - from];//先建立一个长度为to - from的数组
        if (from < 0 || to > array.length) {//代码健壮性：如果输入的from和to越界了，就返回一个全是0的数组，刚好可以返回没初始化的newArray，全是0
            return newArray;
        }
        for (int i = 0, j = from; i < newArray.length; ++i, ++j) {
            newArray[i] = array[j];//将原始数组to - from的元素转移到新数组里面
        }
        return newArray;
    }

}
