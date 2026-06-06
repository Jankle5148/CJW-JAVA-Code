package pers.cjw.a03test;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {

        //班级里有N个学生。实现随机点名器。
        //学生属性:姓名，年龄，性别。
        //思路：将名单打乱，然后取第一个人即可。

        //1.定义集合，添加数据。
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");

        //2.打乱。
        Collections.shuffle(list);

        //3.取第一个人回答问题。
        String name = list.get(0);
        System.out.println(name);


    }
}
