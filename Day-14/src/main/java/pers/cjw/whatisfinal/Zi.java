package pers.cjw.whatisfinal;

//final修饰Zi，表示Zi不可被继承，是最终子类
public final class Zi extends Fu{
    public Zi() {
    }

    public Zi(String name, int age) {
        super(name, age);
    }
    //因为父类的show是非private方法，是虚方法，可以被子类继承
    //现在子类已经继承了show方法，只是没写出来
    //但是因为show方法有final，所以子类不可以重写show
    //如果重写会报错：'show()' 无法重写 'whatisfinal.Fu' 中的 'show()'；重写的方法为 final
}
