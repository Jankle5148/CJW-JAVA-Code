package pers.cjw.ObjectOriented.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    //学生工具类，这个工具类可以获取学生集合中的最大年龄

    //1.构造方法私有化
    private StudentUtil() {
    }

    //2.方法static化
    public static int getMaxAge(ArrayList<Student> arr) {
        int max = arr.get(0).getAge();
        for (int i = 0; i < arr.size(); ++i) {
            int age = arr.get(i).getAge();
            if (age > max) {
                max = age;
            }
        }//大，就覆盖
        return max;
    }
}
