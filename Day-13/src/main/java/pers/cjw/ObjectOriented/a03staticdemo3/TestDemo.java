package pers.cjw.ObjectOriented.a03staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> arr1 = new ArrayList<>();
        Student s1 = new Student("cjw", 24, "男");
        Student s2 = new Student("cht", 15, "女");
        Student s3 = new Student("cjh", 11, "男");
        arr1.add(s1);
        arr1.add(s2);
        arr1.add(s3);

        int maxAge = StudentUtil.getMaxAge(arr1);
        System.out.println(maxAge);
    }
}
