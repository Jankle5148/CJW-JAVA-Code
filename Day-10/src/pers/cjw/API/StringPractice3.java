package pers.cjw.API;

import java.util.Random;
import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
//        //打乱一个字符串，有很多种思路
//        //我的思路：使用一个temp任意交换字符串中的两个字符，然后循环字符串的长度次
//
//        Random r = new Random();
//        String str = "beir的功能whfub2符号表示4igf9ultuk返回覆盖";
//        char[] arr = str.toCharArray();//得到字符的字符串数组
//
//        for (int i = 0; i < arr.length; i++) {
//            int a = r.nextInt(arr.length);//随机生成索引1
//            int b = r.nextInt(arr.length);//随机生成索引2
//            //交换这两位
//            char temp;
//            temp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = temp;
//        }
//
//        String str2 = new String(arr);
//        System.out.println(str2);

        Scanner in = new Scanner(System.in);


        //取第3位到末尾
        String str1 = in.nextLine();
        String str2 = str1.substring(2, str1.length());
        System.out.println(str2);


        //字符串转字符数组
        char[] ch = str2.toCharArray();

        int num = ch.length;
        int sum = 0;
        for (int i = 0; i < num; ++i) {
            if ((int) ch[i] >= 0 && (int) ch[i] <= 9) {
                sum += ((int) ch[i]) * Math.pow(16, num - (i + 1));
            } else {
                sum += ((int) ch[i] - 55) * Math.pow(16, num - (i + 1));
            }
        }

        System.out.println(sum);

    }

}

