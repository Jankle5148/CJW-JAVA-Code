package pers.cjw.ObjectOriented.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {

        //1.第1个学生对象
        Student s1=new Student();
        s1.setName("cjw");
        s1.setAge(24);
        s1.setGender("男");
        //因为teacherName是public的，所以可以直接赋值
        s1.study();
        s1.show();
        //输出cjw,24,男,张老师

        //2.第2个学生对象
        Student s2=new Student();
        s2.setName("cht");
        s2.setAge(15);
        s2.setGender("女");
        s2.study();
        s2.show();
        //因为这里没有给cht的teacherName赋值
        //所以输出cht,15,女,null

        //如果一个班的学生，老师都是同一个，如果去一个个赋值，非常麻烦
        //能不能只赋值一次，然后让这个类都共享这个值
        //回到student类里，在teacherName前加上修饰符static，
        //被static修饰的成员变量：静态变量。他的值被这个类所有的对象共享
        //加上static后：
        //（1）类名调用：可以直接Student.teacherName=。。。，这样之后所有的student对象共享这个值（推荐）
        //（2）对象名调用：给任意一个student对象的teacherName赋值，在此之后所有的student对象共享这个值
        //什么变量最好用static修饰：每一个对象可共享的、每一个对象都相同的。
        //内存中，静态变量优先于对象存在，在字节码文件加载到堆内存的时候就存在。画个图就知道

        //在这里直接将student类的teacherName设置为张老师，这样接下来所有的student对象共享这个值
        Student.teacherName ="张老师";

        //3.第3个学生对象
        Student s3=new Student();
        s3.setName("cjh");
        s3.setAge(11);
        s3.setGender("男");
        s3.study();
        s3.show();
        //cjh,11,男,张老师

        //4.第4个学生对象
        Student s4=new Student();
        s4.setName("cam");
        s4.setAge(53);
        s4.setGender("男");
        s4.study();
        s4.show();
        //cam,53,男,张老师
        //可以看到，最开始给s1赋值了“张老师”，但在之后也变成null了。
        //说明是在Student.teacherName ="张老师"之后的所有对象会共享这个值，并且之前的值会变成null
        //！！！！！！所以要想大家都共享，在一开头就要写好。！！！！！！！！

    }
}
