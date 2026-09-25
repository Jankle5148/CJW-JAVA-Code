package pers.cjw.objectproject.girlfriend;

public class CalculateGirlfriendAge {
    public static void main(String[] args) {
        Girlfriend[] girlfriends = new Girlfriend[4];
        Girlfriend g1 = new Girlfriend("?", 23, "吃饭");
        Girlfriend g2 = new Girlfriend("??", 18, "睡觉");
        Girlfriend g3 = new Girlfriend("???", 26, "打游戏");
        Girlfriend g4 = new Girlfriend("????", 30, "赚钱");

        girlfriends[0] = g1;
        girlfriends[1] = g2;
        girlfriends[2] = g3;
        girlfriends[3] = g4;

        int ageSum = 0;
        for (int i = 0; i < girlfriends.length; ++i) {
            ageSum += girlfriends[i].getAge();
        }//得到年龄总和

        int avgAge;
        avgAge = ageSum / girlfriends.length;
        System.out.println("女朋友们的平均年龄是：" + avgAge);//得到平均年龄

        int count = 0;
        for (int i = 0; i < girlfriends.length; ++i) {

            if (girlfriends[i].getAge() < avgAge) {
                ++count;
                System.out.println(girlfriends[i].getName() + "," + girlfriends[i].getAge() + "," + girlfriends[i].getHobby());
            }//统计有几个小于平均年龄，并输出信息
        }
        System.out.println("有" + count + "个女朋友小于平均年龄");
    }
}
