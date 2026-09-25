package pers.cjw.object.girlfriend;

public class GirlfriendTest {
    public static void main(String[] args) {
        //创建第一个女朋友
        Girlfriend gf1 = new Girlfriend();
        gf1.name = "?";
        gf1.age = 23;
        gf1.gender = "女";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.sleep();
        gf1.eat();
        gf1.game();

        //创建第二个女朋友
        Girlfriend gf2 = new Girlfriend();
        gf2.name = "??";
        gf2.age = 24;
        gf2.gender = "女";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.sleep();
        gf2.eat();
        gf2.game();
    }
}
