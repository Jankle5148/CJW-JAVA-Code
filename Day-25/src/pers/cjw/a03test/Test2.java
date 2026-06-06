package pers.cjw.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        //班级里有N个学生，要求：70%的概率随机到男生，30%的概率随机到女生。
        //男生："范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰",
        //女生："杜琦燕","袁明媛","李猜","田蜜蜜",

        //男生8个，女生4个，如果只是直接从12个人随机抽人，做不到男70%，女30%。
        //于是思路是：将另外一个东西的概率定为70%，只要中了这70%就去抽男生，不中就去抽女生。
        //比如设置10个数，7个1，3个0，那么抽到1的概率是70%。

        //1.创建集合，添加数据。其中1和0的数量比为7：3
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);//先加入七个1
        Collections.addAll(list, 0, 0, 0);//再加入3个0

        //2.打乱list集合中的数据，0和1混乱放置。
        Collections.shuffle(list);

        //3.创建两个集合分别存储男生和女生的名字.
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");

        //4.从list集合中随机位置抽取一个数 number。
        //如果number = 1，从 boyList 里面随机抽取1人。如果number = 0，从 girlList 里面随机抽取1人
        Random r = new Random();//随机器
        int index = r.nextInt(list.size());//得到一个随机索引
        int number = list.get(index);//得到该索引上的数，是0还是1。
        if (number == 1) {
            int boyIndex = r.nextInt(boyList.size());//得到一个boyList的随机索引
            String name = boyList.get(boyIndex);//得到该索引上的人
            System.out.println(name);
        } else {
            int girlIndex = r.nextInt(girlList.size());//得到一个girlList的随机索引
            String name = girlList.get(girlIndex);//得到该索引上的人
            System.out.println(name);
        }

    }
}
