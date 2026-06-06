package pers.cjw.interfaceDemo1;

public interface Swim {

    //    Swim接口，有一个抽象方法swim，实现此接口的类必须对此方法进行重写，才能实现此方法
    public abstract void swim();

    //    与抽象类类似，既然类一定要重写接口的方法，为什么不直接在类里写单独的方法？
    //    这是为了开发规范，开发者可以直接看接口的抽象方法，
    //    他就知道此实现此接口的所有类一定都具有、并且最终都会重写这个的方法。并且返回类型一样、名字一样，代码比较规范。




}
