package pers.cjw.ObjectOriented.inheritanceDemo5;

public class Student extends Person{

    //student的无参构造
    public Student(){
        //前面说到，子类无论如何不能继承父类的构造函数
        //虽然不能继承，但是可以调用。
        //子类的构造方法看似什么都没有，其实隐藏调用了父类的无参构造
        //super()就代表父类的无参构造，在这里具体指的是person();
        //super()可以隐藏调用，当然也可以自己写上去。
        super();
        System.out.println("子类无参构造");
    }

    //student的有参构造
    public Student(String name,int age){
        //前面说到如果不写，默认还是调用父类的无参构造
        //这里需要调用父类的有参构造
        //所以是super(name,age);
        super(name,age);
        System.out.println("子类有参构造");


    }
}
