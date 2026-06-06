package pers.cjw.ObjectOriented.inheritanceDemo6;

public class Employee {
    //建立标准的javabean类
    //经理成员变量：工号、姓名、工资、管理奖金
    //经理成员方法：工作(管理其他人)，吃饭（吃米饭）
    //厨师成员变量：工号、姓名、工资
    //厨师成员方法：工作(炒菜)，吃饭（吃米饭）

    private String number;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String number, String name, int salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工正在工作");
    }

    public void eat(){
        System.out.println("员工正在吃饭");
    }
}
