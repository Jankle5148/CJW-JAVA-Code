package pers.cjw.interfaceDemo5;

public class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法method");
    }

//    实现接口的类，只要把强制重写的方法重写了就行，比如上面的method就是一定要重写的。

//    能重写接口内的static方法吗，既然都static静态了，这个方法就不会改变了。
//    所以静态方法不能被重写，相当于焊死在接口里了，实现接口的类只管用现成的方法即可。

//    类虽然不能重写静态方法，但是可以写一个和静态方法同名的方法，不需要加override
//    比如我在InterImpl写一个同名的show方法，此时有两个独立的show方法，而不是谁是谁的重写版。

    public static void show() {
        System.out.println("实现类自己的show方法");
    }

}
