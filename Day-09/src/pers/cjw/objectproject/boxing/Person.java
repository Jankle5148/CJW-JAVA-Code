package pers.cjw.objectproject.boxing;

import java.util.Random;

public class Person {
    private String name;
    private int blood;
    private char gender;
    private String face;

    //每个人都有两个面容库，根据性别来分配面容
    String[] maleFace = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] femaleFace = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};

    public Person() {
    }

    public Person(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);//根据gender来分配长相
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int temp = r.nextInt(maleFace.length);
            this.face = maleFace[temp];
        } else if (gender == '女') {
            int temp = r.nextInt(femaleFace.length);
            this.face = femaleFace[temp];
        } else {
            this.face = "不堪入目";
        }
    }

    public void boxing(Person person) {
        Random r = new Random();
        int causeBlood = r.nextInt(20) + 1;
        if (person.blood - causeBlood > 0) {
            person.blood = person.blood - causeBlood;
            System.out.println("%s举起拳头打了%s一下，造成了%s点伤害，%s还剩下" + this.name + person.name + "" + causeBlood + "" + person.name + "" + person.blood + "点血。");
        } else {
            int temp = person.blood;
            person.blood = 0;
            System.out.println(this.name + "举起拳头打了" + person.name + "一下，造成了" + temp + "点伤害，" + person.name + "还剩下" + person.blood + "点血。");
            System.out.println("比赛结束，" + this.name + "KO了" + person.name + "。");
        }
    }
}