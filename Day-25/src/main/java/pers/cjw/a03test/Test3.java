package pers.cjw.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        //班级里有10个学生。随机点名，被点到的学生不会再被点到。
        //如果班级中所有的学生都点完了，则开启第下一轮点名。
        //思路：将点到的人，从未点名名单加入已点名名单。一轮之后，重置未点名名单，开启下一轮点名。

        //1.定义集合list1表示未被点名的学生，添加数据。
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");

        //2.创建一个临时集合list2，存已经点了的学生。
        ArrayList<String> list2 = new ArrayList<>();

        //外循环：表示第i轮点名
        for (int i = 1; i <= 10; i++) {
            System.out.println("当前为第" + i + "轮点名");

            //内循环：循环点遍每一位同学。
            Random r = new Random();//随即器
            for (int j = 0; j < list1.size(); j++) {
                int index = r.nextInt(list1.size());//获取一个list1的随机索引
                String name = list1.remove(index);//获取该索引的同学，并且将其移出list1。
                list2.add(name);//将该同学加入list2，表示该同学已被点过。
                System.out.println(name);
            }

            //运行到这，内层的for循环结束，此时表示一轮点名结束，所有同学都从list1到了list2。
            //于是将所有点过的学生重新放回list1，然后清空list2，准备开始下一轮点名。
            list1.addAll(list2);
            list2.clear();

        }
    }
}
