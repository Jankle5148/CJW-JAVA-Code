package pers.cjw.ArrayListClass.phone;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPhone {
    public static void main(String[] args) {
        //定义集合，存三个手机对象。定义一个方法，将价格低于3000的手机信息返回
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        int price = 3000;
        ArrayList<Phone> resultList = getPhoneInfo(list, price);
        for (int i = 0; i < resultList.size(); i++) {
            System.out.printf("%s手机的价格为%s元，低于%s元", resultList.get(i).getBrand(), resultList.get(i).getPrice(), price);
            System.out.println();
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list, int price) {
        ArrayList<Phone> resultList = new ArrayList<>();
        //用一个集合，把满足条件的对象都装起来
        for (int i = 0; i < list.size(); ++i) {
            Phone p = list.get(i);
            if (p.getPrice() < price) {
                resultList.add(p);
            }
        }
        return resultList;
    }
}
