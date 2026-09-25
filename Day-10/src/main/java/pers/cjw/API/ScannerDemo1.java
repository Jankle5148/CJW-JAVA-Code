package pers.cjw.API;

import java.util.Scanner;//scanner这个类在java.util这个package里面，要调用，需要import

public class ScannerDemo1 {
    public static void main(String[] args) {

        //以scanner类举例
        Scanner sc = new Scanner(System.in);
        //scanner类的有参构造，查看文档，传入参数的类型是InputStream输入流
        int a = sc.nextInt();//不需要输入参数，返回值是int
        double b = sc.nextDouble();//不需要任何参数，返回值是double
    }
}
