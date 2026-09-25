package pers.cjw.privilege;

public class Test {
    public static void main(String[] args) {
        //权限修饰符：public、private、protected、不写

        //是否可访问       同类中       同包不同类        不同包下的子类       不同包下的无关类
        //private          可
        //不写              可           可
        //protected        可           可                可
        //public           可           可                可                 可

        //作用范围：private < 不写 < protected < public
        //一旦别人不能用，想要用就必须要使用get、set方法
        //private：只能自己用
        //不写：只能自己家（包）的用
        //protected：可以自己家（包）用，也可以在外的家人（子类）用
        //public：谁都可以用

        //实际开发最常用：private和public
        //成员变量：private
        //成员方法：public，包括构造函数、get、set方法、其他方法

    }
}
