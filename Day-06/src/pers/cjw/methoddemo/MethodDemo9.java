package pers.cjw.methoddemo;

public class MethodDemo9 {
    public static void main(String[] args) {
        //定义一个方法判断一个数组中一个数是否存在，存在返回true，不存在返回false
        int[] array = {11, 22, 33, 44, 55};
        System.out.println(ifExist(array, 22));
    }

    public static boolean ifExist(int[] array, int num) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == num) {
                return true;//循环判断，只要存在，就返回true
            }
        }
        return false;
    }
    //小知识，一个方法只要执行到了return，这个方法就立马结束，return后面的语句就没用了。所以for循环内不用写break
}

