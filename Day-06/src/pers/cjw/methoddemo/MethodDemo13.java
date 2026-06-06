package pers.cjw.methoddemo;

public class MethodDemo13 {

    //如果一定要用值传递对实参进行修改呢？
    //因为方法值传递只对形参进行修改，那么将形参返回，之后再赋值给实参就可以了

    public static int change(int number) {
        number = 200;
        return number;
    }

    //main方法入栈
    public static void main(String[] args) {

        int number2=100;//number2入栈，进入栈里面的main方法
        System.out.println("调用change方法前："+number2);//输出main中的number2=100

        number2=change(number2);
        //change方法入栈，传进来的number2进入栈里面的change方法
        //此时改变的是change方法里面传进去的number2，而不是main方法里的number2。
        //change返回number=200，赋值给main方法里的number，main方法里的number=200。

        System.out.println("调用change方法后："+number2);
        //输出main中的number=200
    }
}
