package pers.cjw.object.drawcircle;

import java.util.Scanner;

public class DrawCircle {
    public static void main(String[] args) {
        //人画圆，两个类:人类、圆类。如何抽象封装？
        //圆的属性有半径、周长、面积，和画圆的方法
        //为什么人画圆，画圆的方法不在人里，在圆里。
        //圆类自己有一个方法，改变自己的属性成为一个有半径的圆。
        //人只需要确定两个传参：（1）要让哪个圆自己画，（2）半径。
        //就可以调用这个圆里的这个方法，让他自己成为有半径的圆
        //人的方法drawCircle只是个套壳方法，圆的方法draw才是真方法

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入画家的名字：");
        String name = sc.next();
        System.out.print("请输入圆的半径：");
        int r = sc.nextInt();

        Person p1 = new Person(name);//有参构造一个name是小明的人p1
        Circle c1 = new Circle();//无参构造一个圆c1
        p1.drawCircle(c1, r);

        System.out.println("圆的半径是" + c1.getRadius());
        System.out.println("圆的周长是" + c1.getPerimeter());
        System.out.println("圆的面积是" + c1.getArea());


    }
}
