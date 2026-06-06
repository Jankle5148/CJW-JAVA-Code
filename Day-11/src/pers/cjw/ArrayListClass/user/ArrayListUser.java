package pers.cjw.ArrayListClass.user;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUser {
    public static void main(String[] args) {
        //定义集合，添加3个用户对象。定义一个方法，根据id查找用户信息，存在返回true，不存在返回false
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("123456", "cjw", "123456");
        User u2 = new User("654321", "cht", "654321");
        User u3 = new User("13579", "cjh", "13579");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println("请输入你要查找的用户id：");
        String id = sc.next();
        System.out.println(checkId(list, id));//检查id是否存在
        System.out.println(getIndex(list, id));//返回id所在的用户的索引
    }

    //检查id是否存在，存在返回true，不存在返回false
    public static boolean checkId(ArrayList<User> list, String id) {
        return getIndex(list, id) >= 0;
    }

    //检查id是否存在，存在返回索引，不存在返回-1
    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
