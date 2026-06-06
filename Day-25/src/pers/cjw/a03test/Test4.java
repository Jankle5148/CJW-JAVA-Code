package pers.cjw.a03test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        // 需求：定义一个Map集合。
        // 键：省份province，值：市city，但是一个省有很多个市。
        // 思路：集合的集合套娃。

        // 添加完毕后，遍历结果格式如下：
        // 江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
        // 湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        // 河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市

        // 1.创建Map集合，键类型为String（用来存省），值类型为String的集合（用来存市的集合）。
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        // 2.三个包含市区的集合。
        ArrayList<String> city1 = new ArrayList<>();
        city1.add("南京市");
        city1.add("扬州市");
        city1.add("苏州市");
        city1.add("无锡市");
        city1.add("常州市");

        ArrayList<String> city2 = new ArrayList<>();
        city2.add("武汉市");
        city2.add("孝感市");
        city2.add("十堰市");
        city2.add("宜昌市");
        city2.add("鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        city3.add("石家庄市");
        city3.add("唐山市");
        city3.add("邢台市");
        city3.add("保定市");
        city3.add("张家口市");

        // 3.将省份作为键，将该省的市区集合作为值，传入新的集合hm中。
        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        // 4.遍历并打印：
        // 将hm视为 键值对 的单列集合，返回一个都是键值对的集合entries。
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        // 对于entries中的每一个键值对：
        for (Map.Entry<String, ArrayList<String>> entry : entries) {

            // 获得键值对的键：省份。获得键值对的值：该省份的市区集合。
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();

            // 使用StringJoiner，规定字符串拼接格式：元素用逗号和空格分隔，并且无前缀或后缀。
            StringJoiner sj = new StringJoiner(", ", "", "");
            // 按格式，只拼接市区即可。
            for (String city : value) {
                sj.add(city);
            }
            // 打印：省份 + 市区字符串sj即可
            System.out.println(key + " = " + sj);

        }

    }
}
