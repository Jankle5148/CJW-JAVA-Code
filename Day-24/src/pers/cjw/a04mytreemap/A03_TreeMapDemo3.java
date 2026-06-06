package pers.cjw.a04mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A03_TreeMapDemo3 {
    public static void main(String[] args) {

        // 需求：字符串“aababcabcdabcde”
        // 请统计字符串中每一个字符出现的次数，并按照以下格式输出。
        // 输出结果：a（5）b（4）c（3）d（2）e（1）
        // 思想：利用map集合进行统计。

        // 如果题目中，只要求统计次数，没有要求对结果进行排序，默认使用HashMap
        // 如果题目中，即要求统计次数，要求对结果进行排序，请使用TreeMap
        // 键：字符。值：字符出现次数。

        //1.定义字符串
        String s = "aababcabcdabcde";

        //2.创建集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //3.遍历字符串得到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {

            //获取当前字符
            char c = s.charAt(i);

            //判断集合中是否存在该字符
            if (tm.containsKey(c)) {
                //如果存在，获取该键对应的值（该字符出现次数），将该值加1
                int count = tm.get(c);
                ++count;
                //然后把 新的键值对 再次添加到集合当中，因为键相同，新的+1的次数 就会覆盖 旧的次数。
                tm.put(c, count);
            } else {
                //如果不存在，直接添加，并将初始次数设置为1。
                tm.put(c, 1);
            }
        }

        //4.遍历集合，并按照指定的格式进行拼接。可以使用以前学过的StringJoiner。
        StringJoiner sj = new StringJoiner("", "", "");

        //使用lambda表达式遍历:
        //先写匿名内部类
        //tm.forEach(new BiConsumer<Character, Integer>() {
        //    @Override
        //    public void accept(Character key, Integer value) {
        //        sj.add(key + "").add("(").add(value + "").add(")");
        //    }
        //});

        //然后进行简化成lambda表达式
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(") "));

        //将格式进行打印
        System.out.println(sj);


    }
}
