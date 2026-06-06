package pers.cjw.object.whatsprivate;

public class Student {

    //private修饰符，将变量或方法变成类私有的，别的类不可访问，只有本类可访问
    private String name;//名字是私人的

    int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void setScore(int score) {
        this.score = score;
    }
}
