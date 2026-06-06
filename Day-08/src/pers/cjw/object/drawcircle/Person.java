package pers.cjw.object.drawcircle;

public class Person {
    String name;

    public Person() {
    }//无参构造，new一个空壳人

    public Person(String name) {
        this.name = name;
    }//有参构造，new一个名为name的人

    //人定义一个调用“圆画圆方法”的方法，是个套壳方法
    public void drawCircle(Circle circle, int radius) {
        circle.draw(radius);//调用圆画圆方法
        System.out.println(this.name + "画了一个半径为" + circle.radius + "的圆");
    }
}
