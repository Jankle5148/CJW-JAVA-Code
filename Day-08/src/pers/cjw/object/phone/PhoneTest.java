package pers.cjw.object.phone;
//调用自己package下的类可以不用import导包，使用别的package的类需要导包
//比如要使用drawcircle package下的Circle类，就要用如下import方式导包
//import pers.cjw.object.drawcircle.Circle;包名+类名

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "苹果";
        p1.price = 4799.0;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        p1.call();
        p1.playGame();
    }
}
