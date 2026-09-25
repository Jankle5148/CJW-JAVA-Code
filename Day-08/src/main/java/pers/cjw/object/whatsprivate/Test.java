package pers.cjw.object.whatsprivate;

public class Test {
    public static void main(String[] args) {

        Student sd1 = new Student("cjw", 95);//初始名字为cjw，分数95

        sd1.score = 98;//score没有private修饰，直接访问score
        System.out.println(sd1.score);

        //但sd1.name="cht";会报错
        //因为name是private的，除了student本类之外的类，都不能访问，只有本类中的其他变量和方法能访问

        sd1.setName("cht");
        //setName方法没有private，可以在别的类被访问，通过它修改名字

        //但想要输出名字System.out.println(sd1.name);会报错
        //同理：name是private的，别的都不能访问，只有本类中的其他变量和方法能访问

        sd1.getName();
        //name被private，想要输出怎么办，只能找到一条不被拦截的通路，一层一层调用
        //比如：setName方法没有private，可以在别的类被访问，又因为getName和name在同一个类中，所以getName可以访问name
        //那么访问name的方法就是先访问getName再访问name。

        //所以最好的办法就是将变量都private，然后对private变量设置可以让别的类来用的public方法，比如set、get方法
        //相当于不让外部类直接访问private变量，而是通过这些public方法来访问变量。
        //然后在方法里就可以根据外部类的行为来判断是否可以访问变量，比如输入的数值合理，才能set赋值，或者满足什么要求，你才能get值等等。
    }
}
