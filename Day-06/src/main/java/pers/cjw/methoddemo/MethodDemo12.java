package pers.cjw.methoddemo;

public class MethodDemo12 {

    //方法的值传递：传递的是参数的复制的值，对这个复制的值进行修改，不会影响到原参数本身
    public static void change(int number) {
        number = 200;
    }

    //main方法入栈
    public static void main(String[] args) {
        int number1 = 100;//number入栈，进入栈里面的main方法
        System.out.println("调用change方法前：" + number1);//输出main中的number=100

        change(number1);//change方法入栈，传进来的number进入栈里面的change方法
        //此时改变的是change方法里面传进去的number，而不是main方法里的number。
        //执行完方法，change带上里面number=200出栈。main方法里的number=100。

        System.out.println("调用change方法后：" + number1);//输出main中的number=100
        //所以值传递，只对传进去的形参操作，不操作真正的实参。
        //或者值传递顾名思义：我只要你的值，不要你，我只对要过来的值操作，不影响你

    }
}
