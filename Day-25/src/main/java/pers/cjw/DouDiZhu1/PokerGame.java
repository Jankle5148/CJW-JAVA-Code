package pers.cjw.DouDiZhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    // 牌堆，存每一张牌。
    static ArrayList<String> list = new ArrayList<>();

    // 静态代码块：特点：随着类的加载而在加载，而且只加载一次。（因为初始化牌堆这个过程只需要进行一次，没必要单独写一个方法）
    static {
        String[] color = {"♦", "♣", "♥", "♠"};//花色
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};//数字

        //将每一张卡加入牌堆。包括所有数字牌和大小王。
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }


    public PokerGame() {
        //1.洗牌：打乱牌堆
        Collections.shuffle(list);

        //2.lord为地主牌堆，三个玩家一人一个牌堆
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //3.遍历牌堆list进行发牌
        for (int i = 0; i < list.size(); ++i) {
            String poker = list.get(i);

            //先发三张地主牌。i=0/1/2
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            //地主牌已经发完，现在给三个玩家轮流发牌：利用取模来轮流发牌。
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }


        //4.看地主牌，以及每个人的牌是什么。
        lookPoker("地主牌", lord);
        lookPoker("钢脑壳", player1);
        lookPoker("大帅比", player2);
        lookPoker("蛋筒", player3);

    }

    //看牌方法：传参1为玩家名字（用于打印），传参2为他的牌堆。
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }


}
