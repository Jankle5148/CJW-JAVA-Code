package pers.cjw.ObjectOriented.a01staticdemo1;

public class Student {
    //属性：姓名、年龄、性别、老师名字
    private String name;
    private int age;
    private String gender;
    public static String teacherName;
    //这里teacherName是public的，意味着外部可以不通过set get调用

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(this.name + "正在学习");
    }

    public void show() {
        System.out.println(this.name + "," + this.age + "," + this.gender+","+this.teacherName);
    }
}
