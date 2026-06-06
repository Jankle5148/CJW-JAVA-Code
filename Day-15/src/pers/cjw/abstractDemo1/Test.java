package pers.cjw.abstractDemo1;

public class Test {
    public static void main(String[] args) {

        //创建对象person，失败，因为person是抽象类，无法实例化
        //Person p = new Person();

        //student因为重写了person的所有抽象方法，因此不是抽象类，可以实例化
        Student s = new Student("zhangsan", 23);

        System.out.println(s.getName() + ", " + s.getAge());
    }

}
