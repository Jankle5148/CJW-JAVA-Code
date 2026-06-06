package pers.cjw.a02myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_HashMapDemo1 {
    public static void main(String[] args) {

        //HashMap：使用哈希算法，计算 键 的哈希值，进行存储的Map。底层也是 哈希表=数组+链表+红黑树 实现。和HashSet的区别：是双列集合。
        //需求：创建一个HashMap集合，键：学生对象(Student)，值：籍贯(String)。
        //要求：同姓名，同年龄认为是同一个学生。
        //！！！！！！核心点：HashMap的 键 如果是自定义类对象，需要在该类中重写hashCode和equals方法！！！！！！！
        //hashCode：计算 键 的hash值。
        //equals：比较 键 是否一样，如果一样覆盖原键值对，不一样则挂载在该元素下面（键唯一，值可以不唯一）

        //重写hashCode和equals方法后，下面的步骤就平平无奇了。
        //1.创建HashMap的对象
        HashMap<Student, String> hm = new HashMap<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);

        //3.添加元素
        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");
        hm.put(s4, "山东");

        //4.遍历集合
        // （1）先得到键的单列集合，然后遍历键、键找值，一起打印。
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        //（2）或者遍历集合，得到键值对的单列集合，然后直接得到键和值，一起打印
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        //（3）或者lambda表达式
        hm.forEach((student, s) -> System.out.println(student + "=" + s));

    }
}
