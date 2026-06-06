package pers.cjw.object.drawcircle;

public class Circle {
    int radius;//半径
    double perimeter;//周长
    double area;//面积

    public Circle() {
    }//无参构造，new一个空圆

    public Circle(int radius) {
        this.radius = radius;
    }//有参构造，new一个半径r的圆

    public void setRadius(int radius) {
        this.radius = radius;
    }//修改半径

    public int getRadius() {
        return this.radius;
    }

    public double getPerimeter() {
        this.perimeter = 2 * this.radius * Math.PI;
        return this.perimeter;
    }

    public double getArea() {
        this.area = this.radius * this.radius * Math.PI;
        return area;
    }

    //真正的圆画圆的方法：改变自己的半径r，成为半径为r的圆
    public void draw(int radius) {
        this.radius = radius;
    }


}
