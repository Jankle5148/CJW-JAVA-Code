package pers.cjw.DouDiZhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    // 改进：doudizhu1中，牌堆只存牌本身。
    // 现在让牌堆不止存牌本身，还要存一下牌的序号。
    // 于是不使用list集合，而用map集合。
    // 键为牌的序号，值为牌本身。如 1，♦3 表示第一张牌为♦3。
    static HashMap<Integer, String> hm = new HashMap<>();

    // 用一个list单独存放序号1-52。
    static ArrayList<Integer> list = new ArrayList<>();

    // 静态代码块：特点：随着类的加载而在加载，而且只加载一次。（因为初始化牌堆这个过程只需要进行一次，没必要单独写一个方法）
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //序号从1开始
        int serialNumber = 1;

        //序号作为键，牌作为值，存入hm中，形成键值对。
        //再把序号单独加入list。
        //让序号+1，准备下一张牌。
        for (String c : color) {
            for (String n : number) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                ++serialNumber;
            }
        }

        //把大王加入两个集合
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        ++serialNumber;

        //把小王加入两个集合
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
        //小王不需要再++serialNumber了，已经是最后一张牌

    }


    public PokerGame() {

        // 1.洗牌:打乱牌堆的序号list。
        Collections.shuffle(list);

        // 2.地主牌set集合，三个玩家一人一个牌堆set集合。
        // 用来存放自己拿到的牌的序号。
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        // 3.将list中将已经打乱的牌的序号，依次发给地主牌和三个人。
        for (int i = 0; i < list.size(); ++i) {

            //得到牌堆当前牌的序号。
            int serialNumber = list.get(i);

            //地主牌拿到牌的序号。
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }

            //三个人依次得到若干个序号。
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }

        // 到这里，每个人拿到的都是序号，而不是真正的牌。
        // 只有看牌时，才会根据序号看到底拿到了什么牌。
        lookPoker("底牌", lord);
        lookPoker("钢脑壳", player1);
        lookPoker("大帅比", player2);
        lookPoker("蛋筒", player3);


    }

    //真正的看牌：参数一：玩家的名字。参数二：牌的序号集合。
    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ": ");
        //遍历该玩家的treeSet：根据序号，去真正的牌堆hm里面去找牌
        for (int serialNumber : ts) {
            //如果hm中有这个serialNumber，得到它对应的牌。
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }


}
