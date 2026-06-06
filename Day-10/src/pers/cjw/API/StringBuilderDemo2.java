package pers.cjw.API;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程，即方法可以一直调用，直到不能调用为止，如果最后一个方法有返回值就接收，没返回值就不用。

        String cjw = "陈俊文真他妈帅";
        int len = cjw.substring(1).replace("他妈", "**").length();
        System.out.println(len);
        //cjw是string，可以调用string的substring方法
        //cjw.substring(1)的返回值还是string，所以还可以继续调用string下的replace方法
        //cjw.substring().replace())的返回值还是string，所以还可以继续调用string下的length()方法
        //cjw.substring(1).replace().length()返回值就是int了，再无方法可用，只能int变量接收。

        StringBuilder sb = new StringBuilder("cjw");
        sb.append("cht").append("cjh").append("cam").append("pmf");//上一demo的链式编程形式
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("cjw").append("cht").append("cjh");//甚至可以直接在定义的时候用，但是不推荐
        System.out.println(sb2.toString());

        //不要套太多，套太多可读性很差
    }
}
