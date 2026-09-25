package pers.cjw.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        sum(30, 40);
    }

    //定义一个方法，将输入的两个变量并求和
    public static void sum(int num1, int num2) {//num1,num2是形参。
        int result = num1 + num2;
        System.out.println(result);
    }
}
