package pers.cjw.objectproject.car;

import java.util.Scanner;

public class SaveCars {
    public static void main(String[] args) {
        //定义数组存储三个汽车对象，汽车的属性通过键盘录入得来。
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; ++i) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入第%s辆车的品牌、价格和颜色：", i + 1);
            Car c = new Car(sc.next(), sc.nextDouble(), sc.next());
            cars[i] = c;
            //next()：接受字符串，但是遇到空格、回车会停止接收，所以空格后面的内容会留给下一个使用next()的变量。
            //nextLine：接受字符串，只有遇到回车才停止接收。
            //这里的next、nextDouble都不需要变量接收，因为返回的值本来就可以用作形参，不必多此一举
        }

        for (int i = 0; i < cars.length; ++i) {
            System.out.printf("第%s辆车的品牌是%s，价格是%s元，颜色为%s", i + 1, cars[i].getBrand(), cars[i].getPrice(), cars[i].getColor());
            System.out.println();
        }
    }
}
