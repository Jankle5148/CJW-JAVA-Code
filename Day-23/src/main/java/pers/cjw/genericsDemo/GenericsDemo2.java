package pers.cjw.genericsDemo;

public class GenericsDemo2 {
    public static void main(String[] args) {

        Box1<Integer> b1 = new Box1<>();
        //此时我们规定了泛型为Integer，底层将这个类中所有的E替换成这个泛型。
        // 那么此时Box<Integer>类就是
        //{
        //    private Integer item;
        //
        //    public void setItem(Integer item) {
        //        this.item = item;
        //    }
        //
        //    public Integer getItem() {
        //        return item;
        //    }
        //}
        //然后我们根据这样一个类创建了一个对象。
        //这样b1的成员变量item就是Integer类型的了，我们可以用整数对他进行设置和输出。
        b1.setItem(6);
        System.out.println(b1.getItem());

        //同样我们定义一个，泛型为String的box对象，同上，我们可以用字符串设置他的item。
        Box1<String> b2 = new Box1<>();
        b2.setItem("6");
        System.out.println(b2.getItem());

        //简单来说，只有泛型确定了，这个类才真正完整。
    }
}


//这是一个泛型类，这个E相当于一个“占位符”。
//当我们传入我们要的泛型后，它就将这个类中所有的E替换成这个泛型。
class Box1<E> {
    private E item;

    //2个泛型方法
    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }
}
