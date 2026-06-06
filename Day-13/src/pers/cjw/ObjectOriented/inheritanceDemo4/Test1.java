package pers.cjw.ObjectOriented.inheritanceDemo4;

public class Test1 {
    public static void main(String[] args) {
        //成员变量的访问特点：就近原则，谁近用谁
        Zi z=new Zi();
        z.ziShow();
    }
}

class Fu{
    String name="cam" ;

}

class Zi extends Fu {
    String name="cjw";
    public void ziShow(){
        String name="ziShow";
        System.out.println(name);
        //当前有三个name，ziShow中的System.out.println(name)到底会访问哪一个name来打印？
        //就近原则：先在该语句的所在的局部位置找，找到name="ziShow"
        //如果没有ziShow向上在本类的成员变量找，也就是cjw
        //如果cjw也没有，就向上去它父类的成员变量里找，也就是cam

        //如果我就想用本类的name：cjw怎么办？
        //因为这个cjw是本类的成员变量，之前学过，加上一个this即可
        System.out.println(this.name);

        //如果我就想用父类的name：cam怎么办？
        //加上super关键字
        System.out.println(super.name);
    }
}