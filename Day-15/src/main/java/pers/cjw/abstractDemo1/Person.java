package pers.cjw.abstractDemo1;

public abstract class Person {
    //只要存在抽象方法，这个类就是抽象类，要写abstract

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //人都要睡觉
    public void sleep() {
        System.out.println("睡觉");
    }


    public abstract void work();
//    抽象方法格式：写abstract，无大括号，有分号

//    抽象类不能实例化，不能创建对象（因为方法没被重写，无意义）；
//    抽象类不一定有抽象方法，但有抽象方法的类一定是抽象类。
//    （判断是否抽象类：不能实例化的类。（1）不能实例化的类有可能并没有抽象方法（2）有抽象方法的类一定不能实例化，所以一定是抽象类。
//    抽象类可以有构造方法。

//    抽象类的子类：必须重写父类中的所有抽象方法，才能进行实例化，否则依旧是抽象类。

//    既然子类一定要重写抽象类的方法，为什么不直接在子类里写单独的方法？
//    这是为了开发规范，开发者可以直接看父类的抽象方法，
//    他就知道此父类的所有子类一定都具有、并且最终都会重写这个的方法。并且返回类型一样、名字一样，代码比较规范。

}
