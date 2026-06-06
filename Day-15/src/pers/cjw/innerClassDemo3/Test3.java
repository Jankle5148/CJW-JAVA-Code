package pers.cjw.innerClassDemo3;

public class Test3 {
    public static void main(String[] args) {

        //匿名内部类最常见的使用场景就是：
        //传参只要求接口，所以不需要创建真正实现接口的类，而是定义一个“一次性的”实现了接口的匿名内部类对象作为传参即可。
        //goSwimming(s);传入一个会游泳的对象，就可以调用这个对象的游泳方法

        //1.第一种方法，创建会游泳的类，定义一个该类对象，然后传入。
        Student s1 = new Student();
        goSwimming(s1);//传入一个会游泳的对象，就可以调用这个对象的游泳方法


        //2.第二种方法：直接传递一个会游泳的匿名内部类对象。
        Swim s3 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("蝶泳...");
            }
        };
        goSwimming(s3);

        // 3.第三种方法: 就是第二种方法的缩写，直接一步到位。
        goSwimming(new Swim() {
            public void swimming() {
                System.out.println("大学生, 蛙泳...");
            }
        });

        goSwimming(new Swim() {
            public void swimming() {
                System.out.println("小学生, 自由泳...");
            }
        });

    }

    // 定义一个方法,模拟请一些人去游泳
    public static void goSwimming(Swim s) {
        s.swimming();
    }
}
