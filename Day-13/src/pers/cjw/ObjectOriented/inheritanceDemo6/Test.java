package pers.cjw.ObjectOriented.inheritanceDemo6;

public class Test {
    public static void main(String[] args) {
        //经理成员变量：工号、姓名、工资、管理奖金
        //经理成员方法：工作(管理其他人)，吃饭（吃米饭）
        //厨师成员变量：工号、姓名、工资
        //厨师成员方法：工作(炒菜)，吃饭（吃米饭）
        Manager m1 = new Manager("514863", "cjw", 10000, 1000000);
        Cooker c1 = new Cooker("338906", "cht", 100);


        System.out.println(m1.getName() + " " + m1.getNumber() + " " + m1.getSalary() + " " + m1.getBonus());
        m1.setSalary(50000);
        m1.setBonus(2000000);
        m1.eat();
        m1.work();

        System.out.println(c1.getName() + " " + c1.getNumber() + " " + c1.getSalary());
        c1.setSalary(5000);
        c1.eat();
        c1.work();
    }
}
