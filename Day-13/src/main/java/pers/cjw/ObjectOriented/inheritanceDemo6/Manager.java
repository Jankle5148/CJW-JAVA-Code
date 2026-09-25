package pers.cjw.ObjectOriented.inheritanceDemo6;

public class Manager extends Employee {

    //经理成员变量：工号、姓名、工资、管理的奖金
    //经理成员方法：工作(管理其他人)，吃饭（吃米饭）
    private double bonus;

    public Manager() {
        //经理的无参构造隐藏的super()
    }

    public Manager(String number, String name, int salary, double bonus) {
        super(number, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("经理"+super.getName()+"正在管理其他人");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("经理"+super.getName()+"正在吃米饭");
    }
}
