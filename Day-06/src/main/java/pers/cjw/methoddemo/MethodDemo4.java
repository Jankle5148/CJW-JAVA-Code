package pers.cjw.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //比较两个长方形面积的大小
        int area1 = getArea(10, 30);
        int area2 = getArea(20, 20);
        if (area1 > area2) {
            System.out.println("第一个长方形面积更大");
        } else if (area1 < area2) {
            System.out.println("第二个长方形面积更大");
        }
    }

    public static int getArea(int len, int width) {
        return len * width;
    }
    //返回值是int类型
}
