package pers.cjw.innerClassDemo3;

//student类，并且实现Swim接口，重写swimming方法
public class Student implements Swim {

    //重写抽象方法
    @Override
    public void swimming() {
        System.out.println("狗刨式...");

    }
}
