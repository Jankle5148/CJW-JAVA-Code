package pers.cjw.whatisfinal;

public class Fu {

    private String name;
    private int age;
    public final void show() {
        System.out.println("fu");
    }

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
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

}
