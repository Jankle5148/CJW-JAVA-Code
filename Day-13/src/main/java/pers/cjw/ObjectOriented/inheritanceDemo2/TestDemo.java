package pers.cjw.ObjectOriented.inheritanceDemo2;

public class TestDemo {
    public static void main(String[] args) {
        //现在有四种动物：布偶猫、中国梨花猫、哈士奇、泰迪。设计一套清晰的继承体系。
        //布偶猫：吃饭，喝水，抓老鼠。
        //中国狸花猫：吃饭，喝水，抓老鼠。
        //哈士奇：吃饭，喝水，看家，拆家。
        //泰迪：吃饭，喝水，看家，蹭一蹭。

        //动物类：包含猫类和狗类
        //猫类：包含布偶猫类和中国狸花猫类
        //狗类：包含哈士奇类和泰迪类

        RagDoll r1 = new RagDoll();
        r1.eat();
        r1.drink();
        r1.catchMouse();

        LiHua l1 = new LiHua();
        l1.eat();
        l1.drink();
        l1.catchMouse();

        Husky h1 = new Husky();
        h1.eat();
        h1.drink();
        h1.lookHome();
        h1.breakHome();

        Teddy t1 = new Teddy();
        t1.eat();
        t1.drink();
        t1.lookHome();
        t1.mob();

        //继承体系清晰，每个对象都可以调用各自的行为
        //并且增加代码的可复用性
        //java有一个最大的“祖宗类”Object，每个类都直接或间接继承它
    }
}
