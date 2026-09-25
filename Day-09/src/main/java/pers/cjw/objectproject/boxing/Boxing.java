package pers.cjw.objectproject.boxing;

public class Boxing {
    public static void main(String[] args) {
        //拳击比赛，两人回合对殴，初始血量为100，血量为0被ko
        Person p1 = new Person("乔峰", 100, '男');
        Person p2 = new Person("鸠摩智", 100, '女');

        System.out.println("比赛开始！");
        //占位符%s，python中学过，而且要用printf
        System.out.printf("1号选手是%s，性别%s，%s，当前还有%s点血。", p1.getName(), p1.getGender(), p1.getFace(), p1.getBlood());
        System.out.println();
        System.out.printf("2号选手是%s，性别%s，%s，当前还有%s点血。", p2.getName(), p2.getGender(), p2.getFace(), p2.getBlood());
        System.out.println();

        while (true) {
            p1.boxing(p2);
            if (p2.getBlood() == 0) {
                break;
            }
            p2.boxing(p1);
            if (p1.getBlood() == 0) {
                break;
            }
        }//循环对殴，直到有一人血量为0，退出循环比赛结束
    }
}
