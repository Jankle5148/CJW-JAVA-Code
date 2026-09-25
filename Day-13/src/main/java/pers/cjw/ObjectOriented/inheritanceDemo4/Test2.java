package pers.cjw.ObjectOriented.inheritanceDemo4;

public class Test2 {
    //成员方法的调用也是一样就近原则
    public static void main(String[] args) {
        Student s=new Student();
        s.lunch();
        s.eat();
        s.drink();
    }
}

class Person{
    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}

class Student extends Person{
    @Override
    public void eat(){
        System.out.println("吃牛排");
    }
    @Override
    public void drink(){
        System.out.println("喝冰美式");
    }//student不仅继承了person的eat和drink方法，同时自已也重写了eat和drink方法。
    //此时子类和父类有同名方法，调用时也遵循就近原则。

    public void lunch(){
        eat();//默认this.eat();所以调用本类的
        drink();//默认this.drink();所以调用本类的
        super.eat();//调用父类的。
        super.drink();//调用父类的。
        //结果：吃牛排、喝冰美式、吃饭、喝水
    }
}

//事实上从父类继承下来方法后，又自己编写同名的方法，就是方法的重写。
//一般因为父类的方法不一定满足子类的需求，于是子类需要重写这个方法。
//重写相当于覆盖了自己虚方法表里的方法，但并不影响父类虚方法表里的方法
//想要调用自己的，就用this，会到自己的虚方法表里调用。
//想要调用父类的，就用super，会到父类的虚方法表里调用。
//非常灵活。
//一般在子类重写的方法前放一个注解：@Override，
//这是一个“工具”，校验重写的方法格式是否正确，不正确@Override会报错

//方法的重写：
//如果是几乎推翻重写，那就老老实实写
//如果子类要重写的方法a，与从父类继承来的方法a前面的代码段是一样的，
//那么甚至可以在重写的时候，在子类的方法a里直接先super.a，调用父类a方法的代码段，然后再添加自己想要的内容
//节省时间，也提高代码可复用性