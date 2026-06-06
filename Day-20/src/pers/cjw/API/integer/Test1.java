package pers.cjw.API.integer;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        //Test1：键盘录入一些1~10日之间的整数，并添加到集合中。
        //直到集合中所有数据和超过200，不再添加。

        //1.创建一个集合用来添加整数。
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入数据
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();//获取输入的字符串

            int num = Integer.parseInt(numStr);//string转int，会把不符合int的数据先过滤掉

            //如果数不在1-100之间，提示，并跳过此次循环，此次输入作废
            if (num < 1 || num > 100) {
                System.out.println("当前数字不在1~100的范围当中，请重新输入");
                continue;
            }

            //添加到集合中
            //细节:集合里面的数据是Integer，但是添加数据是int，所以触发了自动装箱
            list.add(num);

            //统计此时集合中所有的数据和
            int sum = getSum(list);

            //对sum进行判断，如果过200，跳出整个循环
            if (sum > 200) {
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
