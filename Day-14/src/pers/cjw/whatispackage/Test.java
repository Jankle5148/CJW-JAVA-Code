package pers.cjw.whatispackage;

import pers.cjw.polymorphism.polymorphismDemo4.Animal;
import pers.cjw.polymorphism.polymorphismDemo1.Person;

public class Test {
    public static void main(String[] args) {
        //包就是文件夹，用于分类归纳不同功能java类
        //事实上一个类的全类名是:包名.类名
        //只不过每个类都写成全类名太麻烦，所以有如下规则：

        //（1）使用同一个包里的类时，不需要import导包，而且也不用写全类名
        Student s = new Student();

        //（2）使用java.lang里的类时，不需要import导包，而且也不用写全类名
        //比如string
        String str = "hhh";

        //（3）如果两个包有相同名字的类，不需要导包，在定义的时候写上全类名就行，这样才知道到底是哪个包里的
        //比如polymorphismDemo1和polymorphismDemo4都有person类，并且两个类我都需要创建对象
        Person p1 = new Person();//用demo1的人类创建出来的人
        pers.cjw.polymorphism.polymorphismDemo4.Person p2 = new pers.cjw.polymorphism.polymorphismDemo4.Person();//用demo4的人类创建出来的人

        //（4）其他情况都需要import导包，并且在import后面写全类名，比如import java.util.Scanner;
        //比如要用上一个项目的animal，需要导包import pers.cjw.polymorphism.polymorphismDemo4.Animal;
        Animal a = new Animal();

    }
}
