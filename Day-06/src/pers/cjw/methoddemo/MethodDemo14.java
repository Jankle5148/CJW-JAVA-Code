package pers.cjw.methoddemo;

public class MethodDemo14 {

    //方法的引用传递：传进来的是参数的地址，直接对地址对应的参数进行修改，会改变参数本身
    public static void change(int[] arr) {
        arr[0] = 200;
    }

    //main方法入栈
    public static void main(String[] args) {
        int[] arr = {100, 200, 300};
        //数组{100，200，300}入堆，arr为数组的堆地址
        //arr入栈，进入栈中的main方法里

        System.out.println("调用change方法前：" + arr[0]);
        //根据堆地址arr找到索引为0的元素输出arr[0]=10

        change(arr);
        //change方法入栈，arr进入栈中的change方法
        //根据传进来的arr地址，找到堆内存中索引为0的元素修改为arr[0]=100。
        //change中的arr堆地址没有被修改。
        //执行完方法，change带上形参arr出栈，main中的arr还是原堆地址。

        System.out.println("调用change方法后：" + arr[0]);
        //根据堆地址arr找到索引为0的元素输出，此时这个arr[0]=100
    }
}
