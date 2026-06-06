package pers.cjw.ObjectOriented.inheritanceDemo6;

public class Cooker extends Employee {

    //厨师成员变量：工号、姓名、工资
    //厨师成员方法：工作(炒菜)，吃饭（吃米饭）

    public Cooker() {
        //厨师的无参构造隐藏的super()
    }

    public Cooker(String number, String name, int salary) {
        super(number, name, salary);
    }

    @Override
    public void work(){
        super.work();
        System.out.println("厨师"+super.getName()+"正在炒菜");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("厨师"+super.getName()+"正在吃米饭");
    }
}
