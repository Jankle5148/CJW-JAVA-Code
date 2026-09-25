package pers.cjw.API.systemDemo;

public class SystemDemo5 {
    public static void main(String[] args) {

        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错。
        //2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错。
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类数组不仅可以拷贝给同类数组，还可以拷贝到父类数组，拷贝的是对象地址。

        Student s1 = new Student("ZhangSan", 23);
        Student s2 = new Student("LiSi", 24);
        Student s3 = new Student("WangWu", 25);

        //源学生集合
        Student[] arr1 = {s1, s2, s3};
        //一个学生集合
        Student[] arr2 = new Student[3];
        //一个人集合
        Person[] arr3 = new Person[3];

        //引用数据类型数组的拷贝，是将对象地址值进行拷贝
        //把arr1中对象的地址值赋值给arr2中
        System.arraycopy(arr1, 0, arr2, 0, 3);
        //把arr1中对象的地址值赋值给arr3中
        System.arraycopy(arr1, 0, arr3, 0, 3);

        //遍历数组arr2。打印他们的名字和年龄。没有问题，成功拷贝。
        for (int i = 0; i < arr2.length; i++) {
            Student stu = arr2[i];
            System.out.println(stu.getName() + "今年" + stu.getAge() + "岁");
        }

        System.out.println();

        //遍历数组arr3。打印他们的名字和年龄。没有问题，成功拷贝。
        for (int i = 0; i < arr3.length; i++) {
            Student stu = (Student) arr3[i];
            System.out.println(stu.getName() + "今年" + stu.getAge() + "岁");
        }
    }
}


class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
