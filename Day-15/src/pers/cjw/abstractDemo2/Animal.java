package pers.cjw.abstractDemo2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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

    //    所有动物的喝水方式一样，因此喝水方法不做抽象方法，大家共同继承，并且不重写
    public void drink() {
        System.out.println("动物在喝水");
    }

    //    吃东西方式不一样，因此吃做抽象方法，交给子类重写
    public abstract void eat();

}
