package pers.cjw.a02myhashmap;

import java.util.*;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {

        //例题：某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,
        //每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

        //1.定义String一个数组，存储4个景点。
        String[] arr = {"A", "B", "C", "D"};

        //2.利用随机数模拟80个同学的投票，并把投票的结果（景点名）存储在集合list（投票箱）中。
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //3.统计票数：如果统计的东西比较多，比如此题的80个。
        // 可以定义map集合，利用集合进行统计。（将投票箱list进行统计，记录在hm上）
        // 键：景点名。值：想去该景点的人数。
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {

            //判断该键（景点）在map集合当中是否存在
            if (hm.containsKey(name)) {
                //如果存在，获取该键对应的值（想去该景点的人数），将该值加1
                int count = hm.get(name);
                ++count;
                //把新的键值对再次添加到集合当中，因为键相同，新的+1的人数就会覆盖旧的人数。
                hm.put(name, count);
            } else {
                //如果不存在，直接添加，并将初始票数设置为1。
                hm.put(name, 1);
            }

        }

        //4.打印票数情况。
        System.out.println(hm);

        //5.求最大值（最多的地方有多少票）。
        // 思想：遍历键值对，得到每个键值对的值。找出里面最大的即可。
        int max = 0;//最大值初始化为0
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();//得到键值对的单列集合
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();//得到键值对的值，如果大就覆盖。
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);

        //6.判断哪个景点的次数跟最大值一样（哪个地方想去人最多）
        //思想：找到哪个键值对的值等于最大值即可。
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
