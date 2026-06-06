package pers.cjw.abstractDemo1;

public class Student extends Person {
    public Student() {
    }

    //    这个子类的有参构造，实际上是调用了父类的有参构造（前面说过父类即使是抽象类也是可以有构造方法的）
    //    回忆super关键字
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
    //student是抽象类person的子类，因此对person的抽象方法work进行重写，记得写override注解
    //此时student不是抽象类了，可以实例化。

}
