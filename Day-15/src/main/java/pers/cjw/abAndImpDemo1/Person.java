package pers.cjw.abAndImpDemo1;

public abstract class Person {

    //Person既然没有抽象方法，为什么还把他定义为抽象类？
    //其实这里把person定义为抽象类，是因为我暂时不想要创建人的对象，在当前情况下创建人的对象没有意义。
    //我们讨论的是运动员和教练，创建人当然可以是可以，但是没有必要。

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
}
