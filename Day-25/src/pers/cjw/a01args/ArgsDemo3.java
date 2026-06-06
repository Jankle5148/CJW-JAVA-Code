package pers.cjw.a01args;

public class ArgsDemo3 {
    public static void main(String[] args) {

        //在ArgsDemo2的基础上进行简化。
        //JDK5：可变参数。方法形参的个数是可以发生变化的，0 1 2 3 ...
        //在传递数据的时候，省的我们自己创建数组并添加元素了，JDK底层帮我们自动创建数组并添加元素了。
        //格式：属性类型...名字。比如：int...args（一定是3个点）

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
        //这样减少了一个创建数组的过程。
    }

    //底层：可变参数底层就是一个数组。只不过不需要我们自己创建，Java 会帮我们创建好。
    //int代表会传入若干int类型的数据，但不知道多少，这些数据以一个数组...args的形式传进去。
    public static int getSum(int... args) {
        //System.out.println(args);//打印的是 args数组 的地址[I@119d7047
        int sum = 0;
        //增强for循环遍历args中的每一个元素
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
