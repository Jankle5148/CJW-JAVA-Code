package pers.cjw.API.objectDemo;

public class ObjectDemo2 {
    public static void main(String[] args) {

        // 创建两个学生对象
        Student s1 = new Student("itheima", 14);
        Student s2 = new Student("itheima", 14);

        // 比较两个对象是否相等
        System.out.println(s1 == s2);
        //发现返回false，因为对象用==比较的是地址值

        //调用equals方法比较
        //System.out.println(s1.equals(s2));
        //发现还是返回false。
        //查看Student类源码，发现并没有重写objects的equals方法，
        //默认的equals比较的还是地址值，还是返回false

        //于是在student类中重写equals。
        //重写很简单：在类中alt+ins，选择equals，然后无脑点击下一步即可
        //新的equals比较对象中的每个成员变量，全部相同才返回true。

        //重写后，再次调用equals
        System.out.println(s1.equals(s2));
        //此时返回true


    }
}
